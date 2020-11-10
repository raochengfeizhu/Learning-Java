package com.oop.demo1;

import javax.xml.namespace.QName;
import java.sql.SQLOutput;
/*
Java Bean 类：封装数据用
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println("this name:"+'\n'+this.name+
                           "this age:"+'\n'+this.age);
    }
}
