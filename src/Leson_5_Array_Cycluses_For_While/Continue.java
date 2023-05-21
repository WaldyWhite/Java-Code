package Leson_5_Array_Cycluses_For_While;

public class Continue {
    public static void main (String[] args) {
        // Тренер дал задание спортсмену. Он бросает кости и если выпадает любое значение от 1 до 5 - то он отжимается
        // А если выпадает шесть, то он отдыхает (ничего не делает)
        int[] result = {3, 5, 6, 2, 1};
        for (int i : result) {
            if (i == 6) {
                continue;
            }
            System.out.println("Спортсмен отжимается " + i);
            }
        }
    }

