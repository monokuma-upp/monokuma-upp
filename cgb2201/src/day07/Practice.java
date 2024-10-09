package day07;

public class Practice {
    public static void main(String[] args) {
        int[] num = generate(8, 100);
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
    public static int[] generate(int length,int max){
       int[] arr = new int[length];
       for(int i= 0; i < arr.length; i++){
           arr[i] = (int)(Math.random() * (max + 1));
       }
       return arr;
    }
}
