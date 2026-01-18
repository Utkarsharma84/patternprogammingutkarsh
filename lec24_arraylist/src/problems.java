import java.util.ArrayList;

public class problems {
    public static void main(String[] args) {
        //wrapper class
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//        Float f = Float.valueOf(4.5f);
//        System.out.println(f);

        ArrayList <Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        System.out.println(l1);   // [5,6,7,8] output

//         get an element at index i
        System.out.println(l1.get(1)); //6

//         print with for loop
        for (int i=0;i<l1.size();i++) {
            System.out.println(l1.get(i) + " ");
        }

//            print the arraylist directly
            System.out.println(l1);

//       adding element at some index i
        l1.add(1,100);
        System.out.println(l1);

//        modifying element at index i
        l1.set(1,10);
        System.out.println(l1);

//   remove an element at index i
        l1.remove(1);
        System.out.println(l1);

//        removing an element at index i without indexing
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        System.out.println(  l1.remove(Integer.valueOf(7)));// for true snd false

//        cheking if an element is exist or not
        boolean ans = l1.contains(8);
        System.out.println(ans);

//        if you dont specify class you put anything inside l1
        ArrayList l = new ArrayList();
        l.add("lalu");
        l.add(84);
        l.add(true);
        System.out.println(l);


    }
}
