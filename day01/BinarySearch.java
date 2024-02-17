public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int index = -1;

        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] == target){
                index = mid;
                break;
            }else if (arr[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }

        }
        return index;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 18, 23, 34, 44, 87, 107};
        int target = 2222;

        System.out.println(binarySearch(arr, target));
    }


}
