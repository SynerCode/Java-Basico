import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*

    1º - Faça um programa que:
        1.1 - Salve os dados do aluno digitados pelo o usuário: Nome, 03 (Três) notas e idade.- OK
        1.2 - Calcule a média e salve o cálculo em outra variável. - OK
        1.3 - Se a média for menor que 5 o aluno é reprovado. - OK
        1.4 - Se a média for entre 5 e menor que 7, o aluno está na final. - OK
        1.5 - Se a média for 7 ou maior, ele está aprovado. - OK
        1.6 - Durante a verificação da média, deve ser mostrado o texto no momento da verificação. - OK
        1.7 - Após a verificação da média, você deve verificar se o aluno é maior ou menor de idade. - OK
        1.8 - Finalize o programa mostrando os dados do usuário. - OK
*/

public class Exercicio04 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nomeAluno;
        float nota1;
        float nota2;
        float nota3;
        short idade;
        
        float media = 0;
        
        System.out.print("\nDigite o seu nome: ");
        nomeAluno = teclado.nextLine();
        
        System.out.print("\nDigite sua primeira nota: ");
        nota1 = teclado.nextFloat();
        
        System.out.print("\nDigite sua segunda nota: ");
        nota2 = teclado.nextFloat();
        
        System.out.print("\nDigite sua terceira nota: ");
        nota3 = teclado.nextFloat();
        
        System.out.print("\nDigite sua idade: ");
        idade = teclado.nextShort();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media < 5){
            System.out.print("\nSua media eh: " + media + ". Por isso voce foi REPROVADO...");
        }
        else if (media >= 5 && media < 7){
            System.out.print("\nSua media eh: " + media + ". Por isso voce esta na FINAL...");
        }
        else {
            System.out.print("\nSua media eh: " + media + ". Por isso voce foi APROVADO...");
        }
        
        
        String saida = idade >= 18 ? "\nVoce eh maior de idade" : "\nVoce NAO eh maior de idade";
        System.out.print("\n" + saida);
        
        System.out.print("\nNome do aluno: " + nomeAluno);
        System.out.print("\nNota 1: " + nota1);
        System.out.print("\nNota 2: " + nota2);
        System.out.print("\nNota 3: " + nota3);
        System.out.print("\nIdade: " + idade);
        
        teclado.close();
    }
}
