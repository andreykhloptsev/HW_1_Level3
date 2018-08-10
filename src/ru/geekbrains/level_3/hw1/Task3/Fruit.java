package ru.geekbrains.level_3.hw1.Task3;

public abstract class Fruit {
    private float weight;
    private boolean isInBox = false;

    public boolean isInBox() {
        return isInBox;
    }

    public void setInBox(boolean inBox) {
        isInBox = inBox;
    }

    public abstract float getWeight() ;



}




