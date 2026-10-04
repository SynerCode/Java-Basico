//import java.lang.Math;
/**
 *
 * @author SynerCode
 */
public class BiblioMath {

    public static void main(String[] args) {        
        
        // Retorna o valor absoluto.
        System.out.print("\nValor positivo: " + Math.abs(-69));
        
        // Retorna o maior valor entre os valores passados por parâmetro.
        System.out.print("\nValor maior: " + Math.max(30, 20));
        
        // Retorna o menor valor entre os valores passados por parâmetro.
        System.out.print("\nValor menor: " + Math.min(2, 15));        
        
        // Retorna o cálculo, o primeiro é a base, e o segundo o expoente.
        System.out.print("\nResultado expoente: " + Math.pow(3, 2));
        
        // Retorna o cálculo da raiz quadrada.
        System.out.print("\nResultado da raiz: " + Math.sqrt(15));
        
        // Arredonda o valor, >= .5 para cima, < .5 para baixo.
        System.out.print("\nValor arredondado: " + Math.round(15.6));
        
        // Arredonda o valor para baixo, independente dos valores das casas decimais.
        System.out.print("\nValor arredondado para baixo: " + Math.floor(15.9));
        
        //Arredonda o valor para cima, independente dos valores das casas decimais.
        System.out.print("\nValor arredondado para cima: " + Math.ceil(15.1));
                
        // Método que gera valores pseudo aleatórios
        double valor = Math.random();
        System.out.print("\nSaida : " + valor);
        
        // Definido o intervalo (valor final do intervalor) + (valor inicial do intervalo)
        int saida = (int) (Math.random() * 10) + 1;
        System.out.print("\nSaida : " + saida);
        
        System.out.print("\nValor de PI: " + Math.PI);
        System.out.print("\nValor de EULER: " + Math.E);
        
        double valorSaida = 3 - Math.PI + 5 - 4 + 8 * 2 + Math.E;
        System.out.print("\nValor: " + valorSaida); 
        
    }
}
