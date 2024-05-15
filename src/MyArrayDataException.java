public class MyArrayDataException extends Exception {
    public int row;
    public int column;
        public MyArrayDataException(int row, int column) {
            super("Неверные данные в ячейке [" + row + "][" + column + "]");
            this.row = row;
            this.column = column;
        }
    }