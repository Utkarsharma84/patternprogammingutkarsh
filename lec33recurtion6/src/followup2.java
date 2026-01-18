public class followup2 {
    static boolean issorted(int a[],int idx){
        if (idx>=a.length-1){
            return true;
        }
        if (a[idx]>a[idx+1]){
            return false;
        }
        return issorted(a,idx+1);
    }

    static int lastIndexInArray(int a[], int target, int idx) {
        if (idx < 0) {
            return -1; //
        }
        if (a[idx] == target) {
            return idx;
        }
        return lastIndexInArray(a, target, idx - 1);
    }

    public static void main(String[] args) {
        int a[]={1,2,3,2,2};
        int target=2;
        //  System.out.println(issorted(a,0));
        System.out.println(lastIndexInArray(a,target,a.length-1));

    }
}
