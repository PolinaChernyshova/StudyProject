package Task1;
public class Dog extends Animal {
    static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }
    @Override
    void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м ");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м ");
        }
    }
    @Override
    void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м ");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м ");
        }
    }
}