/**
 *
 * @author SynerCode
 */

public class Recursao {

    public static void main(String[] args) {
       // Para testar qualquer função, remova os comentários abaixo.
       //contar(10);         
       //System.out.print("\nSaida: " + fibonacci(40));
    }
    
    static void contar(int numero){
        
        if(numero <= 0){
            return;
        }
        
        System.out.print("\nValor: " + numero);        
        contar(numero - 1);        
    }
    
    static int fibonacci(int numero){
        
        if(numero <= 1){
            return numero;
        }
        
        return fibonacci(numero - 1) + fibonacci(numero - 2);
        
    }
}
