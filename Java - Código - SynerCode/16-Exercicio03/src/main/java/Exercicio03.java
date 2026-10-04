import java.util.Scanner;

/**
 *
 * @author SynerCode
 */

/*
    1º - Desenvolva o programa que faça leitura dos dados e armazene essas informações em variáveis compatíveis.
        1.1 - Nome Completo Aluno, 3 notas ( vc deve criar campos para armazenar cada uma) e idade. - OK

    2º - Após a leitura das informações, você deve fazer o cálculo da média. - OK
        2.1 - Cálculo da média é igual a soma de tudo, dividido pela quantidade.
        2.2 - Para isso, faça a criação de uma variável, para receber a soma dos dados das notas por atribuição composta.
        2.3 - Faça outra variável para receber a divisão da média.

    3º - Em seguida, deve verificar se a média é suficiente para ser aprovado. - OK
        3.1 - Aprovado é 7, abaixo disso considere como reprovado.

    4º - Na sequencia, você deve verificar se o aluno é maior de idade e se foi aprovado e retornar a informação. - OK

    5º - Para finalizar, faça um pré-incremento na média como forma de bônus e exiba todos os dados.
        5.1 - Nome completo, todas as notas, idade, média e média com o bônus.
    
*/
public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nomeAluno;
        float nota1;
        float nota2;
        float nota3;
        short idade;
        
        System.out.print("\nDigite seu nome completo: ");
        nomeAluno = teclado.nextLine();
        
        System.out.print("\nDigite sua primeira nota: ");
        nota1 = teclado.nextFloat();
        
        System.out.print("\nDigite sua segunda nota: ");
        nota2 = teclado.nextFloat();
        
        System.out.print("\nDigite sua terceira nota: ");
        nota3 = teclado.nextFloat();
        
        System.out.print("\nDigite sua idade: ");
        idade = teclado.nextShort();
        
        
        float somaMedia = 0;
        
        somaMedia += nota1;
        somaMedia += nota2;
        somaMedia += nota3;
        
        float media = somaMedia / 3;
        
        boolean aprovado = media >= 7 ? true : false;
        
        String resultadoGeral = aprovado && (idade >= 18) ? "Voce eh maior de idade e foi aprovado." : "Voce NAO eh maior de idade ou NAO foi aprovado.";
          
        
        System.out.print("\nSeu nome completo: " + nomeAluno);
        System.out.print("\nNota 1: " + nota1);
        System.out.print("\nNota 2: " + nota2);
        System.out.print("\nNota 3: " + nota3);
        System.out.print("\nIdade: " + idade);
        System.out.print("\nMedia: " + media);
        System.out.print("\nMedia com bonus: " + (++media));
        System.out.print("\nResultado geral: " + resultadoGeral);
        
        /*  Após toda a utilização do Scanner, deve-se fechar a leitura.
            Durante a aula acabei esquecendo, mas já atualizei :-)
        */
        teclado.close();
    }
}
