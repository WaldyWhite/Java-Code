package Lesson_6_String;

public class myStrring {
    public static void main (String[] args) {
        //String text1 = "hey";
        //String text2 = "hey";
        //System.out.println(text1 == text2); // = true, так как обе ссылки указываю на один и тот же объект в памяти

        //String text3 = new String ("hello");
        //String text4 = new String ("hello");

        //System.out.println(text3 == text4);// = false, так как созданы два объекта с разным ми ссылками
        // Для корректного сравнения необходимо использовать функцию equals
        //System.out.println(text3.equals(text4)); // = true

/*----------------------------------Действия со строками--------------------------------------------------------------*/

        String someText = "Hello World !";

        /*------Перевод в верхний регистр-------------------------------------*/
        String textUpper = someText.toUpperCase();
        System.out.println(textUpper);

        /*------Перевод в нижний регистр--------------------------------------*/
        String textLover = someText.toLowerCase();
        System.out.println(textLover);

        /*------Длина строки---------------------------------------------------*/
        int textLenght = someText.length();
        System.out.println(textLenght);

        /*------Есть ли в тексте другой текст----------------------------------*/
        boolean textContains = someText.contains("Hello");
        System.out.println(textContains);

        /*------Замена всех, куска текста(подстроки) на  другой текст----------*/
        String textReplace = someText.replaceAll("r", "a");
        System.out.println(textReplace);

        /*------Повторить текст n раз-------------------------------------------*/

/*--------------------------------------------------------------------------------------------------------------------*/
    }
}
