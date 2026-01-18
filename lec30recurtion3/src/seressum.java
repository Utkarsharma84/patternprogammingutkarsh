public class seressum {

    static int SeriesSum2(int n){

        if (n==0)return 0;
//        int ans=SeriesSum2(n-1);//mene khud socha
        if (n%2!=0){
//            return ans+n;
            return SeriesSum2(n-1)+n;

        }else {
//            return ans-n;
            return SeriesSum2(n-1)-n;
        }
    }


    static int seriessum1(int n){
        if (n==0)return 0;
        return seriessum1(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(SeriesSum2(10));
    }
}
