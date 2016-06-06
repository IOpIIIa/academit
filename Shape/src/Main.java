
public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.printf("%s\n%s%.1f\n%s%.1f\n%s%.1f\n", "Квадрат:", "Ширина = ", square.getWidth(), "Высота = ", square.getHeight(), "Площадь = ", square.getArea());

        System.out.println();

        Triangle triangle = new Triangle(2, -3, 1, 1, -6, 5);
        System.out.printf("%s\n%s%.5f\n%s%.5f\n%s%.5f\n", "Треугольник:", "Ширина = ", triangle.getWidth(), "Высота = ", triangle.getHeight(), "Площадь = ", triangle.getArea());

        System.out.println();

        Rectangle rectangle = new Rectangle(8, 13);
        System.out.printf("%s\n%s%.1f\n%s%.1f\n%s%.1f\n", "Прямоугольник:", "Ширина = ", rectangle.getWidth(), "Высота = ", rectangle.getHeight(), "Площадь = ", rectangle.getArea());

        System.out.println();

        Circle circle = new Circle(3);
        System.out.printf("%s\n%s%.5f\n%s%.5f\n%s%.5f\n", "Окружность:", "Ширина = ", circle.getWidth(), "Высота = ", circle.getHeight(), "Площадь = ", circle.getArea());

    }
}
