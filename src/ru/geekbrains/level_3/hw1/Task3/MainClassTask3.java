package ru.geekbrains.level_3.hw1.Task3;


import java.util.ArrayList;

public class MainClassTask3 {

    public static void main(String[] args) {
        Apple apple1= new Apple();
        Apple apple2 = new Apple();
        Apple apple3= new Apple();
        Apple apple4 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Box<Apple> box = new Box<>();
        Box<Orange> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        //если создавать коробку определенного типа то класть другой тип нельзя
        //как определять тип коробки по уже положенному не разобрался
        box.put(apple1);
        box.put(apple2);
        box.put(apple1);
        box2.put(apple3);
        box1.put(orange1);
        box.shift(box2);
        box.compare(box1);




    }
}
