class Solution {
    public void nextPermutation(int[] nums) {
        
        // int element = nums[nums.length-1];
        boolean flag = true;
        int index = 0;
        int element = 0;
        for(int i=nums.length-1; i>0; i--){
             element = nums[i];
            
            if(element <= nums[i-1]){
                element = nums[i-1];
            }else{
                
                element = nums[i-1];
                index = i-1;
                flag = false;
                break;
            }
        }
        if(flag){
             reverse(nums,0,nums.length-1);
        }
        else{
            for(int i=nums.length-1; i>=0; i--){
            if(nums[i] > element){
                swap(nums,i, index);
                break;
            }
        }
        //reversing:
        int start = index+1;
        int end = nums.length-1;
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
        }  
        
    }
    
     public void reverse(int[] nums,int start, int end){
         while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
             start++;
             end--;
         }
     }
    
    public void swap(int[] nums,int i, int index){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}