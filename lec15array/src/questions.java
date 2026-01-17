import static java.util.Arrays.sort;
//total 5 questions

public class question {

    static int[] smallestandlargest(int arr[]){

        Arrays.sort(arr);
        int [] ans={arr[0],arr[arr.length-1]};
        return ans;


    }

    static boolean issorted(int arr[]) {
        boolean chek = true;
        for (int i = 1; i < arr.length; i++) {
//          agar i=0 rakhe to
//           arr[0]<arr[-1
            if (arr[i] < arr[i - 1]) {
            chek=false;
            break;
            }
        }
        return chek;

    }
    static int strictlygrater(int arr [], int x){
        int ans =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>x){
                ans++;
            }
        }
        return ans;
    }

    static int lastocurrence(int arr[],int x){
      int lastindex=-1;
      for (int i=0;i<arr.length;i++){
       if  ( arr[i]==x){
           lastindex=i;
       }
      }
      return lastindex;

    }


    static int countofoccurencce(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

       return count;
   }
}

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("'enter a size of array");
    int n =sc.nextInt();

    int arr[]= new int[n];
    System.out.println("enter " +n+ " elements");
    for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
   // System.out.println("enter x");
//    int x= sc.nextInt();

   // System.out.println("count of x: "+question.countofoccurencce(arr,x));


//    System.out.println("last occurence of x: "+question.lastocurrence(arr,x));
 //  System.out.println("grater element is: "+ question.strictlygrater(arr,x));
  // System.out.println("is sorted: "+question.issorted(arr));
  // int[] ans = question.smallestandlargest (arr);
    //System.out.println("smallest "+ans[0]);
   // System.out.println("largest "+ans[1]);
}
