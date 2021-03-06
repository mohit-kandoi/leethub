class Solution {
    public int removeElement(int[] nums, int val) {
        
        if(nums.length == 0) return 0;
        if(nums.length<2 && nums[0]==val) return 0;
         if(nums.length<2) return nums.length;
        
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}