import java.util.Arrays;

public class Code01_SelectionSort {

    //选择排序流程
    //0 - length-1 找最小，放0位置
    //1 - length-1 找最小，放1位置
    //2 - length-1 找最小，放2位置
    //length-2 - length-1 找最小，放length-2位置
    public static void selectionSort(int[] arr){

        //外层控制的是从哪个位置到N找最小
        //只用到arr.length-2的位置， arr.length-1是最后一位index                        int i = 0; i < arr.length-1; i++
        //但到arr.length-1也没有问题，只是会多操作一次最后一位，其实前面排完后最后一位不用排了    int i = 0; i < arr.length; i++
        for (int i = 0; i < arr.length-1; i++){
            int minIndex = i;

            //从i位置到最后，遍历找最小
            //必须比到arr.length-1，即最后一位
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            //交换最小值与i位置的数
            swap(arr, i, minIndex);
        }

//        for (int i = 0; i < arr.length - 1; i++) { // i ~ N-1
//            // 最小值在哪个位置上  i～n-1
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; j++) { // i ~ N-1 上找最小值的下标
//                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
//            }
//            swap(arr, i, minIndex);
//        }
    }

    public static void swap(int[] arr, int i, int j){
//        arr[i] = arr[i] ^ arr[j];
//        arr[j] = arr[i] ^ arr[j];
//        arr[i] = arr[i] ^ arr[j];

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    //for test
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
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            selectionSort(arr1);
            Arrays.sort(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2));
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

    }

//    public static void main(String[] args) {
//        int[] arr = generateRandomArray(5, 80);
//        System.out.println(Arrays.toString(arr));
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
}
