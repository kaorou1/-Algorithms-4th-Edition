public class Code06_BSAwesome {

    //局部最小值的位置
    //arr[0] < arr[1] -> 0
    //arr[n-2] > arr[n-1] -> n-1
    //中间位置  arr[i-1] > arr[i] < arr[i+1]  --> i
    //找出任意一局部最小值的位置
    public static int getLessIndex(int[] arr) {
        if (arr == null || arr.length == 0){
            return -1;
        }
        //先判断端点
        if (arr.length == 1 || arr[0] < arr[1]){
            return 0;
        }
        int n = arr.length;
        if (arr[n-2] > arr[n-1]){
            return n-1;
        }

        int index = 1;
        //arr[0] > arr[1] 下降
        //arr[n-2] < arr[n-1]  上升
        //中间必有转折，即局部最小值
        int L = 1;
        int R = n-2;

        while (L < R){ // 这里的等号？
            int mid = L + ((R-L)>>1);
            if (arr[mid] > arr[mid+1]){
                //右边下降，最后上升，右边一定存在局部最小值
                L= mid+1;
            }else if (arr[mid] > arr[mid-1]){
                //左边上升，最开始下降，左边一定存在局部最小值
                R= mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,7,8};
        System.out.println(getLessIndex(arr));
    }
}
