package Lesson_8;

public class MyArrayDataException extends Exception {
        public MyArrayDataException(int row, int column) {
            super("Неверные данные в ячейке [" + row + "][" + column + "]");
        }
    }