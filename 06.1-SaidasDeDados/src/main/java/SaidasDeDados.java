/**
 *
 * @author SynerCode
 */
public class SaidasDeDados {

    public static void main(String[] args) {        
        
        // MÉTODO PRINT( )
        System.out.print("Ola");
        System.out.print(" mundo.");
        
        System.out.print("\n");
        
        // MÉTODO PRINTLN( )
        System.out.println("Arthur");
        System.out.println(" FMS");
        
        // MÉTODO PRINTF( )
        String nome = "Ricardo";
        String sobrenome = "Silva";
        byte idade = 25;
        //System.out.printf("Nome: %s %s \nIdade: %d.", nome, sobrenome, idade);
        System.out.printf("Nome: %s %s %nIdade: %d.%n %n %n", nome, sobrenome, idade);
        
        // Formatação de valores decimais.
        float salario = 214.24147f;
        System.out.printf("Salario: %.1f", salario);
        
        // ALINHAMENTO
        System.out.printf("%10s", "Arthur");
        
        // CARACTERES ESPECIAIS
        System.out.println("\tMinha frase com tabulacao.");
        System.out.println("\\Minha frase com contra barra.");
        System.out.println("Minha frase com \'aspas simples\'.");
        System.out.println("Minha frase com \"aspas duplas\".");        
        
    }
}
