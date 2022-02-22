class Solution {
    public void sortColors(int[] nums) {
        
        //Optimized solution: O(N)
        
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }else{
                mid++;
            }
        }
          
        
       //Solution with O(2N); 
        
//         int zeroes = 0;
//         int ones = 0;
//         int twos = 0;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == 0) zeroes++;
//             else if(nums[i] == 1) ones++;
//             else twos++;
//         }
        
//         for(int i=0; i<nums.length; i++){
//             if(zeroes != 0){
//                 nums[i]=0;
//                 zeroes--;
//             } 
//             else if(ones != 0){
//                 nums[i] = 1;
//                 ones--;
//             }
//             else{
//                 nums[i] = 2;
//             }
//         }
        
    }
}