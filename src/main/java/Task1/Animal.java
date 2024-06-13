package Task1;

public abstract class Animal {
    static int animalCount = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    abstract void run(int distance);
    abstract void swim(int distance);
}
