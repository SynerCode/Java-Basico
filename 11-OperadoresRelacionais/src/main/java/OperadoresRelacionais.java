/**
 *
 * @author SynerCode
 */
public class OperadoresRelacionais {

    public static void main(String[] args) {
        
        byte valor1 = 11;
        byte valor2 = 11;
        
        // Igualdade
        // False
        System.out.print("Igualdade: " + (valor1 == (valor1 + valor2)));
        
        // Diferente
        // False
        System.out.print("\nDiferente: " + (valor1 != valor2));
        
        // Maior
        // False
        System.out.print("\nMaior: " + (valor2 > (valor1 + valor2)));
        
        // Menor
        // True
        System.out.print("\nMenor: " + (valor2 < (valor1 + valor2)));        
        
        // Maior Igual
        // True
        System.out.print("\nMaior igual: " + (valor2 >= valor1));
        
        // Menor Igual
        // True
        System.out.print("\nMenor igual: " + (valor2 <= valor1));
        
        
    }
}
