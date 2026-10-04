/**
 *
 * @author SynerCode
 */
public class ERFor {

    public static void main(String[] args) {
        
        // For Padrão ( com incremento)
        for (int valor = 0; valor < 10; valor++){
            System.out.print("\nValor de i: " + valor);
        }
        
        
        // For Padrão ( com decremento)
        for (int valor = 10; valor >= 1; valor--){
            System.out.print("\nValor de i: " + valor);
        }
        
        
        // For Padrão (com atualização diferente de 1)
        for (int valor = 1; valor < 10; valor *= 2){
            System.out.print("\nValor de i: " + valor);
        }
        
        
        // For sem a criação da variável de controle dentro da estrutura
        int valor = 0;
        for (; valor < 10; valor += 2){
            System.out.print("\nValor de i: " + valor);
        }
        
        
        // For sem a criação da variável de controle dentro da estrutura e sem a atualização
        int valor1 = 0;
        for ( ; valor1 < 10; ){
            System.out.print("\nValor de i: " + valor1);
            valor1++;
        }
        
        /*
        // For sem parâmetros (LOOP INFINITO)
        for ( ; ; ){
            System.out.print("\nValor de i: ");            
        } 
        */
        
        // Utilização do Break
        int i = 0;
        for ( ; ; ){
            System.out.print("\nValor de i: " + i);
            i++;
            
            if(i == 10){
                break;
            }
        }  
         
        
        // Utilização do Continue        
        for (int x = 0 ; x <= 10 ; x++){           
            
            if(x == 7){
                continue;
            }
            
            System.out.print("\nValor de x: " + x);
        } 
        
    }
}
