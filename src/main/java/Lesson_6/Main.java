package Lesson_6;
public class Main {
    //вывод информации об объектах
    public static void main(String[] args) {
        //1
        Employee firstEmployee = new Employee("Иванов Иван Иванович", "Инженер", "ivanov@mailbox.com", "89991231122", 33333, 35);
        firstEmployee.printEmployeeInfo();
        // 2
        Park.Attraction firstAattraction = new Park( "Орленок", "Воронеж", "Центральный район").new Attraction("Карусель", 9, 150);
        Park.Attraction secondAattraction = new Park( "Орленок", "Воронеж", "Центральный район").new Attraction("Ветерок", 9, 100);
        Park.Attraction thirdAattraction = new Park( "Орленок", "Воронеж", "Центральный район").new Attraction("Американские горки", 5, 180);
        System.out.println(firstAattraction.getAttractionName());
        System.out.println(secondAattraction.getWorkingHours());
        System.out.println(thirdAattraction.getCost());
    }
}