package Lesson_4_Logic;

public class BoolianLogic {
    public static void main(String[] args) {
        // Сынок купил хлеб
        boolean isBoughtBread = true;

        // Сынок купил молоко
        boolean isBoughtMilk = false;

         /*----- AND - Логическое И -----*/
        //boolean isBoughtBreadAndMilk = isBoughtMilk && isBoughtBread;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Молодец сынок, купил хлеб и Молоко");
        } else if (isBoughtBread) {
            System.out.println("Молодец Сынок, хотябы купил Хлеб");
        } else if (isBoughtMilk) {
            System.out.println("Молодец сынок, хотябы купил Молоко");
        } else {
            System.out.println("Сын ты не молодец, Хлеба нет и Молока нет");
        }

        /*----- OR - Логическое ИЛИ -----*/

    }
}
