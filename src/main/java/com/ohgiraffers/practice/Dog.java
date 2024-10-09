package com.ohgiraffers.practice;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void speak(){
        System.out.println("멍멍 !");
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("종 : " +breed);
    }

}
