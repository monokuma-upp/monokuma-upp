package day06;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        /*
         int[] b = new int[6]; //0,0,0,0,0,0
        //a：原数组
        //2：原数组的起始下标
        //b:目标数组
        //3：目标数组的起始下标
        //2：要复制的元素长度
        System.arraycopy(a,2,b,3,2);
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
         */

        //a:原数组
        //b:目标数组
        //---若目标数组大于原数组长度，则末尾补默认值
        //---若目标数组小于原数组长度，则将末尾的截掉
        int[] b = Arrays.copyOf(a,6);
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
