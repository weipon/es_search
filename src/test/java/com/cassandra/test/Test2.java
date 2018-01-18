package com.cassandra.test;


import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weipon on 17/3/14.
 */
public class Test2 {

    public static void main(String[] args) {


        BackCategory a1=new BackCategory();
        a1.setId(1001l);
        a1.setName("一级目录A");
        a1.setLev(1);
        a1.setParentId(null);

        BackCategory a11=new BackCategory();
        a11.setId(1001001l);
        a11.setName("二级目录AA");
        a11.setLev(2);
        a11.setParentId(1001l);



        BackCategory a123=new BackCategory();
        List<BackCategory> Children123=new ArrayList<>();
        a123.setId(1001001001l);
        a123.setName("三级目录AAA");
        a123.setLev(3);
        a123.setParentId(1001002l);
        Children123.add(a123);
        a11.setChildren(Children123);


        List<BackCategory> Children1=new ArrayList<>();
        Children1.add(a11);
        a1.setChildren(Children1);




        List<BackCategory> all=new ArrayList<>();


        all.add(a1);

        System.out.print(JSON.toJSONString(all));



    }

}
