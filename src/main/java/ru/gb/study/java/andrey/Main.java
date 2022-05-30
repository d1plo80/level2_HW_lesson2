package ru.gb.study.java.andrey;

public class Main {
    public static void main(String[] args) {
        try {
            String[][] values = {{"1", "2", "4", "4"}, {"4", "2", "3", "4"}, {"5", "5", "1", "8"},{"4", "2", "7", "9"}};
            System.out.println(new Sum().calc(values));
        } catch (MyArraySizeException | MyDataArrayException e) {
            throw new RuntimeException("Ошибка в расчетах", e);
        }
    }
}