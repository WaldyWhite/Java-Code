package Leson_5_Array_Cycluses_For_While;

public class ForI {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4};
//        for (int i = 0; i < 3; i++) {
//            System.out.println(numbers[i]);
//        }
//
        // Практическое задание
        // Распечатать все чётные числа из массива numbers2
        int[] numbers2 = {3,2,10,5,8};

        // перебор циклом for i
//        for (int i = 0; i < numbers2.length; i++) {
//            if ((numbers2[i] % 2) == 0 ) {
//                System.out.println(numbers2[i]);
//            }

        // перебор цциклом forEach

//        for (int j : numbers2) {
//            if (j % 2 == 0) {
//                System.out.println(j);
//                }
//            }
        //  практическое задание 2
        //  распечатать числа под чётным индексом
        for (int i = 0; i < numbers2.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers2[i]);
            }

        }
        }
    }

