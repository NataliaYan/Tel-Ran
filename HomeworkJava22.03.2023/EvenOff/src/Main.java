import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int number2 = scanner.nextInt();

        System.out.println("Число 1 =  " + number1 + "  Число 2 =  " + number2);

        number2 = number1 + number2;
        number1 = number2 - number1;
        number2 = number2 - number1;

        System.out.println("меняем местами и теперь: " );
        System.out.print("Число 1 =  " + number1 + "  Число 2 =  " + number2);
    }

}
