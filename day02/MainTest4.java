import java.util.HashMap;

public class MainTest4 {

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("google"));
    }

    public static int FirstNotRepeatingChar (String str) {
        // write code here
        if (str == null || "".equals(str)){
            return -1;
        }

        int[] ints = new int[128];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            ints[c]++;
        }


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (ints[c] == 1){
                return i;
            }
        }


        return -1;
    }
}
