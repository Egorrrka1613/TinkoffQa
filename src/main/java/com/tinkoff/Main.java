package com.tinkoff;

public class Main {
    public static void main(String[] args) {
        int[] mass = {8, 6, 3, 1, 7, 9, 11};
        thanosSort(mass);
    }

    public static int[] thanosSort(int[] massToSort) {
        int sum = 0;
        int iterationSort;

        for (iterationSort = 1; iterationSort < massToSort.length; iterationSort++) {


            //Складывем все элементы массива
            for (int i = 0; i < massToSort.length; i++) {
                sum += massToSort[i];
            }
            int avg = sum / massToSort.length;
            System.out.println(avg + " Среднее арифметическое");



            //Создаем вспомогательный массив
            int helpMass[] = new int[massToSort.length/iterationSort];
            System.out.println(helpMass.length + " Длина нового вспомогательного массива");
            int max = helpMass.length - 1;
            int min = 0;

            //Цикл для распределения значений по группам
            for (int i = 0; i < massToSort.length; i++) {
                if (massToSort[i] <= avg) {
                    helpMass[min] = massToSort[i];
                    ++min;
                } else {
                    helpMass[max] = massToSort[i];
                    --max;
                }
            }

            //Цикл для вывода значений второго массива
            printMass(helpMass);
            System.out.println(" Второй массив");

            //Присваиваем изначальному массиву отсортированные значения
            massToSort = helpMass;

            printMass(massToSort);
            System.out.println(" Первый массив, отсортированный");

            break;
        }

        return massToSort;
    }

    public static void printMass(int massToPrint[]) {
        for (int i = 0; i < massToPrint.length; i++) {
            System.out.print(massToPrint[i] + " ");
        }
    }
}
