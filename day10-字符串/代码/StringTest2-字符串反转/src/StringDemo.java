/*	定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，
在控制台输出结果。例如，键盘录入 abc，输出结果 cba */
import java.util.Scanner;
public class StringDemo {
    public static void main(String[] args) {
        //1.定义一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.定义一个方法，反转字符串
        String result = reverse(str);
        System.out.println("反转后的字符串是：" + result);
    }

    //作用：反转字符串
    public static String reverse(String str){//abc
        //核心思想：倒着遍历并进行拼接
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //i 依次表示字符串里面的每一个索引（倒序）
            s = s + str.charAt(i);
        }
        //把倒着拼接之后的结果返回即可
        return s;
    }
}