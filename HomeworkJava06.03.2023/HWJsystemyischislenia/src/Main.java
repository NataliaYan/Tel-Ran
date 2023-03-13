public class Main {
    public static void main(String[] args) {

        int number = 0;
        int radix = 0;
        int result = 0;

        // Перевести число 333 из шестнадцатиричной в десятичную.
        // 333 (16 ->10) = (3*16^2)+(3*16^1)+(3*16^0)
        number = 333;
        result = (3 * 16 * 16) + (3 * 16) + (3 * 1);
        System.out.println("Перевод шестнадцатиричного числа " + number + " в десятичную систему: " + result);

        // Разложить число 200345 на разряды в десятичной системе.
        // 200345 = (2*10^5)+(0*10^4)+(0*10^3)+(3*10^2)+(4*10^1)+(5*10^0)
        // 200345 = 200000+0+0+300+40+5
        number = 200345;
        System.out.println("Раскладываем число " + number + " на разряды: ");
        System.out.println(2 * 10 * 10 * 10 * 10 * 10 + " " + 0 * 10 * 10 * 10 * 10 + " " + 0 * 10 * 10 * 10 + " " + 3 * 10 * 10 + " " + 4 * 10 + " " + 5 * 1);

        // Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10).
        // 637 (10 -> 16)
        // 637 / 16 = 39 (целое)  637 % 16 = 13 (остаток)
        // 39 / 16 = 2 (целое)  39 % 16 = 7 (остаток)
        // 2 / 16 = 0 (целое)  2 % 16 = 2 (остаток)
        // 27D
        number = 637;
        radix = 16;
        System.out.print("Перевод числа " + number + " в шестнадцатиричную систему: ");
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            switch (number % radix) {
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
                    sb.insert(0, (number % radix));
            }
                    number = number / radix;
        }
        System.out.println(sb);


        System.out.print("И обратно " + sb + " в десятичную : ");
        //27D -> 10
        //2*16^2 +7*16+13*1
        result = 2*16*16 +7*16 +13;
        System.out.println(result);


        // Перевести 637 из десятичной в двоичную.
        // 637 (10 -> 2)
        // 637 / 2 = 318 (целое)  637 % 2 = 1 (остаток)
        // 318 / 2 = 159 (целое)  318 % 2 = 0 (остаток)
        // 159 / 2 = 79 (целое)   159 % 2 = 1 (остаток)
        // 79 / 2 =  39 (целое)    79 % 2 = 1 (остаток)
        // 39 / 2 =  19 (целое)    39 % 2 = 1 (остаток)
        // 19 / 2 =  9 (целое)     19 % 2 = 1 (остаток)
        //  9 / 2 =  4 (целое)      9 % 2 = 1 (остаток)
        //  4 / 2 =  2 (целое)      4 % 2 = 0 (остаток)
        //  2 / 2 =  1 (целое)      2 % 2 = 0 (остаток)
        //  1 / 2 =  0 (целое)      1 % 2 = 1 (остаток)
        // 1001111101
        number = 637;
        radix = 2;
        System.out.print("Перевод числа " + number + " в двоичную систему: ");
        StringBuilder sb1 = new StringBuilder();
        result = number;
        while (number > 0) {
            sb1.insert(0, (number % radix));
            number = number / radix;
        }
        System.out.println(sb1);

        // 11100111 перевести в десятичную.
        // 11100111 = (1*2^7)+(1*2^6)+(1*2^5)+(0*2^4)+(0*2^3)+(1*2^2)+(1*2^1)+(1*2^1)
        // 231 = 128+64+32+0+0+4+2+1
        number = 11100111;
        System.out.print("Перевод двоичного числа " + number + " в десятичную систему: ");
        result = (1 * 2 * 2 * 2 * 2 * 2 * 2 * 2) + (1 * 2 * 2 * 2 * 2 * 2 * 2) + (1 * 2 * 2 * 2 * 2 * 2) + (0 * 2 * 2 * 2 * 2) + (0 * 2 * 2 * 2) + (1 * 2 * 2) + (1 * 2) + (1 * 1);
        System.out.println(result);


        // Перевести 637 из десятичной в троичную.
        // 637 (10 -> 3)
        // 637 / 3 = 212 (целое)  637 % 3 = 1 (остаток)
        // 212 / 3 = 70 (целое)   212 % 3 = 2 (остаток)
        // 70 / 3 =  23 (целое)   70 % 3 = 1 (остаток)
        // 23 / 3 =  7 (целое)    23 % 3 = 2 (остаток)
        // 7 / 3 =   2 (целое)    7 % 3 = 1 (остаток)
        // 2 / 3 =  0 (целое)     2 % 3 = 2 (остаток)
        // 212121
        number = 637;
        radix = 3;
        System.out.print("Перевод числа " + number + " в троичную систему: ");
        StringBuilder sb2 = new StringBuilder();
        while (number > 0) {
             sb2.insert(0, (number % radix));
             number = number / radix;
        }
        System.out.println(sb2);
    }
}


