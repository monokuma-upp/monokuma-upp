package Dimension2;

public class demo1 {
    public static void main(String[] args) {
        //外循环控制的是二维数组的长度，其实就是一维数组的个数。
        //	内循环控制的是一维数组的长度。
        int[][] arr = new int[][]{{1,3,5}, {2,4},{3,7,4,8}};
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
