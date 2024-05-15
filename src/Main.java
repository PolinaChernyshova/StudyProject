public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };
        checkArray(array);
    }

    public static void checkArray(String[][] array) {
        try {
            checkArraySize(array);
            int result = getArraySum(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Преобразование не удалось. " + e.getMessage());
        }
    }
    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }
    }
    public static int getArraySum(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}