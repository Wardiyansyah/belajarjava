public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80,56,70,33,80};
        sayCongrats("Eko", values);

        sayCongrats("Budi", 80,77,67,75,77);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total / values.length;
        if(finalValue >= 75){
            System.out.println("Selamat "+name+" Anda lulus");
        }else{
            System.out.println("Maaf "+name+" Anda tidak lulus");
        }
    }
}
