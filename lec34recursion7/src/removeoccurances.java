import java.util.Scanner;

public class removeoccurances {

    static String removeA2(String s){
        if (s.length()==0)return "";

        String smallans=removeA2(s.substring(1));
        char currchar=s.charAt(0);
        if (currchar!='a'){
            return currchar+smallans;
        }else {
            return smallans;
        }


//    static String removeA(String s,int idx){
//        if (idx==s.length())return "";
//
//        String smallans=removeA(s,idx+1);
//        char currchar=s.charAt(idx);
//        if (currchar!='a'){
//            return currchar+smallans;
//        }else {
//            return smallans;
//        }

//    static String remove(String s,int idx) {
//        if (idx == s.length()) return "";
//        if (s.charAt(idx) != 'a'){
//            System.out.print(s.charAt(idx)+" ");
//        }
//        return remove(s,idx+1);    myself but this type of code only print the value of string not return the string
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
//        System.out.print(removeA(s,0));
        System.out.print(removeA2(s));
    }
}






