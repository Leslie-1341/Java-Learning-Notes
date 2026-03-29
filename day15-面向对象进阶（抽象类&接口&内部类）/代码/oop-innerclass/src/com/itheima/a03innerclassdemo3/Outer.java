package com.itheima.a03innerclassdemo3;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            //Outer.this 获取了外部类对象的地址值
            System.out.println(Outer.this.a);//10
            System.out.println(this.a); //20
            System.out.println(a); //30
        }
    }
}