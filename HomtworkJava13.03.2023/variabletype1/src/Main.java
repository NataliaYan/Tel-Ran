import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Main {
        public static void main(String[] args) {

        String text = "I study Basic Java!";
        System.out.println(text);
        char ch = text.charAt(text.length()-1);
        System.out.println("Последний символ в данной строке: " + ch);
        System.out.println("Содержит ли строка слово 'Java' ? - It's " + (text.contains("Java")));
        System.out.println("Заменим буквы 'а' на 'о'  - " + text.replace('a', 'o'));
        System.out.println(toUpperCase(text));
        System.out.println(toLowerCase(text));
        System.out.println(text.substring(14,18));
    }
}