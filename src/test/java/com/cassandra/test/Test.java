package com.cassandra.test;


import com.alibaba.fastjson.JSON;

/**
 * Created by weipon on 17/3/14.
 */
public class Test {

    public static void main(String[] args) {


        BackCategory a1=new BackCategory();
        a1.setId(1001l);
        a1.setName("一级目录A");
        a1.setLev(1);
        a1.setParentId(null);
        a1.setParents(null);



        BackCategory a12=new BackCategory();
        a12.setId(1001002l);
        a12.setName("二级目录AB");
        a12.setLev(2);
        a12.setParentId(1001l);
        a12.setParents(a1);

        BackCategory a123=new BackCategory();

        a123.setId(1001002001l);
        a123.setName("三级目录AB");
        a123.setLev(3);
        a123.setParentId(1001002l);

        a123.setParents(a12);





        System.out.print(JSON.toJSONString(a123));



    }

}
