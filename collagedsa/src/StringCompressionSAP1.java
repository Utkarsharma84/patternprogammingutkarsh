import java.util.HashMap;
import java.util.HashSet;

public class StringCompressionSAP1 {
    private static String compress(String str){
        int[] freq = new int[26];
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            freq[(int)(ch-'a')]++;
        }

        for(char ch1 : str.toCharArray()){
            char ch = Character.toLowerCase(ch1);
            if(set.contains(ch))continue;

            set.add(ch);
            sb.append(ch);
            sb.append(freq[(int)(ch-'a')]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(compress("aAaabbcccdddaa"));
    }
}
