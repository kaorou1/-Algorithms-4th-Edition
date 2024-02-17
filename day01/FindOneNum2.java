import java.util.Arrays;

public class FindOneNum2 {
    //给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。

    public static void main(String[] args) {
//        int[] arr = {0,1,0,1,0,1,99};
        int[] arr = {-2,-2,1,1,4,1,4,4,-4,-2};


        System.out.println(find(arr));
    }

    /**
     * 使用一个长度为 32的数组 cnt[] 记录下所有数值的每一位共出现了多少次 1，再对数组的每一位进行 mod 3 操作，重新拼凑出只出现一次的数值。
     */
    public static int find(int[] arr){
        int[] cnt = new int[32];
        for (int num : arr) {

            for (int i = 0; i < 32; i++) {
                if ((num >> i & 1) == 1) {
                    cnt[i] = ++cnt[i];
                }
            }
        }

        int res= 0;
//        for (int i = 0; i < 32; i++) {
//
//                cnt[i] = cnt[i]%3 ;
////                res += cnt[i] * Math.pow(2, i);//负数会出问题
//
//        }

        //[0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]  =-4
        System.out.println(Arrays.toString(cnt));

        for (int i = 0; i < 32; i++) {
            if ((cnt[i] % 3 & 1) == 1) {//该为是1
                res += (1 << i);
            }
        }





        return res;
    }
}
