/**
 *
 * @author SynerCode
 */
public class ArraysVetores {

    public static void main(String[] args) {
        // Declaração
        int[] valores = new int[5];
        
        // Declaração e criação com a tribuição de informações
        int[] dados = {10, 20, 30, 55, 96, 47, 584, 632};        
        
        int[] notas = new int[10];
        
        // Declaração e criação
        String[] nomes = new String[50];
        
        
        System.out.print("\nValor: " + dados[1]);        
        dados[1] = 80;        
        System.out.print("\nValor: " + dados[1]);
        
        
        valores[1] = 58;
        System.out.print("\nValor222: " + valores[1]);
        int tamanho = dados.length;
        System.out.print("\nTamanho do vetor: " + tamanho);
        
        
        int qtd = dados.length;
        for(int i = 0; i < dados.length; i++){
            System.out.print("\nValor: " + dados[i]);
        }
        
        
        int i = 0;
        while(i < dados.length){
            System.out.print("\nValor: " + dados[i]);
            i++;
        }
        
        
        // For-each
        for(int dado : dados){
            System.out.print("\nValor: " + dado);
        }
        
        
        String[] nomes2 = {"Felipe", "Gustavo", "Ricardo", "Silva", "Maria", "Jose"};         
        for(String nome : nomes2){
            System.out.print("\nNome: " + nome);
        }
       
    }
}
