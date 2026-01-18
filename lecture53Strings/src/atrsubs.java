public class atrsubs {

    static String st(String str){
         for (int i =0;i<=str.length();i++){
             for (int j = i+1;j<= str.length();j++)
            System.out.print(str.substring(i,j)+" ");
        }
         return str;
    }
    public static void main(String[] args) {
//        String str = "utkarsh";
//        System.out.println(str.substring(0,7));
//        System.out.println(str.substring(2));
        System.out.println(st("abcd"));
    }
}
