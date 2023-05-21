package Leson_5_Array_Cycluses_For_While;

import java.util.Arrays;

public class Array {
    public static void main (String[] args) {

        int x = 5;
        int y = 10;

        // создание Массива 1
//      int[] array = new int[2];
//      array[0] = x;
//      array[1] = y;

        // создание Массива 2 короткая запись
        //int[] array = new int[]{x, y};

        // создание Массива 3 еще боле короткая запись
        int[] array = {x, y};

        // Копирование массива
//        int[] array2 = new int [2];
//        array2[0] = array[0];
//        array2[1] = 13;
        // ну или так...
        int [] array2 = {array[0], 15};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        // практическое задание: ответить на вопрос "Столица Катара?" и записать её в массив.
        char[] array3 = {'D','o','h','a'};
        System.out.println(Arrays.toString(array3));


    }
}
