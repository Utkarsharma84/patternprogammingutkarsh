import java.util.Scanner;

public class gcd {
//   static int ans=1;
//    static int gretestcommandivisor(int x,int y){
//        for (int j=1;j<Math.min(x,y);j++){
//            if (x%j==0&&y%j==0){
//            ans= j;
//        }
//     }
//     return ans;
//    } brutee force without recurtion
//
    static int igcd(int x,int y){
        while(x%y!=0){
            int rem =x%y;
            x=y;
            y=rem;
        }
        return y;
    }


    static int ogcd(int x,int y) {
        if (y == 0) return x;
        return ogcd( y, x%y);// x ki jagagh y dena hai is baar eculidian algorithm
    }
//    static int lcm(int x,int y){
//        if (y==0)return x;
//        return (x*y)/ogcd(y,x%y);
//    } for prectice
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
//        System.out.println(gretestcommandivisor(x,y));
//        System.out.println(igcd(x,y));
        System.out.println(ogcd(x,y));
//          System.out.println(lcm(x,y));
    }
}
