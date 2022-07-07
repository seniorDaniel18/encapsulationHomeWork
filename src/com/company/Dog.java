package com.company;

public class Dog {

    String name;
    String breed;
    String color;
    int age;
    int height;
    int weight;

    void setName(String dogName){
        name = dogName;
    }
    void setBreed(String dogBreed){
        breed = dogBreed;
    }
    void setColor(String dogColor){
        color = dogColor;
    }
    void setAge(int dogAge){
        age = dogAge;
    }
    void setHeight(int dogHeight){
        height = dogHeight;
    }
    void setWeight(int dogWeight){
        weight = dogWeight;
    }

    String getName(){
        return name;
    }
    String getBreed(){
        return breed;
    }
    String getColor(){
        return color;
    }
    int getAge(){
        return age;
    }
    int getHeight(){
        return height;
    }
    int getWeight(){
        return weight;
    }

}
