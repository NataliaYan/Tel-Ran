public class Main {
    public static void main(String[] args) {
        int rezInt = 0;
        byte rezByte = 0;
        double rezDouble = 0;
        float rezFloat = 0f;

        byte var1 = 127;
        int var2 = 4327;
        double var3 = 3.14;
        float var4 = 3.14159f;

        System.out.println("Преобразование типов:");
        System.out.println("- расширение: ");
        rezInt = var1;
        System.out.println("  - byte " + var1 + " = int " + rezInt);
        rezDouble = var1;
        System.out.println("  - byte " + var1 + " = double " + rezDouble);
        rezDouble = var2;
        System.out.println("  - int " + var2 + " = double " + rezDouble);
        rezFloat = var1;
        System.out.println("  - byte " + var1 + " = float " + rezFloat);
        rezFloat = var2;
        System.out.println("  - int " + var2 + " = float " + rezFloat);
        rezFloat = (float)var3;
        System.out.println("  - double " + var3 + " = float " + rezFloat);
        System.out.println("- сужение: ");
        rezByte = (byte) var2;
        System.out.println("  - int " + var2 + " = byte " + rezByte);
        rezByte = (byte) var3;
        System.out.println("  - double " + var3 + " = byte " + rezByte);
        rezByte = (byte) var4;
        System.out.println("  - float " + var4 + " = byte " + rezByte);
        rezInt = (int) var3;
        System.out.println("  - double " + var3 + " = int " + rezInt);
        rezInt = (int) var4;
        System.out.println("  - float " + var4 + " = int " + rezInt);
        rezDouble = var4;
        System.out.println("  - float " + var4 + " = double " + rezDouble);

    }
}