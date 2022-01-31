class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == 'z'){
                return arr[0];
            }
            if(arr[mid] == target && mid == arr.length-1){
                return arr[0];
            }
            if(target > arr[arr.length-1]){
                return arr[0];
            }
            else if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}