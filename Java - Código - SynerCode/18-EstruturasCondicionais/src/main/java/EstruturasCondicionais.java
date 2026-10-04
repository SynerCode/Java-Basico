/**
 *
 * @author SynerCode
 */
public class EstruturasCondicionais {

    public static void main(String[] args) {
        
        
        // IF
        int idade = 22;        
        
        if (idade >= 18 && idade < 60){
            System.out.print("\nVoce eh maior de idade....");
        }
        
        
        // IF-ELSE - Condição binária
        if (idade >= 18){
            System.out.print("\nVoce eh maior de idade....");
        }
        // ELSE sempre será executado se o IF ou qualquer outra condição anterior não for executado
        else {
            System.out.print("\nVoce NAO eh maior de idade....");
        }        

        
        // IF-ELSE IF-ELSE
        if (idade > 18 && idade < 25){
            System.out.print("\nExecutado o IF....");
        }
        else if (idade >= 25 && idade < 45){
            System.out.print("\nExecutado o PRIMEIRO ELSE - IF....");
        }
        else if (idade >= 46 && idade < 60){
            System.out.print("\nExecutado o SEGUNDO ELSE - IF....");
        }
        // ELSE sempre será executado se o IF ou qualquer outra condição anterior não for executado
        else {
            System.out.print("\nExecutado o ELSE....");
        } 
        
        
        // Modo de uso e possíveis erros (Assistir aula para entender).
        if (idade > 18 && idade < 25){
            System.out.print("\nExecutado o IF....");
        }        
        
        if (idade > 18){
            System.out.print("\nExecutado o IF....");
        }
        
        
        // Switch-Case
        int opcao = 4;
        
        switch (opcao){
            case 1:
                System.out.print("\nCase 1.");
                break;
                
            case 2:
                System.out.print("\nCase 2.");
                break;
                
            case 3:
                System.out.print("\nCase 3.");
                break;
                
            case 4:
                System.out.print("\nCase 4.");
                break;
                
            default:
                System.out.print("\nDEFAULT.");               
            
        }
        
    }
}
