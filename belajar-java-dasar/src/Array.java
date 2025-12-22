public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Iyan";
        arrayString[1] = "Wardi";
        arrayString[2] = "Wardiyansyah";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Budi";
        System.out.println(arrayString[0]);

        String[] stringArray2 = new String[3];

        int[] arrayInt = new int[]{
          10, 90, 80, 67, 29
        };

        long[] arrayLong = {
          10, 90, 80, 67, 29
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Budi", "Santoso"},
                {"Eko", "Jono"},
                {"Joko"}
        };

        System.out.println(members[1][0]); // Eko
    }
}
