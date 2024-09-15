import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int y1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int y2 = sc2.nextInt();

        System.out.println(sum(y1, y2));
    }

    public static int sum(int x1, int x2) {
        return x1 + x2;
    }
}
