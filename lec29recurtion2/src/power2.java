public class power2 {
    static int pow(int p,int q){
        if (q==0)return 1;
        int smallans=pow(p,q/2);
        if (q%2==0){
            return smallans*smallans;
        }else {
            return p*smallans*smallans;
             // yha hum direct return p*pow(p,q/2)*pow(p,q/2) kr skte the but time jyada lg rha hai function calling me
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(4,2));
    }
}

//if q is even  2^4 = 2^2  *  2^2  so the  ans is 8
//else if q is odd like 2^5 != 2^2 * 2^2 so then we extramultiply one p to currect the ans
