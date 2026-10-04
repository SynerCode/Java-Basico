/**
 *
 * @author SynerCode
 */
public class Strings {

    public static void main(String[] args) {
        
        // String vazia.
        String nome = "";
        
        // Criando uma variável de referência sem referência inicial.
        String nome2 = null;        
        int[] vetor = null;
        int[][] matriz = null;         
        
        nome2 = "Arthur !";
        // Retorna a quantidade de caracteres
        int qtdCaracteres = nome2.length();
        System.out.print("\nQuatidade caracteres: " + qtdCaracteres);
        
        // Retorna o caractere de um stirng baseado no índice
        char letra = nome2.charAt(0);
        System.out.print("\nCaracter: " + letra);        
        
        String texto1 = "Java";
        String texto2 = "JAVT";
        // Método utilizado para verificar se duas strings são iguais (incluindo maiúsculas e minúsculas)
        boolean retorno = texto1.equals(texto2);
        
        // Método utilizado para verificar se duas strings são iguais (Desconsiderando maiúsculas e minúsculas)
        boolean saida2 = texto1.equalsIgnoreCase(texto2);
        System.out.print("\nSao iguais: " + saida2);        
        
        
        String saida = "Curso basico de Java.";
        // Método utilizado para verifica se existe uma sequencia de caracteres dentro de uma string
        boolean retorno1 = saida.contains("curso");
        
        
        // Método utilizado para verifica se uma determinada string COMEÇA com outra (leva em consideração maiúsculas e minúsculas)
        boolean retorno2 = saida.startsWith("curso");
        
        
        // Método utilizado para verifica se uma determinada string TERMINA com outra (leva em consideração maiúsculas e minúsculas)
        boolean retorno3 = saida.endsWith("Java.");
        System.out.print("\nExiste: " + retorno3); 
        
        
        // Métodos de comparação que retornar um inteiro (Observar o Slide da aula)
        System.out.print("\nSaida: " + "ana".compareTo("Ana"));        
        System.out.print("\nSaida: " + "ana".compareToIgnoreCase("Ana"));
        
        
        String palavra = "Banana";
        // Método retornar o índice da primeira ocorrência passada por paâmetro
        // Verificar todas as sobrecargas pelo slide.
        System.out.print("\nIndice: " + palavra.indexOf('a', 2));
        // Método retornar o índice da última ocorrência passada por paâmetro
        // Verificar todas as sobrecargas pelo slide.
        System.out.print("\nIndice: " + palavra.lastIndexOf('a'));
        
        
        String letras = "JaVa";
        // Cria uma nova string e a retorna com todos os caracteres maiúsculos.
        System.out.print("\nSaida: " + letras.toUpperCase());
        // Cria uma nova string e a retornar com todos os caracteres minúsculos.
        System.out.print("\nSaida: " + letras.toLowerCase());
        // Imutabilidade de strings
        System.out.print("\nSaida: " + letras);
        
        
        String saidaTrim = "    Ja        va     ";
        // Método para remover espaços do inicio e final das strings
        System.out.print("\nSaida: " + saidaTrim);
        System.out.print("\nSaida: " + saidaTrim.trim());
        
        
        // Método utilizado para obter uma substring da string original.
        String saidaSubString = "A SynerCode eh a melhor escolha.";
        System.out.print("\nSaida: " + saidaSubString.substring(2, 12));
        
        
        // Método utilizado para substituição de informações.
        String saidaReplace = "Java eh massa, Java eh legal, Java";
        System.out.print("\nSaida: " + saidaReplace.replace("Java", "C"));
        
        
        String saidaSplit = "Java eh uma linguagem muito legal.";
        String[] saidaDoMetodo = null; 
        // Método utilizado para dividir uma string em partes por meio de um delimitador
        saidaDoMetodo = saidaSplit.split("a");        
        for(int i = 0; i < saidaDoMetodo.length; i++){
            System.out.print("\nSaida: " + saidaDoMetodo[i]);
        }
        

        String saidaIsEmpty = " ";      
        // Método utilizado para verificar se a string é vazia
        System.out.print("\nSaida: " + saidaIsEmpty.isEmpty());
        
        
        String saidaIsBlank = "    ";
        System.out.print("\nSaida: " + saidaIsBlank.isBlank());
        
    }
}
