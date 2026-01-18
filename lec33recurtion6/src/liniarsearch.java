public class liniarsearch {


    static void findallindices(int a[],int target,int idx){
        if (idx>=a.length)return ; //base case
        if (a[idx]==target){  // self work
            System.out.println(idx);
        }
        findallindices(a,target,idx+1);// recursive work
    }

    static int findindex(int a[],int target,int idx){
        if (idx>=a.length)return -1;// base case
        if (a[idx]==target)return idx; // selfwork
        return findindex(a,target,idx+1); // recursive work

    }

    static boolean search(int a[],int target,int idx){
        //base case
        if (idx>=a.length)return false;
        //selfwork
        if(target==a[idx]) return true;
        // recursivework
        return search(a,target,idx+1);
    }
    public static void main(String[] args) {
//        int [] a = {1,2,4,6};
//        int target =4;

        int []a={1,2,3,2,2,5};
         int target =2;

        findallindices(a,target,0);

    //    System.out.println(findindex(a,target,0)); //find index
//        if (search(a,target,0)){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }
         //System.out.println(search(a,target,0));
    }
}
