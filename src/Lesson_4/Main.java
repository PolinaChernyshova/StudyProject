package Lesson_4;

import java.util.Arrays;

public class Main {
        public static void main(String[] myargs) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
            checkSum(4, 9);
            numPositiveOrNegative(-4);
            isNegative(-100);
            method8("Hello", 5);
            method9(1999);
            massive10();
            massive11();
            massive12();
            massive13();
            twoArgs(5, 1);
        }

        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
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
            } if (value > 100) {
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
            if (sum >= 10 && sum <= 20) {
                return true;
            }
            else {
                return false;
            }
        }

        public static void numPositiveOrNegative(int a) {
            if (a >= 0) {
                System.out.println("Число" + a + "положительное");
            } else {
                System.out.println("Число" + a + "отрицательное");
            }
        }

        public static boolean isNegative(int a) {
            return a < 0;
        }

        public static void method8(String message, int a) {
            for (int k = 0; k < a; k++) {
                System.out.println(message);
            }
        }

        public static boolean method9(int year) {
            if (year % 4 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void massive10() {
            int[] arr10 = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr10.length; i++) {
                if (arr10[i] == 0) {
                    arr10[i] = 1;
                } else {
                    arr10[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arr10));
        }

        public static void massive11() {
            int[] arr11 = new int[100];
            for (int i = 0; i < 100; i++) {
                arr11[i] = i + 1;
            }
            System.out.println(Arrays.toString(arr11));
        }

        public static void massive12() {
            int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr12.length; i++) {
                if (arr12[i] < 6) {
                    arr12[i] = arr12[i] * 2;
                }
            }
            System.out.println(Arrays.toString(arr12));
        }

        public static void massive13() {
            int[][] array = new int[3][3];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][i] = 1;
                    System.out.print(array[i][j] + "");
                }
                System.out.println();
            }
        }

        public static void twoArgs(int len, int initialValue) {
            int[] arr14 = new int[len];
            for (int i = 0; i < len; i++) {
                arr14[i] = initialValue;
            }
            System.out.println(Arrays.toString(arr14));
        }
    }
