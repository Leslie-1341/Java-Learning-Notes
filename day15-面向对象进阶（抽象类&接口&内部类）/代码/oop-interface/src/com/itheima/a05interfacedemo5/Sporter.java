package com.itheima.a05interfacedemo5;

public abstract class Sporter extends Person{

    public Sporter() {
    }

    public Sporter(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
