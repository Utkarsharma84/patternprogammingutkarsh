package src;

public class keypadcombination {
     static  void combination(String dig,String[]kp, String res){  //253 -> kp[2]
       if (dig.length()==0){
           System.out.print(res+" ");
           return;
       }
        int currnum = dig.charAt(0)-'0';

       String choice  = kp[currnum];

        for (int i=0;i<choice.length();i++){
            combination(dig.substring(1),kp,res+choice.charAt(i));
        }
     }
    public static void main(String[] args) {
        String dig = "23";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        // index      0    1   2     3     4     6     7      8     9     10
        combination(dig,kp,"");
     }
}
