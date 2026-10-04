import java.util.Scanner;

/**
 *
 * @author SynerCode
 */
public class EntradaDeDados {

    public static void main(String[] args) {
        // Criando um objeto do tipo Scanner
        Scanner teclado = new Scanner(System.in);
        
        
        // Tipo Byte
        byte idade;
        System.out.print("\nDigite sua idade: ");
        idade = teclado.nextByte();        
        System.out.printf("\nVoce digitou o valor %d para a sua idade.", idade);
        
        
        // Tipo Short
        short anoAtual;
        System.out.print("\nDigite o ano atual: ");
        anoAtual = teclado.nextShort();
        System.out.printf("\nVoce disse que o ano atual eh %d", anoAtual);
        
        
        // Tipo Int
        int distancia;
        System.out.print("\nDigite a distancia: ");
        distancia = teclado.nextInt();
        System.out.printf("\nVoce disse que a distancia eh %d", distancia);
        
        
        // Tipo Long
        long anosLuz;
        System.out.print("\nDigite a distancia: ");
        anosLuz = teclado.nextLong();
        System.out.printf("\nVoce disse que a distancia eh %d", anosLuz);        
        
        
        // Tipo Float
        float altura;
        System.out.print("\nDigite a sua altura: ");
        altura = teclado.nextFloat();
        System.out.printf("\nSua altura eh: %.2f", altura);
        
        
        // Tipo Double
        double largura;
        System.out.print("\nDigite a sua largura: ");
        largura = teclado.nextDouble();
        System.out.printf("\nSua largura eh: %.2f", largura);
        
        
        // Tipo Boolean
        boolean ativo;
        System.out.print("\ntrue ou false: ");
        ativo = teclado.nextBoolean();
        System.out.printf("\nVoce digitou: %b", ativo);
        
        
        // Tipo String 1
        String nome;
        System.out.print("\nDigite o seu nome: ");
        nome = teclado.next();
        System.out.printf("\nSeu nome eh: %s", nome);
        
        
        // Tipo String 2
        String nomeComposto;
        System.out.print("\nDigite o seu nome completo: ");
        nomeComposto = teclado.nextLine();
        System.out.printf("\nSeu nome completo eh: %s", nomeComposto);
        
        
        // Tipo Char
        char sexo;
        System.out.print("\nDigite o seu sexo (M ou F): ");
        sexo = teclado.next().charAt(0);
        System.out.printf("\nSeu sexo eh: %c", sexo);
        
        //
        teclado.close();

    }
}
