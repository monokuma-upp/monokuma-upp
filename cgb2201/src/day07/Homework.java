package day07;
public class Homework {
    public static void main(String[] args) {
        say();
        sayHi("yby");
        sayHello("yby",24);
        System.out.println("随机1-100之间的一个数:" + getNum());
        int[] arr = {4,6,8,9,23,7};
        int[] num = oddEven(arr);
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        }

    //say hello
    public static void say(){
        System.out.println("你好Hello World");
    }

    public static void sayHi(String name){
        System.out.println("你好我的名字是: " + name + ",很高兴认识你");
    }

    public static void sayHello(String name, int age){
        System.out.println("你好我的名字是: " + name + ",今年我" + age + "岁了");
    }

    public static int getNum(){
        return (int)(Math.random()*100);
    }

    public static void findMaxNumber(int[] num){
        int max = num[0];
        for(int i = 1; i < num.length; i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println("数组最大值为:" + max);
    }

    //查找数组中的奇数和偶数,并返回一个偶数数组
    public static int[] oddEven(int[] array){
    //初始化两个数组粗存奇数和偶数
        int[] evenNum;
        //用计数器计算偶数的个数
        int evenCount =0;
        //遍历数组计算偶数有多少个
        for(int j = 0; j < array.length; j++){
            //判定每一个元素是奇数还是偶数
            if(array[j] %2 ==0){
                evenCount++;

            }
        }
        evenNum = new int[evenCount];
        for(int i = 0; i < array.length; i ++){
            if(array[i] %2 ==0){
                evenNum[i] = array[i];
            }
        }
        return evenNum;
    }
}
