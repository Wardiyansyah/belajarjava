public class Block {
    public static void main(String[] args) {

        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");

        {
            System.out.println("Hello World 4");
            System.out.println("Hello World 5");
            System.out.println("Hello World 6");
        }

        int nilai = 70;

        if (nilai >= 75) {
            System.out.println("Selamat Anda Lulus");
            System.out.println("Nilai Anda " + nilai);
        } else {
            System.out.println("Silahkan Coba Lagi");
        }

        double total = 80;

    }
}
