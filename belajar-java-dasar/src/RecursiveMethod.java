public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
        loop(100);
    }

    static int factorialLoop(int value){
        var result = 1;
        for(var i=1; i<=value;i++){
            result *= i;
        }
        return result;
    }

    static int factorialRecursive(int val){
        if(val == 1){
            return 1;
        } else {
            return val * factorialRecursive(val -1);
        }
    }

    static void loop(int val){
        if (val == 0){
            System.out.println("selesai");
        }else {
            System.out.println("loop-"+val);
            loop(val-1);
        }
    }
}
