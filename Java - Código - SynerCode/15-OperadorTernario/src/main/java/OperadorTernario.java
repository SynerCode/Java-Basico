/**
 *
 * @author SynerCode
 */
public class OperadorTernario {

    public static void main(String[] args) {
        boolean ativo = false;
        int idade = 18;
        int valorSaida = 0;
        //String saida = ativo ? "Voce e maior de idade." : "Voce NAO e maior de idade.";
        String saida = idade >= 18 ? "Voce e maior de idade." : "Voce NAO e maior de idade.";
        System.out.print(saida);
        valorSaida = idade >= 18 ? 500 : 1000;
        System.out.print("\n\n\n" + valorSaida);
        
    }
}
