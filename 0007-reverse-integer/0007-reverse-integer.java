class Solution {
    public int reverse(int num) {
        long reverse = 0;
        if(num >= 0){
            
            while(num > 0){
                int rem = num%10;
                reverse = reverse*10 + rem;
                num = num/10;
            }
        }else{
            while(num < 0){
                int rem = num%10;
                reverse = reverse*10 + rem;
                num = num/10;
            }
        }
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)reverse;
        }
    }
}