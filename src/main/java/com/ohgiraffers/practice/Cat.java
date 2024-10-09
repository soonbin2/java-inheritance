package com.ohgiraffers.practice;

public class Cat extends Animal {
    private String breed;
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("냐옹 !");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("종 : " + breed);
    }

}
