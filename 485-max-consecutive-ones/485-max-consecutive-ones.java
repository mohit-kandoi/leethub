class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
         for(int i=0; i<nums.length; i++){
             if(nums[i] == 0){
                 nums[i] = -1;
             }
         }
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum > max) max = sum;
            if(nums[i] == -1){
                sum = 0;
            }
        }
        if(max < 0) return 0;
        return max;
    }
}