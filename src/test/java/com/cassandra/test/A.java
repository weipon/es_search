package com.cassandra.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class A extends B{

    public A(String a) {
        super(a);
        System.out.println("子类已经实例化");
    }

    @Override
    public void play() {
        System.out.println("我实现了父类的方法");
    }
    
    public static void main(String[] args) {
        //A aa=new A("a");
        RestaurantEntity backCategory=new RestaurantEntity();
        getFiledsInfo(backCategory);
    }

    private static List getFiledsInfo(RestaurantEntity o){
        Field[] fields=o.getClass().getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        List list = new ArrayList();
        for(int i=0;i<fields.length;i++){

           System.out.println(fields[i].getType().toString());
            System.out.println( fields[i].getName());

        }
        return list;
    }
}