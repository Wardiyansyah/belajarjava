public class MethodReturnValue {
    public static void main(String[] args) {
        var result1 = sum(100, 100);
        System.out.println(result1);

        System.out.println(sum(200, 50));

        System.out.println(hitung(100, "+", 100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "x", 100));
    }

    static int sum(int val1, int val2){
        var total = val1 + val2;
        return total;
    }

    static int hitung(int val1, String opr, int val2){
        switch (opr){
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            default:
                return 0;
        }
    }
}
