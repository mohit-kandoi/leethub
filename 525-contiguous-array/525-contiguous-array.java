class Solution {
    public int findMaxLength(int[] nums) {
        
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int start = 0;
        int end = -1;
        int length = 0;
        map.put(sum, -1);

        for (int i=0; i< nums.length; i++){
            sum = sum + nums[i];
            if(map.containsKey(sum-target)){
                start = map.get(sum-target)+1;
                end = i;
                if(length < end-start+1){
                    length = end-start+1;
                }
            }
            if(map.containsKey(sum)){
                map.put(Integer.MIN_VALUE, i);
            }else{
                map.put(sum,i);
            }

        }
        if(end== -1){
            return length;
        }else{
           return length;
        }

        
    }
}