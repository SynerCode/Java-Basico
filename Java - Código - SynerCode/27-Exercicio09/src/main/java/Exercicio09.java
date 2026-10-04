import java.util.Scanner;
/**
 * @author SynerCode
 */

/*
    1º - Faça um programa que realiza a leitura de dados digitado pelo usuario.
        1.1 - Utilize uma estrutura de repetição.
        1.2 - Se o usuário digitar 0, você deve sair do programa com break e informar que o sistema encerrou.
        1.3 - Se o usuário digitar 1, você deve pular o loop com o continue, mas antes informe o pulo.
        1.4 - Abaixo das verificações, você deve exibir a quantidade de loops.
*/
public class Exercicio09 {

    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        int valorDigitado;
        int qtdLoops = 0;
        boolean continuar = true;
        
        while(continuar){
            System.out.print("\nDigite um valor aleatorio: ");
            valorDigitado = teclado.nextInt();
            
            if(valorDigitado == 0){
                System.out.print("\nSaindo do sistema.....");
                break;
            }
            else if(valorDigitado == 1){
                System.out.print("\nAconteceu um pulo no loop.....");
                continue;
            }
            
            qtdLoops++;
            System.out.print("\nQuantidade de loops: " + qtdLoops + "\n");            
        }
        
        teclado.close();
              
    }
}
