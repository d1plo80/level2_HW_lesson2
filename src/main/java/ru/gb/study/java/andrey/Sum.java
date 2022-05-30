package ru.gb.study.java.andrey;

public class Sum {
    public int calc(String[][] values) {
        try {
            checkSize(values);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                try {
                    sum += Integer.parseInt(values[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyDataArrayException(
                            String.format("Массив[%s][%s] содержит неверные значения: %s", i, j, values[i][j]),
                            e
                    );
                }
            }
        }
        return sum;
    }
    private void checkSize(String[][] values) {

        if (values.length != 4) {
            throw new MyArraySizeException("Массив имеет неверный размер");
        }
        for (String[] value : values) {
            if (value.length != 4) {
                throw new MyArraySizeException("Массив имеет неверный размер");
            }
        }
    }
}
