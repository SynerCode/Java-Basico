import java.util.Arrays;
/**
 *
 * @author SynerCode
 */
public class BiblioArrays {

    public static void main(String[] args) {
        int[] valores = {50, 20, 10, 4, 54, 16, 3, 5, 89};
        
        // Cria uma cópia de um determinado vetor:
        // Se a quantidade for menor que o tamanho do original, passa os valores até a quantidade.
        // Se a quantidade for maior que o tamanho do original, passa todos os valores do original adicionados com os outros indices com valor 0
        int[] saidaCopia = Arrays.copyOf(valores, 15);
        
        // Copia dados de um vetor para outro definido pelo intervalo passado.
        int[] saidasGerais = Arrays.copyOfRange(valores, 2, 25);
        
        // Ordena os dados de um vetor.
        Arrays.sort(valores);
        
        // Substituindo/Setando valores iguais para um vetor dentro de um intervalo.
        // (Vetor, Indice inicial, Indice final - 1, valor que deve ser setado).
        // (vator, valor) sem definir o intervalo.
        Arrays.fill(valores, 1, 5, 100);

        int[] vetor1 = {10, 20, 30, 40, 50};
        int[] vetor2 = {10, 20, 30, 40, 51};        
        // Converte para uma representação textual o vetor.
        System.out.print("\nsaida: " + Arrays.toString(vetor1));
        
        int[] ordenado = {10, 20, 30, 40, 50, 60};
        int[] semOrdem = {70, 1, 5, 47, 85, 24, 16, 3, 7};
        
        // Ordenar vetor
        //Arrays.sort(semOrdem);
        
        System.out.print("\nSaida: " + Arrays.binarySearch(semOrdem, 3));
    }
}
