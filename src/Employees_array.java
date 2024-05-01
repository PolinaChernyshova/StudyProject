public class Employees_array {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Ivanov Ivan", "Programmer",
                "ivan@mailbox.com", "899999999", 50000, 25);
        employeesArray[1] = new Employee("Petrov Petr", "Designer",
                "petr@mailbox.com", "888888888", 55000, 26);
        employeesArray[2] = new Employee("Petrov Ivan", "Engineer",
                "petrivan@mailbox.com", "877777777", 52000, 27);
        employeesArray[3] = new Employee("Vasiliev Vasiliy", "Manager",
                "vasya@mailbox.com", "866666666", 51000, 28);
        employeesArray[4] = new Employee("Savin Roman", "Tester",
                "savin@mailbox.com", "855555555", 58000, 29);
    }
}