package Lesson_4_Logic;

public class Scope {
    public static void main (String[] args){
        double priceCar = 10_000;
        if (priceCar > 9_000){
            double oldPrice = priceCar; // данная переменная будет видна только на данном уровне и на всех уровнях ниже
            priceCar *= 0.95;
            System.out.println(priceCar);
        }
    }
}
