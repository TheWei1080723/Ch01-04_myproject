package com.thewei;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        Person p = new Person();
        p.hello();
//        p.weight = 66.5f;
//        p.height = 1.7f;
//        System.out.println(p.bmi());
        Person p2 = new Person("The Wei",66.5f, 1.7f);
        System.out.println(p2);

        int score = 88;
        System.out.println(score < 80 || score > 90);

//        int age = 33;
//        Integer age2 = 33;
//        age2.byteValue();
//
//        char c = 'A';
//        Character c2 = 'A';
//
//        byte b = 120;
//        float  wejght = 66.5f;
//        Float wejght2 = 66.5f;
//        wejght2.byteValue();
//
//        double height = 1.7;
//        boolean adult = true;
//        String name = "蔡志偉";
//        p.weight 66.5f;


    }
}
