import java.util.ArrayList;
/**
 *
 * @author SynerCode
 */
public class UtilArrayList {

    public static void main(String[] args) {
        
        // Forma de criar um ArrayList
        ArrayList<String> nomes = new ArrayList<>();        
        ArrayList<String> nomesTotais = new ArrayList<String>();        
        ArrayList<String> palavras = new ArrayList<>(10);
        
        ArrayList<Integer> teste = new ArrayList<>();
        
        // Método para adicionar informações.
        nomes.add("Arthur");
        nomes.add("Felipe");
        nomes.add("Paulo");
        nomes.add("Ricardo");
        // Voce também pode informar o indice onde o dado deve ser armazenado.
        nomes.add("Ana");
        nomes.add("Ana");
        nomes.add("Ana");
        nomes.add("Ana");
        
        palavras.add("Joana");
        palavras.add("Gustavo");
        palavras.add("Pedro");
        
        // Atualiza um dado existente, se fornecer uma indice inválido, dar erro.
        nomes.set(3, "Maria");
        
        // Método Get, recupera um dado pelo o indice, desde que o indice exista.
        System.out.print(nomes.get(0));
        
        // Remove serve para remover uma informação, seja pelo dado/Objeto ou indice remove(0).
        nomes.remove("Arthur");
        
        // Size() - retorna a quantidade de elementos da estrutura.
        System.out.print(nomes.size());
        
        // Verifica se a estrutura está vazia, se estiver vazia, retorna true.
        System.out.print(nomesTotais.isEmpty());
        
        // Verifica se existe uma determinado dado dentro da estrutura, se existir, retorna true.
        System.out.print(nomes.contains("Jorge"));
        
        // Retorna o índice da primeira ocorrência, caso exista a informação dentro da estrutura.
        System.out.print(nomes.indexOf("Joana"));
        
        // Retorna o índice da última ocorrência, caso exista a informação dentro da estrutura.
        System.out.print(nomes.lastIndexOf("Julio"));
        
        // Adicona todos elementos de uma estrutura em outra.
        nomes.addAll(palavras);
        System.out.print(nomes);        
        
        // Percorrendo um ArrayList com o FOR padrão.        
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }        
        
        for(String nome : nomes){
            System.out.println(nome);
        }        
        
        // Removendo todos os elementos de um ArrayList.
        nomes.clear();
        System.out.print(nomes);
        
    }
}
