class Main {
    public static void main(String[] args) {
        int [] originalArray = {1, 2, 3, 4, 5};
        int [] copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++){
            copiedArray[i] = originalArray[i];
        }
        System.out.print("copied Array: ");
        for (int element : copiedArray){
            System.out.print(element + " ");

        }
    }
}