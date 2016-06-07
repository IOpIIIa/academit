import ru.academit.peretyagin.range.Range;

public class Main {
    public static void main(String[] args) {

        Range range = new Range(5, 15);
        double intervalTest = 12;

        System.out.println("Длинна интервала = " + range.getLength());

        if (range.isInside(intervalTest)) {
            System.out.println("Число принадлежит диапазону");
        } else {
            System.out.println("Число не пренадлежит диапазону");
        }
    }
}
