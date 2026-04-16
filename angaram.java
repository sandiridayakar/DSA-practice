class angaram{
    public static void main(String[] args) {
        
        String m="hari";
        String n="riha";
        angaram obj = new angaram();
        System.out.println(obj.isAnagram(m, n));

    }
    public boolean isAnagram(String m,String n){
        
        int count[] = new int[26];
        int t = m.length();
        int l = n.length(); 

        
        if (t!=l)
            return false;
        else
            for(int i=0;i<t;i++){
                count[m.charAt(i)-'a']++;
            }
            for(int i=0;i<t;i++){
                count[n.charAt(i)-'a']--;
            }
            for(int i = 0;i<count.length;i++){
                if(count[i]!=0){
                        return false;
                }
            }
            return true;
    }
}