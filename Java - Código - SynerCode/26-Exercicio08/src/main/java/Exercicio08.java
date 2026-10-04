import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*
    *** EXERCÍCIO COM FOR

    1º - Faça um programa que exiba a estrutura abaixo:
    
    *
    **
    ***
    ****
    *****
    ******

    2º - Para isso, você irá fazer a leitura do usuário para definir o limite do loop.

*/
public class Exercicio08 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int qtdLinha;
        String saida = "";
        
        System.out.print("\nDigite a quantidade de linha de saida : ");
        qtdLinha = teclado.nextInt();
        
        for(int i = 0; i < qtdLinha; i++){
            saida += "*";
            System.out.println(saida);
        }
        
        teclado.close();
    }
}
