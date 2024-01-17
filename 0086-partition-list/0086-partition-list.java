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
    public ListNode partition(ListNode head, int value) {
        
		if(head == null ||head.next == null) return head;
        return join(smaller(head,value),bigger(head,value));
  
    }
    public static ListNode smaller(ListNode head,int value){
        ListNode smallerHead = new ListNode(Integer.MAX_VALUE);
        ListNode smallerCur = smallerHead;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < value){
                smallerCur.next = new ListNode(temp.val);
                smallerCur = smallerCur.next;
            }
            temp = temp.next;
        }
				if(smallerHead.next == null){
					return smallerHead;
				}else{
					smallerHead = smallerHead.next;
          return smallerHead;
				}
        
    }
		public static ListNode bigger(ListNode head,int value){
        ListNode biggerHead = new ListNode(Integer.MIN_VALUE);
        ListNode biggerCur = biggerHead;
        ListNode temp = head;
        while(temp != null){
            if(temp.val >= value){
                biggerCur.next = new ListNode(temp.val);
                biggerCur = biggerCur.next;
            }
            temp = temp.next;
        }
        biggerHead = biggerHead.next;
        return biggerHead;
    }
		  public static ListNode join(ListNode smallerHead, ListNode biggerHead){
        if(smallerHead.val == Integer.MAX_VALUE) return biggerHead;
				ListNode temp = smallerHead;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = biggerHead;
        return smallerHead;
    }
}