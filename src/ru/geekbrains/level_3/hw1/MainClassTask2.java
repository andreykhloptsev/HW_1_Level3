package ru.geekbrains.level_3.hw1;


import java.util.ArrayList;

public class MainClassTask2 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=(Integer)i;
        }
        ArrayList<Integer> integerArrayList = new ArrayList<>(arr.length);
        integerArrayList= arrayToArrayList(arr);
        System.out.println(integerArrayList);
    }


    public static  <T> ArrayList<T> arrayToArrayList(T[] array) {
        ArrayList<T> arrayList = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            arrayList.add(i, array[i]);
        }return arrayList;
    }



}
