import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*
    1 - Crie um programa que simule as operações básicas matemáticas (Soma, Divisão, etc...). -OK
        1.1 - A variáveis que receberam os dados devem está fora do método main (precisam ser static). - OK
        1.2 - Crie uma função para exibir o menu, não precisa de parâmentro e nem de retorno. - OK
        1.3 - Crie uma função que recebe dois valor reais para realizar a soma, retorne a informação. - OK
        1.4 - Crie uma função que recebe dois valor reais para realizar a divisão, retorne a informação.
        1.5 - Crie uma função que recebe dois valor reais para realizar a multiplicação, retorne a informação.
        1.6 - Crie uma função que recebe dois valor reais para realizar a subtração, retorne a informação.
*/
public class Exercicio13 {
    
    static Scanner teclado = new Scanner(System.in);
    static int opcao;
    static double valor1;
    static double valor2;
    
    public static void main(String[] args) {
       menu();
       opcao = teclado.nextInt();
       
       switch(opcao){
           case 1:
               System.out.print("\nDigite o primeiro valor: ");
               valor1 = teclado.nextDouble();
               
               System.out.print("\nDigite o segundo valor: ");
               valor2 = teclado.nextDouble();
               
               System.out.print("\nResultado: " + somar(valor1, valor2));               
               break;
               
           case 2:
               System.out.print("\nDigite o primeiro valor: ");
               valor1 = teclado.nextDouble();
               
               System.out.print("\nDigite o segundo valor: ");
               valor2 = teclado.nextDouble();
               
               System.out.print("\nResultado: " + subtrair(valor1, valor2));
               break;
               
           case 3:
               System.out.print("\nDigite o primeiro valor: ");
               valor1 = teclado.nextDouble();
               
               System.out.print("\nDigite o segundo valor: ");
               valor2 = teclado.nextDouble();
               
               System.out.print("\nResultado: " + dividir(valor1, valor2));
               break;
               
           case 4:               
               System.out.print("\nDigite o primeiro valor: ");
               valor1 = teclado.nextDouble();
               
               System.out.print("\nDigite o segundo valor: ");
               valor2 = teclado.nextDouble();
               
               System.out.print("\nResultado: " + multiplicar(valor1, valor2));
               break;
               
           default:
               System.out.print("\nDigite um valor valido....");
       }
       
       teclado.close();
    }
    
    // Função Menu
    static void menu(){
        System.out.print("\n------------------- Calculadora -------------------\n");
        System.out.print("\n1 - Somar.");
        System.out.print("\n2 - Subtrair.");
        System.out.print("\n3 - Dividir.");
        System.out.print("\n4 - Multiplicar.");
        System.out.print("\n\nDigite uma opcao valida: ");
    }
    
    // Função responsável por Somar valores
    static double somar(double valor1, double valor2){
        return valor1 + valor2;
    }
    
    // Função responsável por Subtrair valores
    static double subtrair(double valor1, double valor2){
        return valor1 - valor2;
    }
    
    // Função responsável por Dividir valores
    static double dividir(double valor1, double valor2){
        return valor1 / valor2;
    }
    
    // Função responsável por Multiplicar valores
    static double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }
}
