public class returnssq2 {
    static void printssq2(String s,String currans){
        if (s.length()==0){
            System.out.println(currans);
            return;
        }
        char curr = s.charAt(0);
        String remstring = s.substring(1);
        printssq2(remstring,currans+curr);// add curr
        printssq2(remstring,currans);//withut add curr
    }
    public static void main(String[] args) {
        printssq2("abc", "");
    }
}
