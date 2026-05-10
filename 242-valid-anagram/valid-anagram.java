class Solution {
    public boolean isAnagram(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        int[] count=new int[26];
        if(lenS==lenT){
            for(int i=0;i<lenS;i++){
                char ch = s.charAt(i);
                count[ch-'a']++;
            }
            for(int j=0;j<lenT;j++){
                char ch = t.charAt(j);
                count[ch-'a']--;
            }
        }else{
            return false;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}