/**
 *
 * @author SynerCode
 */
public class ERDoWhile {

    public static void main(String[] args) {
        int controle = 0;
        boolean verdade = true;        
        
        // CUIDADO: LOOP/LAÇO INFINITO
        do {
            System.out.print("\nExecutando...");
            controle++;
            /*Para evitar o loop infinito, nessa situação em questão, basta apenas colocar um condicional*/
            
            /*
            // remover comentário de múltiplas linhas para sair do loop.
            if(controle > 10){
                verdade = false;
            }            
            */
        } while (verdade);
    }
}
