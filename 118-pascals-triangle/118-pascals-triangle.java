class Solution {
    public List<List<Integer>> generate(int row) {
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=row; i++){
            List<Integer> innerlist = new ArrayList<>();
            for(int j=1; j<=i; j++){
                if(j==1){
                    innerlist.add(1);
                }
                if(j>1 && j<i){
                    List<Integer> temp = new ArrayList<>();
                    temp = list.get(i-2);
                    innerlist.add(temp.get(j-1)+temp.get(j-2));
                }
                if(j!=1 && j==i){
                    innerlist.add(1);
                }
            }
            list.add(innerlist);
        }
        return list;
    }
}