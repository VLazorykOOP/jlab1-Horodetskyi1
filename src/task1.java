public class task1 {

    public static void main(String[] args) {
        // Введення значень змінних a та b
        double a = 1.0;
        double b = 1.0;

        // Обчислення виразу
        double result = calculateExpression(a, b);

        // Виведення результату
        System.out.println("Result: " + result);
    }

    public static double calculateExpression(double a, double b) {
        // Обчислення частин виразу
        double part1 = a / (Math.pow(b, 2) - 2);  // a / (b^2 - 2)
        double part2 = b / (Math.pow(a, 2) + 2);  // b / (a^2 + 2)
        double part3 = Math.pow(a * b, 3);        // (ab)^3

        // Повернення суми всіх частин
        return part1 + part2 + part3;
    }

}

