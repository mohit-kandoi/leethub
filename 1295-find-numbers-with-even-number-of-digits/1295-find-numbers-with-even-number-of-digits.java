class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for(int item : nums){
            
            int n = (int)(Math.log10(item))+1;
            if(n%2 == 0) count++;
            
        }
        return count;
        
    }
}