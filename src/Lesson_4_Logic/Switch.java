package Lesson_4_Logic;

public class Switch {
    public static void main (String[] args) {
        // 1 - понедельник ....7 - воскресенье
        int dayNumber = 2;

        /*switch (dayNumber){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Данного дня не существует");
                break;*/

        // Короткий вариант без break
            switch (dayNumber){
                case 1 -> System.out.println("Понедельник");
                case 2 -> System.out.println("Вторник");
                default -> System.out.println("Данного дня не существует");

        }
    }
}
