package Lesson_13;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+79991112233");
        phoneBook.add("Петров", "+79001003040");
        phoneBook.add("Сидоров", "+79001112233");
        phoneBook.add("Иванов", "+79112223344");
        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Петров"));
        System.out.println(phoneBook.get("Сидоров"));
    }
}
