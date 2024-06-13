package Task1;

public class Task1 {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat[] cats = {new Cat("Вася"), new Cat("Гав"), new Cat("Рыжик")};
        Bowl bowl = new Bowl(15);
        for (Cat cat : cats) {
            cat.eatFromBowl(bowl);
        }

        //Добавление еlы в миску
        bowl.addFood(2);
        //Заставляем бежать собаку

        dogBobik.run(200);

        //Подсчет животных
        System.out.println("Всего животных: " + Animal.animalCount);
        System.out.println("Всего собак: " + Dog.dogCount);
        System.out.println("Всего котов: " + Cat.catCount);
    }
}