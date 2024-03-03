import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    /**
     * 数字0到9用字符串0到9表示，数字10用A表示，11用B表示，12用C表示，13用D表示，以此类推，35用Z表示，36用10表示。
     * 编写程序，输入一个数字，根据以上规则输出该数字对应的字符串。例如：输入数字8，输出字符串8；输入数字80，输出字符串28。
     * @param args
     */
    public static void main(String[] args) {
//        System.out.println(numToString(80));
        System.out.println(numToString2(80));
    }

    public static String numToString(int intValue) {
        // write code here
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = str.toCharArray();

        int shiwei = intValue/36;
        int gewei = intValue%36;

        List<String> res = new ArrayList<>();
//        res.add(gewei+"");
        res.add(String.valueOf(str.charAt(gewei)));
        while (shiwei > 36){
            shiwei = shiwei / 36;
            res.add(String.valueOf(str.charAt(shiwei)));
//            if (shiwei == 0){
//                res.add("0");
//            } else {
//                res.add(String.valueOf(str.charAt(shiwei)));
//            }
        }

        System.out.println(res);
        Collections.reverse(res);
        String ans = "";
        for (String re : res) {
            ans += re;
        }
        return ans;
    }


    public static String numToString2(int intValue) {
        String ans = "";
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (intValue > 0){
            int digit = intValue % 36;
            ans = str.charAt(digit) + ans;
            intValue /= 36;
        }
        return ans;
    }

}
