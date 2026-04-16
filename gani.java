public class gani {
    public static void main(String[] args) {

        String t ="gani";
        String l = "gfani";

        gani obj = new gani();
        System.out.println(obj.isGani(t, l));
    
    }
    public boolean isGani(String t,String l){
        int m = t.length();
        int n = l.length();
        int count[]=new int[26];

        if(m!=n){
            return false;
        }else{
            for(int i=0;i<m;i++){
                count[t.charAt(i)]++;
            }
            for(int i=0;i<m;i++){
                count[l.charAt(i)]++;
            }
            for(int i=0;i<n;i++){
                if(count[i]!=0){
                    return false;
                }
            }
            return true;
        }
    }
}
