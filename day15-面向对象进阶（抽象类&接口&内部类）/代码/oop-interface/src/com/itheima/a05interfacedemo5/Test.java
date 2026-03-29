package com.itheima.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        //创建运动员或教练的对象

        PingPangSporter pps = new PingPangSporter("刘诗雯",23);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.study();
        pps.speakEnglish();

    }
}
