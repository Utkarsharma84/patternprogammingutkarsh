

public class subarraywithmaxproduct {
    public static int maxproduct(int nums[]){
        if(nums==null||nums.length==0)return 0;
        int maxpro=nums[0];
        int  minprod=nums[0];
        int rejult=nums[0];
        for (int i =1;i<nums.length;i++){
            int current = nums[i];
            //swap when negetive is encoutered
            int temp=maxpro;
            maxpro=minprod;
            minprod=temp;

            maxpro=Math.max(current,maxpro*current);
            minprod=Math.min(current,minprod*current);

            rejult =Math.max(rejult,maxpro);
        }
        return rejult;
    }
    public static void main(String[] args) {
        int arr[]={2,3,-3,4};
        System.out.println("maximum product subbarray");
        maxproduct(arr);
    }
}


//galat hai with the help of kadanse algo 