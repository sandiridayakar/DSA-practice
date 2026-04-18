class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String revWord="";
        for(int i=words.length-1;i>=0;i--){
            revWord += words[i]+" ";
        }
        String rev=revWord.trim();
        return rev;
        
    }
}