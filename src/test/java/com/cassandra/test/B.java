package com.cassandra.test;

abstract class B {
    protected String str;
    
    public B(String a) {
        System.out.println("父类已经实例化");
        this.str=a;
        System.out.println(str);
    }
    
    public abstract void play();
}