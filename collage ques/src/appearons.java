public class appearons {
    static int appearone(int[] a){
       int n =a.length;

        for (int i =0;i<a.length;i++){
                 int ans =0;
            for (int j=0;j<a.length;j++){
                if (a[i]==a[j]) {
                    ans++;
                }
            }
            if(ans == 1) return a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a ={2,2,3,9,2,4,3,4};
        System.out.println(appearone(a));
    }
}
