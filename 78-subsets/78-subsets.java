class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> each = new ArrayList<>();
        solve(res,each,0,nums);
        return res;
        
    }
    
    public void solve(List<List<Integer>> res, List<Integer> each, int pos, int[] nums){
        if(pos <= nums.length){
            res.add(each);
        }
        
        for(int i=pos; i<nums.length; i++){
            each.add(nums[i]);
            solve(res, new ArrayList<>(each),i+1,nums);
            each.remove(each.size()-1);
        }
        return;
    }
}