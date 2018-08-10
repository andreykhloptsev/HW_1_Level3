package ru.geekbrains.level_3.hw1.Task3;


import java.util.ArrayList;

public class Box<T extends Fruit> {
    private float weight =0f;
    //private String boxType = null;//попытался запоминать тип коробки, но не понял как
    public ArrayList<Fruit> arrayList = new ArrayList<>();
    public  void put(T item)
    {
        if (!item.isInBox()) {
            weight += item.getWeight();
            System.out.println("Weight of box: " + weight);
            this.arrayList.add(item);
            item.setInBox(true);
        } else System.out.println("Фрукт уже содержится в коробке");
    }
    public boolean compare(Box<?> box)
    {
        if (this.weight==box.getWeight()) {
            System.out.println(true);   return true;
        }else System.out.println(false); return false;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void shift(Box<T> box)
    {
        box.setWeight(box.getWeight()+this.weight);
        this.weight=0;
        box.arrayList.addAll(arrayList);
        arrayList.clear();
        System.out.println("Weight of box 1: "+weight);
        System.out.println("Weight of box 2: "+box.getWeight());
        System.out.println(arrayList);
        System.out.println(box.arrayList);

    }


}
