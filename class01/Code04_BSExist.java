public class Code04_BSExist {

    public static boolean exist(int[] sortedArr, int num) {
        int L = 0;
        int R = sortedArr.length - 1;
        int mid = 0;

        while (L <= R){
            mid = L + ((R-L) >> 1);
            if (sortedArr[mid] == num){
                return true;
            } else if (sortedArr[mid] > num){
                R = mid - 1;
            } else if (sortedArr[mid] < num){
                L = mid + 1;
            }
        }
        return false;
    }
}
