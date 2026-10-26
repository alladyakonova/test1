public class MathOperations {

    public static void main (String[] arg) {
        int add1 = add(10,12);
        System.out.println("Сумма чисел равна " + add1);
        int sub1 = subtract(10,12);
        System.out.println("Разность чисел равна " + sub1);
        int mult1 = multiply(10,12);
        System.out.println("Произведение чисел равно " + mult1);
        double div1 = divide(3,2);
        System.out.println("Частное от деления чисел равно " + div1);
        int fm = findMax(4,-3);
        System.out.println("Большее из двух чисел: " + fm);
        int dif = difference(60,12);
        System.out.println("Разность двух чисел: " + dif);
        int sq = squareArea(5);
        System.out.println("Площадь квадрата равна " + sq);
        int per = squarePerimeter(5);
        System.out.println("Периметр квадрата равен " + per);
        float min = convertSecondsToMinutes(25);
        System.out.println("Количество минут в секундах " + min);
        double speed = averageSpeed(200, 10);
        System.out.println("Средняя скорость равна " + speed);
        double hyp = findHypotenuse(3,4);
        System.out.println("Гипотенуза равна " + hyp);
        double cir = circleCircumference(23);
        System.out.println("Длина окружности равна " + cir);
        double percent = calculatePercentage(10,3);
        System.out.println("Процент равен " + percent);

        double ctf = celsiusToFahrenheit(59);
        System.out.println("Результат перевода в Фаренгейты равен " + ctf);
        double ftc = fahrenheitToCelsius(190);
        System.out.println("Результат перевода в Цельсий равен " + ftc);

    }
    public static int add (int x, int y) {
        return x + y;
    }
    public static int subtract (int x, int y) {
        return x - y;
    }
    public static int multiply (int x, int y) {
        return x * y;
    }
    public static double divide (int x, int y) {
        return (double) x / y;
    }
    public static int findMax (int a, int b) {
        return Math.max(a, b);
    }
    public static int difference (int x, int y) {
        return Math.abs(x-y);
    }
    public static int squareArea (int side) {
        return side * side;
    }
    public static int squarePerimeter (int side) {
        return 4 * side;
    }
    public static float convertSecondsToMinutes (int seconds) {
        return (float) seconds / 60;
    }
    public static double averageSpeed (double distance, double time) {
        return distance / time;
    }
    public static double findHypotenuse (double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
    public static double circleCircumference (double radius) {
        return 2 * radius * Math.PI;
    }
    public static double calculatePercentage (double total, double part) {
        return (part / total) * 100;
    }
    public static double celsiusToFahrenheit (double c) {
        return c / 5 * 9 + 32;
    }
    public static double fahrenheitToCelsius (double f) {
        return (f - 32) * 5 / 9;
    }
}
