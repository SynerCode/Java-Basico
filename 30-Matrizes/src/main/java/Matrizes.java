/**
 *
 * @author SynerCode
 */
public class Matrizes {

    public static void main(String[] args) {
        
        // Declaração
        int[][] matriz1;
        
        // Declaração e criação.
        int[][] matriz2 = new int[5][5];        
        
        // Declaração, Criação com passagem de informações
        int[][] matriz3 = {
            {10, 20, 30}, // Linha 0
            {40, 50, 60}, // Linha 1
            {70, 80, 90}, // Linha 2
            {100, 100, 120}
        };        
       
        
        System.out.print("\nSaida: " + matriz3[0][1]);
        
        matriz3[0][1] = 110;
        
        System.out.print("\nSaida: " + matriz3[0][1]);
        
        matriz2[0][0] = 150;
        System.out.print("\nSaida2: " + matriz2[0][0]); 
        
        
        int linhas = 0;
        int colunas = 0;
        
        linhas = matriz3.length;
        System.out.print("\nQuantidade de linhas: " + linhas); 
        
        colunas = matriz3[3].length;
        System.out.print("\nQuantidade de colunas: " + colunas);        
        
        for(int linha = 0; linha < matriz3.length; linha++){
            
            for(int coluna = 0; coluna < matriz3[linha].length; coluna++){
                System.out.print( matriz3[linha][coluna] + " "); 
            }
            System.out.print("\n");             
        }        
        
        System.out.print("\n\n\n");        
        
        for(int coluna = 0; coluna < matriz3[0].length; coluna++){
            
            for(int linha = 0; linha < matriz3.length; linha++){
                System.out.print( matriz3[linha][coluna] + " "); 
            }
            System.out.print("\n");             
        }
        
        System.out.print("\n\n\n");
       
        for(int[] valores : matriz3){
            
            for(int valor : valores){
                System.out.print(valor + " ");
            }
            System.out.print("\n");            
        }
        
    }
}
