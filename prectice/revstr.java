public class revstr {
    static String rev(String s,int idx){
        if (idx>=s.length())return "";
        String smallans  = rev(s,idx+1);
        char curr = s.charAt(idx);
        return smallans+curr;

    }

    public static void main(String[] args) {
        String s = "abcd";

        System.out.println(rev(s,0));
    }
}
