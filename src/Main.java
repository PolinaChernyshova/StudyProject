public class Main {
    //вывод информации об объектах
    public static void main(String[] args) {
        //1
        Employee employee1 = new Employee("Иванов Иван Иванович", "Инженер", "ivanov@mailbox.com", "89991231122", 33333, 35);
        employee1.printEmployeeInfo();
        // 2
        Park.Attraction attraction1 = new Park("Орленок", "Воронеж", "Центральный район").new Attraction("Карусель", 9, 150);
        System.out.println(attraction1.getName());
    }
}