import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainTest5 {
    public static void main(String[] args) {
        System.out.println( evalRPN(new int[]{1,2,5,9,5,9,5,5,5}));

//        evalRPN(new String[]{"4","13","5","/","+"});
    }

    /**
     * 从左到右扫描后缀表达式，如果是数字，放入数字栈。
     * 如果是符号，从数字栈中弹出两个数字，第一个取出的数字为右运算数，第二个为左运算数，进行运算。
     */
    public static int evalRPN (int[] nums) {
        // write code here

        int candidate=-1;
        int count=0;
        for(int num:nums ){
            if(count==0){
                candidate=num;
                count=1;
            }else if(candidate==num){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        int length=nums.length;
        for(int num:nums){
            if(num==candidate){
                count++;
            }
        }

        return count*2>length?candidate:-1;
    }



}
