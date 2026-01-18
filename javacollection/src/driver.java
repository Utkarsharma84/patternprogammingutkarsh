import java
        .util.Arrays;

public class driver {
    public static void main(String[] args) {
        employee e1=new employee(100,"a",150,"ai",20);
        employee e2=new employee(101,"b",160,"cs",26);
        employee e3=new employee(105,"c",145,"cs",24);
        employee e4=new employee(103,"t",155,"ec",27);
        employee e5=new employee(106,"d",130,"sc",28);

        employee []arr={e1,e2,e3,e4,e5};
        System.out.println("before sorting");
        for (employee e : arr) {
            System.out.println(e);
        }
            Arrays.sort(arr);
            System.out.println("after sorting");
            for (employee e: arr){
                System.out.println(e);
        }
    }
}
