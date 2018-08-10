package ru.geekbrains.level_3.hw1.Task3;


public class MainClassTask3 {

    public static void main(String[] args) {
        Apple apple1= new Apple();
        Apple apple2 = new Apple();
        Apple apple3= new Apple();
        Apple apple4 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Box<Fruit> box = new Box<>();
        Box<Apple> box1 = new Box<>();
        //если создавать коробку определенного типа то класть другой тип нельзя
        //как определять тип коробки по уже положенному не разобрался
        box.put(apple1);
        box.put(orange1);
        box1.put(orange2);



    }
}
