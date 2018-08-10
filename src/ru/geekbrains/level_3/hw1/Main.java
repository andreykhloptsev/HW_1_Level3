package ru.geekbrains.level_3.hw1;

public class Main {
    final static int SIZE=10;

    public static void main(String[] args) {
        String[] stringArray = new String[SIZE];
        for (int i = 0; i <SIZE ; i++) {
            stringArray[i]= Integer.toString(i);
            System.out.print(stringArray[i]+" ");
        }
        System.out.println();
        stringArray=changeElements(stringArray,2,5);
        for (int i = 0; i <SIZE ; i++) {
            System.out.print(stringArray[i]+" ");
        }
    }

    public static  <T> T[] changeElements(T[] array,int index1, int index2){
        T temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
        return array;
    }


}
