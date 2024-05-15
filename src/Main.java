public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
        };

        try {
            System.out.println("Сумма чисел массива: " + sumArrayElements(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }
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