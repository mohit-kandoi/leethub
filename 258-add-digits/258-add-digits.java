class Solution {
    int sum = 0;
    public int addDigits(int num) {
        sum = num;
        while(sum > 9){
            num = sum;
            sum = 0;
            helper(num);
        }
        return sum;
        
    }
    
     void helper(int num){
         
         while(num > 0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
         }
         
     }
}