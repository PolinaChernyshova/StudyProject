public class Person_array {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Ivanov Ivan", "Programmer",
                "ivan@mailbox.com", "899999999", 50000, 25);
        persArray[1] = new Employee("Petrov Petr", "Designer",
                "petr@mailbox.com", "888888888", 55000, 26);
        persArray[2] = new Employee("Petrov Ivan", "Engineer",
                "petrivan@mailbox.com", "877777777", 52000, 27);
        persArray[3] = new Employee("Vasiliev Vasiliy", "Manager",
                "vasya@mailbox.com", "866666666", 51000, 28);
        persArray[4] = new Employee("Savin Roman", "Tester",
                "savin@mailbox.com", "855555555", 58000, 29);
    }
}