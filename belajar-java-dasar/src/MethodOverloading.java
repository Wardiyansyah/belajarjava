public class MethodOverloading {
    public static void main(String[] args) {
        sayHelo();
        sayHelo("Eko");
        sayHelo("Eko", "Kurniawan");
    }

    static void sayHelo(){
        System.out.println("Hello");
    }

    static void sayHelo(String firstName){
        System.out.println("Hello "+firstName);
    }

    static void sayHelo(String firstName, String lastName){
        System.out.println("Hello "+firstName+" "+lastName);
    }
}
