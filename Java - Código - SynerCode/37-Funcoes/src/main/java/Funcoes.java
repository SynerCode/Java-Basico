/**
 *
 * @author SynerCode
 */
public class Funcoes {
        
    public static void main(String[] args) {
        // Chamando a funçao mais de uma vez.
        saidaOlaMundo();
        saidaOlaMundo();
        saidaOlaMundo();
        saidaOlaMundo();
        
        String nome = "Felipe";
        saida2(nome, "Silva");
        
        int valor = 10;        
        saidaValor(valor);        
        System.out.print("\nValor Original: " + valor);
        
        int[] valores = {10, 20, 30};
        int valorr = 10;
        funcaoComReferencia(valores);
        
        saidaVetorFinal(valores);
        
        System.out.print("\nValor modificado: " + valores[0]);
        
        funcaoSemRetorno();
        
        int retornoFuncao = retornoInteiro();
        System.out.print("\nSaida do retorno: " + retornoFuncao);
        
        funcaoComReturnSemRetorno(5); 
        
        int[] dados;        
        dados = funcaoComRetornoNulo();
        
    } 
    
    // Criação de uma função.
    static void saida(){
       
    }
   
    // Função sem parâmetros (não existe a criação de variáveis dentro do () ).
    static void saidaOlaMundo(){
        System.out.print("\nOla, mundo.");
    }
    
    // Função com parâmentros (existe a criação de variáveis dentro do () ).
    static void saida2(String nome, String sobrenome){
        System.out.print("\nNome: " + nome + " " + sobrenome);
    }    
    
    static void saidaValor(int valor){
        valor = 100;
        System.out.print("\nValor na funcao: " + valor);
    }    
    
    static void funcaoComReferencia(int[] informacoes){
        informacoes[0] = 500;        
    }
    
    // Função recebe um valor, e não uma referência, logo NÃO é possível modificar a variável original
    static void saidaDoValorComFinal(final int valor){
        //valor = 200;
    }
    
    // Função recebe uma referência, e não o valor, logo é possível modificar a variável original
    static void saidaVetorFinal(final int[] valores){
        valores[0] = 8888;
    }
 
    // Função sem retorno - VOID
    static void funcaoSemRetorno(){
        System.out.print("\nFuncao sem retorno......");
    }
    
    // Função com retorno - INT
    static int retornoInteiro(){
        return 10;
    }
    
    // Função sem retorno - VOID, mas que utiliza o RETURN para sair da função caso algo aconteça.
    static void funcaoComReturnSemRetorno(int valor){
        
        if(valor < 0){
            System.out.print("\nVoce saiu da funcao.");
            return;
        }
        
        System.out.print("\nVoce nao saiu da funcao, executou ate o final....");
        
    }
    
    // Função que retorno uma referência NULA.
    static int[] funcaoComRetornoNulo(){
        int[] vetor = new int[7];
        
        return null;
    }
    
    static int saidaConvertida(){
        double saida = 214.2222;
        
        return (int) saida;
    }
    
    static double saidaSemConversao(){
        int saida = 25;
        
        return saida;
    }
    
}
