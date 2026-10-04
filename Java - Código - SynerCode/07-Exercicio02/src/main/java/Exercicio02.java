import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/**
 * Exercício 02
 * 
 * Você deve armazenar algumas informações do usuário, nome completo, idade, sexo, saldo e endereço(s/n).
 * 
 * Faça a criação das variáveis sem atribuir informações. - OK
 * Faça a leitura das informações via teclado. - OK
 * Armazene os dados nas variáveis. - OK
 * Mostre um texto com as informações digitadas pelo usuário.
 */
public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nomeCompleto;
        byte idade;
        char sexo;
        float saldo;
        String endereco;
        
        System.out.print("\nDigite seu nome completo: ");
        nomeCompleto = teclado.nextLine();
        System.out.println("\n");
        
        System.out.print("\nDigite sua idade: ");
        idade = teclado.nextByte();
        System.out.println("\n");
        
        System.out.print("\nDigite seu sexo (M ou F): ");
        sexo = teclado.next().charAt(0);
        System.out.println("\n");
        
        System.out.print("\nDigite seu saldo: ");
        saldo = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("\n");
        
        System.out.print("\nDigite seu endereco: ");
        endereco = teclado.nextLine();
        System.out.println("\n\n\n");
        
        System.out.printf("Nome: %s\nIdade: %d\nSexo: %c\nSalde: %f\nEndereco : %s", nomeCompleto, idade, sexo, saldo, endereco);
        
        teclado.close();
    }
}
