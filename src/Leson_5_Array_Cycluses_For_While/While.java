package Leson_5_Array_Cycluses_For_While;

public class While {
    public static void main(String[]args) {
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        System.out.println("While 10 закончен");
        while (true) {
            count++;
            System.out.println(count);
            if (count == 100) {
                break;
            }
        }
        System.out.println("вторй While закончен");
    }
}
