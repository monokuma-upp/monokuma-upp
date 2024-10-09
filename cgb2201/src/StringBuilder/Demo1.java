package StringBuilder;

public class Demo1 {
    public static void main(String[] args) {
        String num = "789";
        for(int i = 0; i < num.length(); i++){
            StringBuilder sb = new StringBuilder();//用来输出最后结果的可变字符串
            char ch = num.charAt(i);//首位字符
            StringBuilder sb2 = new StringBuilder(num);
            StringBuilder lastTwoIndex = sb2.deleteCharAt(i);//后面两位数
            sb.append(ch);
            sb.append(lastTwoIndex);
            sb.append(sb + " "); //这里输出了第一个三位数
            sb = new StringBuilder();
            lastTwoIndex.reverse();
            sb.append(ch);
            sb.append(lastTwoIndex);
            System.out.print(sb+ " ");
        }
    }
}
