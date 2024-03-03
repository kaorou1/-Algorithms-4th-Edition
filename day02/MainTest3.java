import java.util.PriorityQueue;
import java.util.Queue;

public class MainTest3 {

    //"cmbchina" -> "na"
    //"aabcbccacbbcbaaba" -> "cccccbba"  cccccbba
    public static void main(String[] args) {
        System.out.println(maxDictionaryOrder("cmbchina"));

    }


    //"cmbchina" -> "na"
    //"aabcbccacbbcbaaba" -> "cccccbba"
    public static String maxDictionaryOrder (String s) {


        String ans = "";

        //小根堆
        PriorityQueue<Character> queue = new PriorityQueue<>();
        for (char aChar : s.toCharArray()) {

            while (((queue.peek()!=null)? queue.peek():'z') < aChar){
                queue.poll();
            }


            queue.add(aChar);
        }


//        while (index > s.length()-1){
//            index++;
//            int temp = 0;
//            Character cur = s.charAt(index);
//
//            if (cur.equals(maxChar)){
//                ans += cur;
//                ans.
//            }else {
//                ans+= cur;
//                temp = index;
//            }
//
//            if ()
//
//
//        }


//        while (index < s.length()-1){
//            index++;
//
//            if (s.charAt(index) <= maxChar){
//                ans = ans + s.charAt(index);
//            }
//
//        }

        while(queue.size()!=0){
            Character poll = queue.poll();
            ans = poll+ans;
        }

        System.out.println(ans);
//        int index = 0;
//        int index2 = 1;

//        while (index < s.length()-1){
//            char char1 = s.charAt(index);
//            char char2 = s.charAt(index2);
//
//            if (char1 >= char2){
//                index2++;
//            } else {
//                index++;
//                index2++;
//            }
//
//        }


        return ans;
    }

    /**
     * 获取所有的子序列
     * @param s
     * @return
     */
    public static String[] getAllsub(String s){
return null;
    }


}
