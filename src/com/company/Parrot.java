package com.company;

public class Parrot {

    String name;
    String breed;
    String color;
    int age;
    int height;
    int weight;

    void setName(String parrotName){
        name = parrotName;
    }
    void setBreed(String parrotBreed){
        breed = parrotBreed;
    }
    void setColor(String parrotColor){
        color = parrotColor;
    }
    void setAge(int parrotAge){
        age = parrotAge;
    }
    void setHeight(int parrotHeight){
        height = parrotHeight;
    }
    void setWeight(int parrotWeight){
        weight = parrotWeight;
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
