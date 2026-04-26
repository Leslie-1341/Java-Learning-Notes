/*
    需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
    最终效果为：131****9468
*/

import java.util.Scanner;

public class StringDemo {
        public static void main(String[] args) {
        //1.键盘录入一个手机号
        Scanner sc = new Scanner(System.in);
        long number;
        while (true) {
            System.out.println("请输入一个手机号");
            number = sc.nextLong();
            if (number >= 0 && number <= 19999999999L) {
                break;
            } else {
                System.out.println("手机号无效");
            }
        }

        public static String getPhoneNumber(long number) {
            //2.把手机号转换成字符串
            String numberStr = number + "";
            //3.把字符串当中的中间四位替换成****
            String result = numberStr.replace(numberStr.substring(3, 7), "****");
            //4.打印最终结果
            return result;
        }

}
