public class Binary {
    //打印二进制
    public static void main(String[] args) {
        printBinary(4);
        printBinary(-4);
    }

    public static void printBinary(int num){
        for (int i = 31; i >= 0; i--) {
//        for (int i = 0; i < 32; i++) { //反了
            System.out.print((num & (1<<i)) != 0 ? "1" : "0");
        }

        System.out.println();
    }

}
