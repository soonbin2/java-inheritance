package com.ohgiraffers.practice;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog("호돌이",3,"골든리트리버");
        Cat cat = new Cat("까칠이", 2, "스핑크스");

        dog.printInfo();
        dog.speak();

        cat.printInfo();
        cat.speak();
    }
}
