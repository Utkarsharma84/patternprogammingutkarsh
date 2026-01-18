import java.util.ArrayList;
import java.util.Collections;
public class question2 {
    public static void main(String[] args) {
        ArrayList<String>l1=new ArrayList<>();
        l1.add("wellcome");
        l1.add("to");
        l1.add("us");
        l1.add("world");
        System.out.println("orignal list"+l1);

        Collections.reverse(l1);
        System.out.println("reverse order"+l1);;

        Collections.sort(l1); // acsending order
        System.out.println("sorted list"+l1);

//        for decending order
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("decending order"+l1);




    }
}
