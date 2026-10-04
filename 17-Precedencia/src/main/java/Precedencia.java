/**
 *
 * @author SynerCode
 */
public class Precedencia {

    public static void main(String[] args) {
        
        int result1 = 10 - 2 * 5;
        System.out.print("\nResultado: " + result1);        
        
        int result2 = 10 / 2 * 5;
        System.out.print("\nResultado: " + result2);
        
        int result3 = 10 / (2 * 5);
        System.out.print("\nResultado: " + result3);        
        
        int result4 = 10 / (2 * 5) + (1 - 3) * (7 * 2);
        // 10 / 10 + (-2) * 14
        // 1 - 28
        // -27        
        System.out.print("\nResultado: " + result4);
        
    }
}
