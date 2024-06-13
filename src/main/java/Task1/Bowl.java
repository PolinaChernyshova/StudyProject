package Task1;

public class Bowl {
   private int foodAmount;
   public Bowl(int foodAmount) {
       this.foodAmount = foodAmount;
   }
   public void addFood(int foodAmount) {
   if (foodAmount >0) {
       this.foodAmount += foodAmount;
       System.out.println("Добавлено " + foodAmount + " еды в миску");
   } else {
       System.out.println("Нельзя добавить отрицательное количество еды в миску");
   }
   }
}
