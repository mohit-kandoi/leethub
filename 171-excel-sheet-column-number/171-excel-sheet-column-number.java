class Solution {
    public int titleToNumber(String s) {
        
        if(s == null) return -1;
        char[] ch = s.toCharArray();
        int i = 0;
        int ans = 0;
        while(i < ch.length){
            
            ans = ans*26;
            ans = ans + (ch[i]-'A'+1);
            i++;
        }
        return ans;
    }
}