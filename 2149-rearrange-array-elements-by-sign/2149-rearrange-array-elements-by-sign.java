class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0){
                positive.add(nums[i]);
            }else{
                negative.add(nums[i]);
            }
        }
        int posIndex = 0;
        int negIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = positive.get(posIndex);
                posIndex += 1;
            }else{
                nums[i] = negative.get(negIndex);
                negIndex += 1;
            }
        }
        return nums;
    }
}