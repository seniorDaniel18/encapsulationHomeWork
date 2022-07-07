package com.company;

public class Fish {

    String name;
    String breed;
    String color;
    int age;
    int height;
    int weight;

    void setName(String fishName){
        name = fishName;
    }
    void setBreed(String fishBreed){
        breed = fishBreed;
    }
    void setColor(String fishColor){
        color = fishColor;
    }
    void setAge(int fishAge){
        age = fishAge;
    }
    void setHeight(int fishHeight){
        height = fishHeight;
    }
    void setWeight(int fishWeight){
        weight = fishWeight;
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
