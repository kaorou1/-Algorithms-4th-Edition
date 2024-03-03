import java.util.Arrays;

public class Jieyushui {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        System.out.println(trap2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public static int trap(int[] height){
        int pre[] = new int[height.length];//前缀最大值数组
        int sub[] = new int[height.length];//后缀最大值数组

        int pre_max = 0;
        for (int i = 0; i < height.length; i++) {
            if(height[i] > pre_max){
                pre_max = height[i];
            }
            pre[i] = pre_max;
        }

        int sub_max = 0;
        for(int i = height.length-1; i >= 0; i--){
            if(height[i] > sub_max){
                sub_max = height[i];
            }
            sub[i] = sub_max;
        }

        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(sub));

        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            int num0 = pre[i];
            int num1 = sub[i];

            ans += Math.min(pre[i], sub[i])-height[i];

        }

        return ans;
    }

    public static int trap2(int[] height){
        int ans = 0;
        int left = 0;
        int right = height.length-1;
        int pre_max = 0;
        int sub_max = 0;

        while(left<=right){
            pre_max = Math.max(height[left], pre_max);
            sub_max = Math.max(height[right], sub_max);

            //前缀大于后缀，则右边的能确定接多少水，右边扩展
            if (pre_max > sub_max){
                ans += sub_max - height[right];
                right--;
            }else {
                ans += pre_max -height[left];
                left++;
            }
        }


        return ans;
    }


}
