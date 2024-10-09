package day07;

public class Location {
    public int row;
    public int coloum;
    public double maxValue;

    public Location(){

    }

    public static void locateLargest(double[][] a){
        //判断数组是否为空
        if(a == null){
            System.out.println("数组为空");
            return;
        }
        //判断数组里面是否有元素
        else if(a.length == 0){
            System.out.println("数组没有元素");
            return;
        }
        //寻找数组最大值,让最大值等于第一个元素,然后遍历循环
        else{
            Location l = new Location();
            l.maxValue = a[0][0];

            for(int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++){
                    if(a[i][j] > l.maxValue){
                        l.row = i;
                        l.coloum = j;
                        l.maxValue = a[i][j];
                    }
                }
            }
            System.out.println("the location of the largest is" + l.maxValue + "ar " + "(" + l.row + " " + l.coloum + ")");
        }
    }
}
