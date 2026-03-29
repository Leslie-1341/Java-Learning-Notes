package com.itheima.test3;

public class GirlFriend {
    //属性
    private String name;
    private int age;
    private String gender;


    //针对于每一个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值

    //作用：给成员变量name进行赋值的
    public void setName(String name){
        //局部变量表示测试类中调用方法传递过来的数据
        //等号的左边：就表示成员位置的name
        this.name = name;
    }

    //作用：对外提供name属性的
    public String getName(){
        return name;
    }


    //age
    //setAge:给成员变量age进行赋值的
    //getAge：对外提供成员变量age的值
    public void setAge(int age){
        if(age >= 18 && age <= 50){
            this.age = age;
        }else{
            System.out.println("非法参数");
        }
    }

    public int getAge(){
        return age;
    }


    //gender
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }


    //行为
    public void sleep() {
        System.out.println("女朋友在睡觉");
    }

    public void eat() {
        System.out.println("女朋友在吃饭");
    }
}
