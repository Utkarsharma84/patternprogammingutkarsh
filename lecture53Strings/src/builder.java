public class builder {
    public static void main(String[] args) {
        StringBuilder  str = new StringBuilder("hello");
       // str+="world"; wrong
        System.out.println(str);
        // hello to mello
        str.setCharAt(0,'m');
        System.out.println(str);
        str.append(" world");
        str.append( " "+10);
        System.out.println(str);
        str.insert(2,'h'); // insert
        System.out.println(str);
        str.deleteCharAt(2);          // delete
        System.out.println(str);


        str.reverse();
        System.out.println(str);

        str.delete(0,2);
        str.delete(7,13);
        System.out.println(str);



    }
}
