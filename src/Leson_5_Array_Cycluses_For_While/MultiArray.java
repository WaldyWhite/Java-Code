package Leson_5_Array_Cycluses_For_While;

import java.util.Arrays;

public class MultiArray {
    public static void main (String[] args) {
        // Ограбили магазин. Вор был ростом 178см.
        // Следователь нашёл две группы людей около магазина. Задача найти вора по ростую
        int[] group1 = {180,179,190};
        int[] group2 = {165,178,193};

        int[][] multiArray = {group1, group2};

        upperFor: // Это метка для вышестоящего цикла for
        for (int[] array : multiArray) {
            for (int number : array) {
                if (number == 178) {
                    System.out.println("Вор пойман");
                    break upperFor;
                } else {
                    System.out.println("Человек неподашёл по росту");
                    }
                }
            }
        }
    }
