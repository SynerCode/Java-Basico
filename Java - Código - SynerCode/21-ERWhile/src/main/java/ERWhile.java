/**
 *
 * @author SynerCode
 */
public class ERWhile {

    public static void main(String[] args) {
        boolean verdade = true;
        int controle = 0;
        
        while (verdade){
            if(controle <= 5){
                System.out.print("\nExecutando.....");
            }
            controle++;
            
            if(controle > 5){
                verdade = false;
            }
        }
    }
}
