class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len = s.length();
        String rev = "";
        for(int i=len-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        if(s.equals(rev)){
            return true;
        }else{
            return false;
        }

    }
}