public class MainTest2 {
    public static void main(String[] args) {
        System.out.println(countNum(2, 22, 2));
    }


    /**
     * 统计某个给定范围[L, R] 的所有整数中，数字x出现的次数，x的范围为[0,9]。
     * 比如L=2，R=22，x=2。
     * 数字2在数2中出现了1次，在数12中出现1次，在数20中出现1次，在数21中出现1次，在数22中出现2次，所以数字2在该范围内一共出现了6次。
     */
    public static int countNum (int L, int R, int x) {
        // write code here
        int ans = 0;
        for (int i = L; i <= R ; i++) {
            int num = i;
            String s = String.valueOf(num);
            char[] chars = s.toCharArray();
            for (Character aChar : chars) {
                if ((aChar+"").equals(x+"")){
                    ans++;
                }
            }
        }


        return ans;
    }
}
