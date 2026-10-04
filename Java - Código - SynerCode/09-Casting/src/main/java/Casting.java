/**
 *
 * @author SynerCode
 */
public class Casting {

    public static void main(String[] args) {
        
        // Implícito
        byte idade = 23;
        short idade2 = idade;
        double idade3 = idade2;
        //idade = idade3;
        
        // Explícita
        int distancia = 4571458;
        byte dist = (byte) distancia;
        
        System.out.print("Informacao: " + dist);
    }
}
