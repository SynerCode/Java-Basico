import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*
    1º - Faça um programa que:
        1.1 - Pergunte pro usuário qual cédula(dinheiro) ele tem em mãos: 0, 1, 2, 5, 10, 20, 50, 100 ou 200.- OK
        1.2 - Utilize o switch para caso acima, incluindo o default para cédulas que não existem.
*/

public class Exercicio05 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int cedula;
        
        System.out.print("\nDigite a cedula que vc possue no momento: ");
        cedula = teclado.nextInt();
        
        switch (cedula){
            case 0:
                System.out.print("\nVoce nao tem dinheiro....");
                break;
                
            case 1:
                System.out.print("\nVoce tem 1 REAL....");
                break;
                
            case 2:
                System.out.print("\nVoce tem 2 REAIS....");
                break;
                
            case 5:
                System.out.print("\nVoce tem 5 REAIS....");
                break;
                
            case 10:
                System.out.print("\nVoce tem 10 REAIS....");
                break;
                
            case 20:
                System.out.print("\nVoce tem 20 REAIS....");
                break;
                
            case 50:
                System.out.print("\nVoce tem 50 REAIS....");
                break;
                
            case 100:
                System.out.print("\nVoce tem 100 REAIS....");
                break;
                
            case 200:
                System.out.print("\nVoce tem 200 REAIS....");
                break;
            
            default:
                System.out.print("\nVoce passou o valor de uma cedula que NAO existe....");
        }
        
        teclado.close();
        
    }
}
