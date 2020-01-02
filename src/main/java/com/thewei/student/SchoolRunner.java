package com.thewei.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.println("Please enter student's name：");
        Scanner scanner = new Scanner(System.in);   //使用者輸入
        String name = scanner.next();               //next：將ENTER 前的資料回傳給 name
        System.out.println("Please enter student's english：");
        int english = scanner.nextInt();
        System.out.println("Please enter student's math：");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
    }
}
