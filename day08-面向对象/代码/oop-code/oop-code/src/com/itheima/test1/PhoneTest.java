package com.itheima.test1;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        //叫做给手机赋值
        p.brand = "小米";
        p.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);


        //调用手机中的方法即可
        p.call();
        p.playGame();


        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999;

        p2.call();
        p2.playGame();
    }
}
