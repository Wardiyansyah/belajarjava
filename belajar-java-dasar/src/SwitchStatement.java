public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";

        switch(nilai){
            case "A":
                System.out.println("Anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
                break;
        }

        switch (nilai){
            case "A" -> System.out.println("Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai Anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin Anda salah jurusan");
            }
        }

        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Nilai Anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin Anda salah jurusan";
            }
        }

        System.out.println(ucapan);

        ucapan = switch(nilai){
            case "A": yield "Anda lulus dengan baik";
            case "B", "C": yield "Nilai Anda cukup baik";
            case "D": yield "Anda tidak lulus";
            default: yield "Mungkin Anda salah jurusan";
        };

        System.out.println(ucapan);

    }
}
