import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*
    *** EXERCÍCIO COM WHILE

    1º - Crie um programa que receba um dado de um usuário, enquanto ele não digitar o esperado deve repetir.
        1.1 - Crie uma variável para armazenar um valor inteiro digitado pelo o usuário.
        1.2 - Se o valor digitado for igual a 7, ele deve sair da estrutura de repetição.

*/
public class Exercicio06 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int dadoDigitado = 0;
        //boolean continuar = true;
        
        while(dadoDigitado != 7){
            System.out.print("\nDigite o valor 7 para sair do loop: ");
            dadoDigitado = teclado.nextInt();
            
            if(dadoDigitado == 7){
                //continuar = false;
                System.out.print("\nSaindo do sistema...");
            }
            else{
                System.out.print("\nVoce precisa digitar o valor 7 para sair do loop.....\n"); 
            }
        }
        
        teclado.close();
              
    }
}
