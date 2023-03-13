import java.util.Scanner;

public class Main {
    private static String finalR;
    private static int result;
    private static int radix;
    private static String number;

    public static void main(String[] args) {
        int value = 0;
        String num = String.valueOf(0);
        int n = 0;


        // Перевести любое число из любой системы в десятичную.
        Scanner skaner = new Scanner(System.in);
        System.out.println("Перевод числа в десятичную систему");
        System.out.print("Введите исходный разряд системы : ");
        radix = skaner.nextInt();
        System.out.print("Введите число для перевода в десятичную систему: ");
        number = String.valueOf(skaner.next());
        num = String.valueOf(number);
        fromXtoTen(radix, number, num);
        System.out.println(number + " (" + radix + ") -> " + finalR + " (10)");
        System.out.println("");


        // Перевести любое число из десятичной в любую инную и обратно (10->... и ...->10).
        System.out.println("Перевод числа из десятичной системы");
        System.out.print("Введите число для перевода из десятичной системы: ");
        skaner = new Scanner(System.in);
        number = String.valueOf(skaner.nextInt());
        num = String.valueOf(number);
        System.out.print("Введите разряд системы, в которую хотите перевести : ");
        radix = skaner.nextInt();
        fromTentoX(radix, number, num);
        System.out.println(number + " (10) -> " + finalR + " (" + radix + ")");

        // И обратно
        System.out.println(" ");
        System.out.println("И обратно " + finalR + " в десятичную : ");
        number = String.valueOf(finalR);
        num = String.valueOf(number);
        fromXtoTen(radix, number, num);
        System.out.println(number + " (" + radix + ") -> " + finalR + " (10)");
        System.out.println("");


        // Перевести любое число любую инную систему.
        System.out.println("Перевод числа из любой системы в инную");
        System.out.print("Введите число для перевода: ");
        skaner = new Scanner(System.in);
        number = String.valueOf(skaner.nextInt());
        num = String.valueOf(number);
        System.out.print("Введите исходный разряд системы: ");
        int radixFrom = skaner.nextInt();
        System.out.print("Введите разряд системы, в которую хотите перевести : ");
        int radixTo = skaner.nextInt();
        radix = radixFrom;
        int numberFrom = Integer.parseInt(number);
        fromXtoTen(radix, number, num);
        radix = radixTo;
        number = String.valueOf(finalR);
        fromTentoX(radix, number, num);
        System.out.println(numberFrom + " (" + radixFrom + ") -> " + finalR + " (" + radixTo + ")");
        System.out.println("");

        // Разложить десятичное число на разряды.
        System.out.println("Разложим десятичное число на разряды");
        System.out.print("Введите число: ");
        skaner = new Scanner(System.in);
        number = String.valueOf(skaner.nextInt());
        radix = 10;
        int n1 = Integer.parseInt(number);
        int res = 0;
        int x = number.length() - 1;
        while (x > 0) {
            int val = (int) (n1 / Math.pow(10, x));
            res = (int) (val * Math.pow(radix, x));
            System.out.print(res);
            n1 = (int) (n1 - res);
            x = x - 1;
            System.out.print(" + ");
        }
        System.out.println(n1);

        System.out.println("Представим выражением:");
        radix = 10;
        int n2 = Integer.parseInt(number);
        int res1 = 0;
        int x1 = number.length() - 1;
        while (x1 > 0) {
            int val = (int) (n2 / Math.pow(10, x1));
            res1 = (int) (val * Math.pow(radix, x1));
            System.out.print(val + "*10^" + x1 + " + ");
            n2 = (int) (n2 - res1);
            x1 = x1 - 1;
        }
        System.out.println(n2);
    }


    // метод перевода из любой системы в десятичную
    public static String fromXtoTen(int radix, String number, String num) {
        result = 0;
        int value = 0;
        int i = 0;
        int n = number.length();
        char index = number.charAt(i);
        while (n > 0) {
            index = number.charAt(i);
            switch (index) {
                case 'A':
                    value = 10;
                    break;
                case 'B':
                    value = 11;
                    break;
                case 'C':
                    value = 12;
                    break;
                case 'D':
                    value = 13;
                    break;
                case 'E':
                    value = 14;
                    break;
                case 'F':
                    value = 15;
                    break;
                default:
                    value = Integer.parseInt(String.valueOf(index));

            }
            n=n-1;
            result += value * Math.pow(radix, n);
            i=i+1;
        }
        finalR = String.valueOf(result);
        return finalR;
    }


    // метод перевода из десятичной в любую
    public static String fromTentoX(int radix, String number, String num) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(number);
        while (n > 0) {
            switch (n % radix) {
                case 10:
                    sb = new StringBuilder("A");
                    break;
                case 11:
                    sb = new StringBuilder("B");
                    break;
                case 12:
                    sb = new StringBuilder("C");
                    break;
                case 13:
                    sb = new StringBuilder("D");
                    break;
                case 14:
                    sb = new StringBuilder("E");
                    break;
                case 15:
                    sb = new StringBuilder("F");
                    break;
                default:
                    sb.insert(0, (n % radix));
            }
            n /= radix;
        }
        finalR = String.valueOf(sb);
        return finalR;
    }
}








