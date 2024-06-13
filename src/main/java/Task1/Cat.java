package Task1;

public class Cat extends Animal {
   static int catCount = 0;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }
    @Override
    void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м ");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м ");
        }
    }
    @Override
    void swim(int distance) {
        System.out.println(name + "не умеет плавать");
    }
    public void eatFromBowl(Bowl bowl) {
        if (!isFull) {
            isFull = true;
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Коту " + name + " не хватило еды");
        }
    }
    public boolean isFull() {
        return isFull;
    }
}
