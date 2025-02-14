import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число и нажмите <Enter>:");
        int n1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число и нажмите <Enter>:");
        int n2 = new Scanner(System.in).nextInt();
        int sum = n1 + n2;
        int dif = n1 - n2;
        int mult = n1 * n2;
        double quot = ((double)n1 / n2);
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + dif);
        System.out.println("Произведение: " + mult);
        System.out.println("Частное: " + quot);
    }
}