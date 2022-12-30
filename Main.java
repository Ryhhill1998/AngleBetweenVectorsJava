import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double dotProductAB = a1 * b1 + a2 * b2;
        double magnitudeA = Math.sqrt(Math.pow(a1, 2) + Math.pow(a2, 2));
        double magnitudeB = Math.sqrt(Math.pow(b1, 2) + Math.pow(b2, 2));
        double dotProductMagAB = magnitudeA * magnitudeB;

        double cosAngle = dotProductAB / dotProductMagAB;
        double angle = Math.acos(cosAngle);

        System.out.println(Math.toDegrees(angle));
    }
}