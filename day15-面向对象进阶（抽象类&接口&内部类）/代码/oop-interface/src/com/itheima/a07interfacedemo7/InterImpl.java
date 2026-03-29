package com.itheima.a07interfacedemo7;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
    }

    //不叫重写
    public static void show() {
        System.out.println("InterImpl重写的抽象方法");
    }

}
