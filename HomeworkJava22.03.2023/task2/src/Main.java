import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Написать программу на Java, которая принимает на вход сумму двух числе(int) и выводит "true",
//        если эта сумма нечетная, и "false", если чётная.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        boolean temp = ((number2+number1) % 2)!=0;
        if (temp==true)
            System.out.println("Сумма двух чисел = " + (number2+number1) + " - нечетная!");
        else
            System.out.println("Сумма двух чисел = " + (number2+number1) + " - четная!");
    }
}