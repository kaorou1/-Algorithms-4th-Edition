import java.util.Arrays;

public class Code03_InsertionSort {

    public static void insertionSort(int[] arr) {
        // 0~0 有序的
        // 0~i 想有序
        //外层控制第i个数进行插入操作，要操作到最后一位

        for (int i = 1; i < arr.length ; i++) {

            //第i个数和左边比，比左边小交换，一直到没数或者比左边大
            for (int j = i; j >0; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

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
        int testTime = 20000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            insertionSort(arr1);
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
