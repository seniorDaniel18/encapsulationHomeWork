package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.setName("Симба");
        cat.setBreed("Рагамаффин");
        cat.setColor("Белая");
        cat.setAge(10);
        cat.setHeight(40);
        cat.setWeight(5);

        System.out.println("у меня есть КОШКА");
        System.out.println("имя: " + cat.getName());
        System.out.println("вид: " + cat.getBreed());
        System.out.println("цвет: " + cat.getColor());
        System.out.println("возраст: " + cat.getAge() + "лет");
        System.out.println("рост: " + cat.getHeight() + "см");
        System.out.println("вес: " + cat.getWeight() + "кг");
        System.out.println("\n-----------");


        Dog dog = new Dog();

        dog.setName("Гарри");
        dog.setBreed("Акита-ину");
        dog.setColor("Рыжый");
        dog.setAge(15);
        dog.setHeight(70);
        dog.setWeight(55);

        System.out.println("у меня есть ПЁС");
        System.out.println("имя: " + dog.getName());
        System.out.println("вид: " + dog.getBreed());
        System.out.println("цвет: " + dog.getColor());
        System.out.println("возраст: " + dog.getAge() + "лет");
        System.out.println("рост: " + dog.getHeight() + "см");
        System.out.println("вес: " + dog.getWeight() + "кг");
        System.out.println("\n-----------");


        Parrot parrot = new Parrot();

        parrot.setName("Гагарин");
        parrot.setBreed("Какаду");
        parrot.setColor("Белый");
        parrot.setAge(3);
        parrot.setHeight(30);
        parrot.setWeight(2);

        System.out.println("у меня есть ПОПУГАЙ");
        System.out.println("имя: " + parrot.getName());
        System.out.println("вид: " + parrot.getBreed());
        System.out.println("цвет: " + parrot.getColor());
        System.out.println("возраст: " + parrot.getAge() + "года");
        System.out.println("рост: " + parrot.getHeight() + "см");
        System.out.println("вес: " + parrot.getWeight() + "кг");
        System.out.println("\n-----------");


        Fish fish = new Fish();

        fish.setName("Немо");
        fish.setBreed("Амфиприон");
        fish.setColor("Оранжево-белый");
        fish.setAge(5);
        fish.setHeight(10);
        fish.setWeight(3);

        System.out.println("у меня есть РЫБАКА");
        System.out.println("имя: " + fish.getName());
        System.out.println("вид: " + fish.getBreed());
        System.out.println("цвет: " + fish.getColor());
        System.out.println("возраст: " + fish.getAge() + "лет");
        System.out.println("рост: " + fish.getHeight() + "см");
        System.out.println("вес: " + fish.getWeight() + "кг");
        System.out.println("\n-----------");

    }
}