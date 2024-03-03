import java.util.Arrays;

public class Code02_BubbleSort {

    public static void bubbleSort(int[] arr) {
        //n = arr.length
        //0 - n-1  左>右，两两交换
        //0 - n-2  左>右，两两交换
        //0 - n-3  左>右，两两交换
        //0 - 1  左>右，两两交换
        //外层控制开始位置
        for (int i = arr.length-1; i > 0; i--) {

            //内层控制从i到最后的交换
            for (int j = 0; j < i; j++) {
                //左>右，两两交换
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }

        }

    }

    // i和j是一个位置的话，会出错，全变成0
    // arr[i] = arr[j]， 没有问题
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];

//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
    }


    public static int[] generateRandomArray(int maxSize, int maxValue){

        // 随机数
        // Math.random()   [0,1)
        // N*Math.random()  [0,N)
        //(int) N*Math.random()  [0,N-1]
        // N*Math.random()+1  [1,N+1)
        //(int) N*Math.random()+1  [1,N]

        //数组长度也要随机 0-maxSize
        // Math.random()   [0,1)
        // maxSize+1 * Math.random()   [0,maxSize+1)
        //(int)((maxSize+1)*Math.random())  [0,maxSize]
        int[] arr = new int[(int)((maxSize+1)*Math.random())];

        // 值也为随机数  [-? , +?]
        for (int i=0; i < arr.length; i++){
            int num = (int)((maxValue+1)*Math.random()) - (int)((maxValue+1)*Math.random());
            arr[i] = num;
        }

        return arr;
    }

    // for test
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }


    public static void main(String[] args) {
        int testTime = 2000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            bubbleSort(arr1);
            Arrays.sort(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2));
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

//        int[] arr1 = generateRandomArray(5, 20);
//        int[] arr1 = {8, -2, -5, 10, 18};
//        int[] arr2 = copyArray(arr1);
//        bubbleSort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
    }
}
