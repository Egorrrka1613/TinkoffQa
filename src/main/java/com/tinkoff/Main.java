package com.tinkoff;

public class Main {
    public static void main(String[] args) {
        int[] mass = {8, 6, 3, 1, 7};
        thanosSort(mass);
    }

    public static int[] thanosSort(int[] mass) {

        int avg = 0; // среднее арфимитическое
        //boolean isSorted = false; // признак состояния сортировки массива
        int buffer; // переменная для хранения элемента массива

        for (int i = 0; i < mass.length; i++) {
            avg = avg + mass[i];
        }
        System.out.println(avg + " Сумма всех элементов");
        avg = avg / mass.length;
        System.out.println(avg + " Среднее арифметическое");

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println("Первый массив");

        int mass2[] = new int[mass.length];

        int elNumHigh = mass2.length; // переменная, сдержащяя крайнее значение элемента, в который
        int elNumLow = 0;
        // записываются элементы массива, которые больше сравниваемого знаения
        System.out.println(elNumHigh + " Количество элементов в mass2");

        for (int i = 0; i < mass.length; i++) {

            System.out.println(mass[i] + " Сравниваемый элемент");

            if (mass[i] <= avg) {
                mass2[elNumLow] = mass[i];
                ++elNumLow;
                System.out.println(mass2[i] + " Элемент масс2 номер " + i);
            } else {
                --elNumHigh;
                mass2[elNumHigh] = mass[i];
            }
        }

        for (int i = 0; i < mass2.length; i++) {
            System.out.print(mass2[i] + " ");
        }
        System.out.println("Второй массив");


        return mass;
    }
}
