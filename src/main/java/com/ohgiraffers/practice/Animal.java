package com.ohgiraffers.practice;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Animal speak");
    }
    public void printInfo(){
        System.out.println("이름 : " + name+", 나이 : "+ age);
    }
}
