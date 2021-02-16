package com.tinkoff;

public class HomeWork {
    public static void main(String[] args) {
        String num = "+79879869899";
        checkNumber(num);
    }

    public static String[] checkNumber(String number) {
        String changeList = "";

        //Метод замены первой цифры
        if (number.startsWith("+7")) {
            number = number.replace("+7", "8");
            changeList = "Замена +7 на 8";
        }

        //Метод удаления пробелов и скобок
        if (number.contains(" ") || number.contains(")") || number.contains("(")) {
            String message = "В номере есть пробелы и/или скобки";

            number = number.replace(" ", "");
            number = number.replace(")", "");
            number = number.replace("(", "");

            if (changeList.isEmpty()) {
                changeList = message;
            } else {
                changeList = changeList.join("; ", changeList, message);
            }
        }

        //Метод проверки длинны строки
        if (number.length() != 11) {
            String messageNumErr = "Введен некорректный номер";
            number = messageNumErr;
        }

        if (changeList.isEmpty()) {
            changeList = "Не было изменений";
        }

        System.out.println(number);
        System.out.println(changeList);

        String[] result = {number, changeList};
        return result;
    }
}
