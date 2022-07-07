package com.company;

public class Cat {

    String name;
    String breed;
    String color;
    int age;
    int height;
    int weight;

    void setName(String catName){
        name = catName;
    }
    void setBreed(String catBreed){
        breed = catBreed;
    }
    void setColor(String catColor){
        color = catColor;
    }
    void setAge(int catAge){
        age = catAge;
    }
    void setHeight(int catHeight){
        height = catHeight;
    }
    void setWeight(int catWeight) {
        weight = catWeight;
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
