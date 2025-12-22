//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//  Tipe Data Primitif
//        Number
        byte iniByte = 10;
        byte iniByteJuga = -10;
        short iniShort = 15000;
        short iniShortJuga = -20000;
        int iniInt = 150000;
        int iniIntJuga = -200000;
        long iniLong = 150000;
        long iniLong20 = 150000L;
        long iniLongJuga = -200000L;
        float iniFloat = 3.5f;
        double iniDouble = 5.0;

        boolean benar = true;
        boolean salah = false;

        char item = 'A';

//        Literal
        int decimalInt = 15;
        int hexaDecimal = 0xFFDACB;
        int binaryDecimal = 0b11100011;

        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

//        Konversi tipe data
        byte iniByte2 = 10;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;
        long iniLong2 = iniInt2;
        float iniFloat2 = iniLong2;
        double iniDouble2 = iniFloat2;

        float iniFloat3 = (float) iniDouble2;
        long iniLong3 = (long) iniFloat3;
        int iniInt3 = (int) iniLong3;
        short iniShort3 = (short) iniInt3;

//  Tipe Data Reference
//        STRING
        String greeting = "Hello World!";
        System.out.println(greeting);

        char[] dicodingChars = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);

//        mengetahui panjang string
        String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);
//        mengambil karakter dari string
        char result = dicoding.charAt(7);
        System.out.println(result);
    }
}