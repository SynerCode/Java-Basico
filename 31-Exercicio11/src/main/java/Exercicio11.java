import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*
    1º - Crie um programa para utilizar matriz e vetor do (int e float). -OK
        1.1 - A Matriz deve ter tamanho (5 x 5), e o vetor tamanho(5) que armazenara a média
                de cada linha.- OK
        1.2 - Depois voce deve setar os valor para cada posição da matriz digitados pelo usuário. - OK
        1.3 - Depois que a matriz for preenchida, você vai calcular a média  - OK
                de cada linha da matriz e setaro valor dentro do vetor no mesmo indice da linha. 
        1.4 - Após isso, você deve exibir os dados da matriz linha por linha, e 
                ao lado da linha deve colocar  "= media".
*/
public class Exercicio11 {

    public static void main(String[] args) { 
       
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        float[] medias = new float[3];        
        
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print("\nDigite o valor da posicao (" + linha + " , " + coluna + ") : ");
                matriz[linha][coluna] = teclado.nextInt();
            }
        }
        
        float media = 0;
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                media += matriz[linha][coluna];
            }
            medias[linha] = media / matriz[linha].length;
            media = 0;
        }
        
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz[linha].length; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.print(" = " + medias[linha] + "\n");            
        }

        teclado.close();
        
    }
}
