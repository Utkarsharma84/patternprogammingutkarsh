public class removea {
    static String rev(String s,int idx){
        if (idx==s.length()) return"";
        String smallans = rev(s,idx+1);
        char curchar = s.charAt(idx);
        if (curchar!='a'){
            return curchar+smallans;
        }else return smallans;
    }
    public static void main(String[] args) {
        String s = "abcx";

        System.out.print(rev(s,0));
    }
}
//static String removeA(String s,int idx){
//        if (idx==s.length())return "";
//
//        String smallans=removeA(s,idx+1);
//        char currchar=s.charAt(idx);
//        if (currchar!='a'){
//            return currchar+smallans;
//        }else {
//            return smallans;
//        }