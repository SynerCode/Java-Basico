/**
 *
 * @author SynerCode
 */
public class OperadoresIncremDecrem {

    public static void main(String[] args) {
        // Pós-Incremento
        int i = 0;
        System.out.print("\nSaida i 1: " + (i++));
        System.out.print("\nSaida i 2: " + (i));
        
        // Pré-Incremento
        int x = 10;
        System.out.print("\n\nSaida x 1: " + (++x));
        System.out.print("\nSaida x 2: " + (x));
        
        // Pós-Decremento
        int y = 0;
        System.out.print("\n\nSaida y 1: " + (y--));
        System.out.print("\nSaida y 2: " + (y));
        
        // Pré-Decremento
        int z = 10;
        System.out.print("\n\nSaida z 1: " + (--z));
        System.out.print("\nSaida x z: " + (z));

    }
}
