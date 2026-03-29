package com.itheima.a02interfacedemo2;


import java.util.Scanner;

/*
    成员变量
        只能是常量，默认修饰符：public static final
    构造方法
        没有
    成员方法
        只能是抽象方法，默认修饰符：public abstract
*/
public class Test {
    public static void main(String[] args) {

        //创建实现类对象并调用方法
        InterImpl ii = new InterImpl();
        ii.method();


        Scanner sc = new Scanner(System.in);
        sc.next();

    }
}