/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
         ListNode l1 = head;
        ListNode l2 = reversedLinkedList(middle(head));
        while(true){
            if(l1 == l2 || l2==null) {
                l1.next = null;
                break;
            }
            ListNode l1next = l1.next;
            ListNode l2next = l2.next;
            l1.next = l2;
            l2.next = l1next;

            l1 = l1next;
            l2 = l2next;
        }
    }
    static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static ListNode reversedLinkedList(ListNode head){
        ListNode prev = head;
        ListNode cur = head.next;
        head.next = null;
        while(cur != null){
            ListNode nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }
        return prev;
    }
}