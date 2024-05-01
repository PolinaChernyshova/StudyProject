public class Person_array {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Ivanov Ivan", "Programmer",
                "ivan@mailbox.com", "899999999", 50000, 25);
        persArray[1] = new Person("Petrov Petr", "Designer",
                "petr@mailbox.com", "888888888", 55000, 26);
        persArray[2] = new Person("Petrov Ivan", "Engineer",
                "petrivan@mailbox.com", "877777777", 52000, 27);
        persArray[3] = new Person("Vasiliev Vasiliy", "Manager",
                "vasya@mailbox.com", "866666666", 51000, 28);
        persArray[4] = new Person("Savin Roman", "Tester",
                "savin@mailbox.com", "855555555", 58000, 29);
    }
}