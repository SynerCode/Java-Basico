import java.util.Scanner;
/**
 *
 * @author SynerCode
 */

/*
    1º - Faça um programa que:
        1.1 - Leia e armazene nome do aluno e 3 notas do mesmo (armazenar em vetor as notas).
        1.2 - A leitura das notas so deve parar quando o usuario digitar uma nota válida:
            1.2.1 - O valor da nota tem que ser maior igual a 0 e menor igual a 10. - OK
        1.3 - Após a leitura das informações, voce deve calcular a média com um estrutura de repetição. - OK
        1.4 - No final, você deve mostrar todos os dados, nome, as notas e a média, e deve verificar se o aluno foi aprovado.
            1.4.1 - Considere abaixo de 5 reprovado, entre 5 e menor que 7 final,e aprovado com nota maior ou igual a 7.

*/
public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        String nomeAluno;
        float[] notas = new float[3];
        boolean continuar = true;
        
        System.out.print("\nDigite seu nome: ");
        nomeAluno = teclado.nextLine();
        
        int indice = 0;
        
        while(continuar){
            
            System.out.print("\nDigite a " + (indice + 1) + " nota: ");
            float nota = teclado.nextFloat();
            
            if(nota < 0 || nota > 10){
                System.out.print("\nDigite uma nota valida.....\n");
                continue;
            }
            else{
                notas[indice] = nota;
                indice++;
            }            
            
            if(indice == 3){
                break;
            }
        }
        
        float media = 0;
        
        for(int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        media = media/3;
        
        System.out.print("\nNome: " + nomeAluno);
        for(int i = 0; i < 3; i++){
            System.out.print("\nNota: " + (i + 1) + ": " + notas[i]);
        }
        System.out.print("\nMedia: " + media);
        
        if(media < 5){
            System.out.print("\nVoce foi Reprovado....");
        }
        else if(media >= 5 && media < 7){
            System.out.print("\nVoce esta na Final....");
        }
        else{
            System.out.print("\nVoce foi APROVADO.....");
        }
        
        teclado.close();
    }
}
