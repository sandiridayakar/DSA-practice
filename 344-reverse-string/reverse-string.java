class Solution {
    public void reverseString(char[] s) {
        //using stringBuilder approach
        StringBuilder rev = new StringBuilder();
        int len = s.length;
        for(int i=len-1;i>=0;i--){
            char l = s[i];
            rev.append(l);
        }
        for(int i=0;i<len;i++){
            s[i]=rev.charAt(i);
        }
    }
}