package com.itheima.a02abstractdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象



        Frog f = new Frog("小绿",1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.drink();
        f.eat();
    }

    
}
