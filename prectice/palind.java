public class palind {
    static boolean pal(String s,int r ,int l){
      if (r>=l)return true;
      return s.charAt(r)==s.charAt(l)&&pal(s,r+1,l-1);
    }
    public static void main(String[] args) {
        String s  = "abba";
        System.out.println(pal(s,0,s.length()-1));
    }
}
