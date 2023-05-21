package Leson_3_Primitivves;

public class MathOperations {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        //---- Прибавление ----
        int sum = x + y;
        //System.out.println(sum);

        //---- Вычитание ----
        int diff = x - y;
        //System.out.println(diff);

        //---- Умножение ----
        int multiply = x * y;
        //System.out.println(multiply);

        // ---- Деление ----
        double divide = (double) x / y;
        //System.out.println(divide);

        // Инкремент
        x++;

        // Декремент
        x--;

        // ---- Остаток от деления ----
        int modulo = 5 % 3;
        //System.out.println(modulo);

        // Скобки

        int z = 2 + 2 * 2; // = 6
        int p = (2 + 2 ) * 2; // = 8

        // Расчёт индекса массы тела
        double height = 1.8;
        int weight = 98;
        double index = weight / (height * height);
        System.out.println(index);

        // * в Java отсутствует оператор возведения в степень *
    }
}
