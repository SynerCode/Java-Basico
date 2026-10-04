/**
 *
 * @author SynerCode
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        
        // O.L com Curto.
        // && = AND = E
        int idade = 20;
        boolean resultado1 = idade <= 60 && idade <= 18;
        System.out.print("\nResultado1: " + resultado1);
        
        // || = OR = OU
        boolean resultado2 = idade <= 60 || idade <= 18;
        System.out.print("\nResultado2: " + resultado2);
        
        // ! = Negação
        boolean resultado3 = !(idade <= 60 && idade <= 18);
        System.out.print("\nResultado3: " + resultado3);
        
        
        // O.L sem Curto.
        // & = AND
        boolean resultado4 = idade <= 60 & idade <= 18;
        System.out.print("\nResultado4: " + resultado4);
        
         // | = OR = OU
        boolean resultado5 = idade <= 60 | idade <= 18;
        System.out.print("\nResultado5: " + resultado5);
        
        // ^ = XOR = Ou exclusivo
        boolean resultado6 = (idade <= 60 ^ idade >= 18);
        System.out.print("\nResultado6: " + resultado6);
    }
}
