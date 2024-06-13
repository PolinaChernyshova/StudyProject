package Lesson_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSum(4, 9);
        numPositiveOrNegative(-4);
        isNegative(-100);
        printString("Hello", 5);
        checkYear(1999);
        integerArray();
        fillArray();
        multiplyArrayElements();
        fillArrayDiagonal();
        createArrayByLenAndValue(5, 1);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 3, b = 4;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 115;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 7, b = 0;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum(int num1, int num2) {
        int sum = num1 + num2;
        return (sum >= 10 && sum <= 20);
    }

        public static void numPositiveOrNegative(int a) {
            if (a >= 0) {
                System.out.println("Число " + a + " положительное");
            } else {
                System.out.println("Число " + a + " отрицательное");
            }
        }

        public static boolean isNegative(int a) {
            return a < 0;
        }

        public static void printString(String message, int a) {
            for (int i = 0; i < a; i++) {
                System.out.println(message);
            }
        }

        public static boolean checkYear(int year) {
       return (year%4 ==0 && year%100!=0 || year/400==0);
        }

        public static void integerArray() {
            int[] array = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                } else {
                    array[i] = 0;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        public static void fillArray() {
            int[] array = new int[100];
            for (int i = 0; i < 100; i++) {
                array[i] = i + 1;
            }
            System.out.println(Arrays.toString(array));
        }

        public static void multiplyArrayElements() {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] = array[i] * 2;
                }
            }
            System.out.println(Arrays.toString(array));
        }

        public static void fillArrayDiagonal() {
            int[][] array = new int[3][3];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][i] = 1;
                    System.out.print(array[i][j] + "");
                }
                System.out.println();
            }
        }

        public static void createArrayByLenAndValue(int len, int initialValue) {
            int[] array = new int[len];
            for (int i=0; i < len; i++) {
                array[i] = initialValue;
            }
            System.out.println(Arrays.toString(array));
        }
    }
