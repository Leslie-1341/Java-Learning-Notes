package com.itheima.a06innerclassdemo6;

public class Test2 {

    //是一个没有名字的成员内部类
    Swim s = new Swim(){

        @Override
        public void swim() {
            System.out.println("重写之后游泳方法");
        }
    };



    public static void main(String[] args) {
        //回顾一下匿名内部类的格式
        /*
        *
        *           new 类/接口(){
        *               重写的方法;
        *           }
        *
        *
        * */


        //整体我们可以理解为Swim接口的实现类对象
        //接口多态
        Swim s = new Swim(){

            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        };

        //编译看左边，运行看右边的原则
        s.swim();



        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写之后游泳方法");
            }
        }.swim();






    }
}
