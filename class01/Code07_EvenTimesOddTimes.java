public class Code07_EvenTimesOddTimes {

    // arr中，只有一种数，出现奇数次，其余出现偶数次
    public static void printOddTimesNum1(int[] arr){

        int eor = 0;
        for (int i : arr) {
            eor = eor ^ i;
        }

        System.out.println(eor);
    }

    //提取出最右的1
    public static int bit1counts(int N){
        System.out.println(N&(-N));

        return N&(~N+1);
    }

    // arr中，有两种数，出现奇数次, 其余偶数次
    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int i : arr) {
            eor = eor ^ i;
        }

        //eor = a^b;
        int rightOne = eor&(-eor);//找出最右1，说明最右1位置上，两个数一个1一个0
//        int res = rightOne;
//        //用rightOne再去全异或，会消掉最右1位置上为0的那个数
//        for (int i : arr) {
//            res = res ^ i;
//        }

        int temp = 0;
        //按照最右1位置上是否为1分组
        for (int i : arr) {
            if ((rightOne & i) != 0){
                //最右1位置上为1
                temp = temp ^ i;
            }
        }
        //最终拿到一个数a


        //此时res为temp^a
        System.out.println("一个数为"+(temp));
        System.out.println("另一个数为"+(eor^temp));
    }

    public static void main(String[] args) {
        printOddTimesNum1(new int[]{1, 1, 4, 3, 3, 4, 5,5,5, 6, 6, 6,6 });
        System.out.println(bit1counts(7));

        printOddTimesNum2(new int[]{1, 1, 4, 3, 3,3, 4, 5,5,5, 6, 6, 6,6 });

    }
}
