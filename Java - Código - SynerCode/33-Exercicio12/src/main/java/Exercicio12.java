import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*

        1º - Crie um programa em Java que solicite ao usuário uma frase. - OK

            O programa deverá:

                1.1 - Verificar se a frase está vazia ou contém apenas espaços. - OK
                1.2 - Remover os espaços do início e do final caso exista.- OK
                1.3 - Exibir a frase em letras maiúsculas. - OK
                1.4 - Verificar se a frase contém a palavra "Java". - OK
                1.5 - Substituir todas as ocorrências de "Java" por "JAVA". - OK
                1.6 - Dividir a frase em palavras e exibir cada palavra separadamente. - OK

*/
public class Exercicio12 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String frase;
        
        while(true){
            System.out.print("\nDigite uma frase: ");
            frase = teclado.nextLine();
            
            if(!frase.isBlank()){
                break;
            }
            
            System.out.print("\nDigite uma frase valida....");
        }
        
        frase = frase.strip();
        
        System.out.print("\nFrase em maiusculas: " + frase.toUpperCase());
        
        System.out.print("\nContem Java: " + frase.contains("Java"));
        
        String fraseModificada = frase.replace("Java", "JAVA");
        
        String[] palavras = fraseModificada.split(" ");
        System.out.print("\n");
        
        for(String palavra : palavras){
            System.out.print(" " + palavra + "\n");
        }
        
        // Encerrando a leitura das informações.
        teclado.close();
                               
    }
}
