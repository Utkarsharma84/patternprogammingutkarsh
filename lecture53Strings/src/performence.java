public class performence {
    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i<=10;i++){
            str = str+1;
        }
        // "" "1" "12" "123" "1234"  and so on

        System.out.println(str);
    }
}
 // yha pr jo string hai vo baar baar bn rhi hai jo ki pure performance de rhi hai immutability ki wajah se isme n(n+1)/2 lg rhe hai