import java.util.Scanner;

public class advance{
   public static  int toggalbits (int n){
       int numbits=Integer.toBinaryString(n).length();
       int mask=(1<<numbits)-1;
       return n^mask;
   }
            public static void main (String[] args)
            {
                Scanner sc =  new Scanner(System.in);
                System.out.println("enter a positive integer ");
                int n = sc.nextInt();
                int result =toggalbits(n);
                System.out.println("toggal value "+result);
                sc.close();
        }



}