import java.util.Arrays;

public class Code05_BSNearLeft {

    // 在arr上，找满足>=value的最左位置
    public static int nearestIndex(int[] arr, int value) {
        if (arr == null || arr.length ==0){
            return -1;
        }
        int L = 0;
        int R = arr.length -1;
        int index = -1; //记录每次二分找到的>=value的最左位置
        int mid = 0;

        //-67 -50 -37 -26 37
        while (L <= R){ //这里的等号必须要，二分到底
            mid = L + ((R-L)>>1);

            //右边一定大于等于value，去掉右边，>=value的最左位置一定在左边
            if (arr[mid] >= value){
                index = mid;
                R = mid-1; //这里也-1，不然死循环3

                //左边一定小于value，去掉左边，>=value的最左位置一定在右边
            }else {
                L = mid +1;
            }
        }

        return index;
    }


    public static int test(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= value) {
                return i;
            }
        }
        return -1;
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int testTime = 5000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            if (test(arr, value) != nearestIndex(arr, value)) {
                printArray(arr);
                System.out.println(value);
                System.out.println("正确答案："+test(arr, value));
                System.out.println("我的答案："+nearestIndex(arr, value));
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = {-66,-20,-15,7,58 };
        int value = 23;
        System.out.println(nearestIndex(arr, value));
    }

}
