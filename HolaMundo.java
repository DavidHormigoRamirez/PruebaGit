import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Hola, como te llamas? ");
        String nombre = s.next();

        System.out.println("Encantado, NO QUIERO ESTO" + nombre);
        s.close();;
    }
}