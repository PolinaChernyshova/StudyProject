package Task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "green", "black");
        System.out.println("Периметр круга: " + circle.getPerimeter());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Цвет фона: " + circle.getFillColor());
        System.out.println("Цвет границ: " + circle.getBorderColor());

        Triangle triangle = new Triangle(3, 4, 5, "red", "blue");
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Цвет фона: " + triangle.getFillColor());
        System.out.println("Цвет границ: " + triangle.getBorderColor());

        Rectangle rectangle = new Rectangle(11, 16, "blue", "white");
        System.out.println("Периметр прямоугольника: " + triangle.getPerimeter());
        System.out.println("Площадь прямоугольника: " + triangle.getArea());
        System.out.println("Цвет фона: " + triangle.getFillColor());
        System.out.println("Цвет границ: " + triangle.getBorderColor());
    }
}
//или вынести вывод характеристик фигур в отдельный метод printCharacteristics()