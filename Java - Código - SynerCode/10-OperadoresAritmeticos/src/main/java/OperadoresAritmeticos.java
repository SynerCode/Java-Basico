/**
 *
 * @author SynerCode
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {        

        byte valor1 = 10;
        byte valor2 = 3;
        byte valor3 = 5;
        
        // Adição
        int soma = valor1 + valor2 + valor3;
        System.out.print("\nAdicao: " + (valor1 + valor2 + valor3));
        //System.out.print("\nAdicao: " + soma);
        
        // Subtração
        int subtracao = valor1 - valor2;
        System.out.print("\nSubtracao: " + subtracao);
        
        // Multiplicação
        int mult = valor1 * valor2;
        System.out.print("\nMulti: " + mult);
        
        // Divisão
        float div = valor1 / valor2;
        // float div = (float)valor1 / (float)valor2;
        // float div = (float)valor1 / valor2;
        System.out.print("\nDivisao: " + div);
        
        // Módulo (Resto da Divisão).
        int modulo = valor1 % valor2;
        System.out.print("\nModulo: " + modulo);
    }
}
