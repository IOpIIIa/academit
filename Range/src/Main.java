import ru.academit.peretyagin.range.Range;

public class Main {
    public static void main(String[] args) {

        Range range = new Range(-5, 15);

        System.out.println("Длинна интервала = " + range.getLengthInterval());

        if (range.isInside()) {
            System.out.println("Число принадлежит диапазону");
        }
        System.out.println("Число не пренадлежит диапазону");

    }
}
