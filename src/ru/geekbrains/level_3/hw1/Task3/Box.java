package ru.geekbrains.level_3.hw1.Task3;



public class Box<T extends Fruit> {
    private float weight =0f;
    private String boxType = null;//попытался запоминать тип коробки, но не понял как

    public  void put(T  item)
    {
       weight+=item.getWeight();
        System.out.println("Weight of box: "+weight);
    }
    public boolean compare(Box<?> box)
    {
        if (this.weight==box.getWeight()) {
            System.out.println(true);   return true;
        }else System.out.println(true); return false;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void shift(Box<T> box)
    {
        this.weight=0;
        box.setWeight(box.getWeight()+this.weight);
        System.out.println("Weight of box 1: "+weight);
        System.out.println("Weight of box 2: "+box.getWeight());
    }


}
