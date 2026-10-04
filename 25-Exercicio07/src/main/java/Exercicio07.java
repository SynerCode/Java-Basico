import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*
    *** EXERCÍCIO COM DO-WHILE

    1º - Faça um programa que simule um menu simples, onde dependendo da informação digitada, deve ser exibido um texto compatível.
        1.1 - Faça a leitura do dados digitado pelo usuário para ser armazenado em um inteiro.
        1.2 - Utilize o Switch-case para vericar o que foi digitado.
        1.3 - Se digitou 1, mostre ao usuário a informaçõa: Cadastrando usuário.
        1.4 - Se digitou 2, mostre ao usuário a informaçõa: Atualizando usuário.
        1.5 - Se digitou 3, mostre ao usuário a informaçõa: Deletando usuário.
        1.6 - Se digitou 0, Deve sair do laço, mas antes exiba o texto: saindo do sistema.

    2º - Você pode criar outras variáveis para manipular o do-while
        
*/
public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int valor;
        boolean continuar = true;
        
        do {            
            System.out.print("\nSistema de cadstro.");
            System.out.print("\nDigite 1 para Cadastrar um usuario.");
            System.out.print("\nDigite 2 para Atualizar um usuario.");
            System.out.print("\nDigite 3 para deletar um usuario.");
            System.out.print("\nDigite 0 para sair do sistema.\n");
            System.out.print("\nDigite uma opcao: ");
            valor = teclado.nextInt();
            
            switch(valor){
                case 1:
                    System.out.print("\nCadastrando usuário.");
                    break;
                    
                case 2:
                    System.out.print("\nAtualizando usuário.");
                    break;
                    
                case 3:
                    System.out.print("\nDeletando usuário.");
                    break;
                    
                case 0:
                    System.out.print("\nSaindo do sistema....");
                    continuar = false;
                    break;
                    
                default:
                    System.out.print("\nVoce digitou um valor errado, digite um valor valido....");
            }
            
        }while(continuar);
        
        teclado.close();
        
    }
}
