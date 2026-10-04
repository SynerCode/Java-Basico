import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author SynerCode
 */
public class SistemaEscolar {
    
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<Double> notas = new ArrayList<>();
    static boolean controleGeralDoSistema = true;    
    
    public static void main(String[] args) {
        int opcao;
        
        do{
            menu();
            System.out.println("\nDigite uma opcao: ");
            opcao = teclado.nextInt();
            
            switch(opcao){
                case 0:
                    System.out.println("\nSaindo do Sistema Escolar......");
                    controleGeralDoSistema = false;
                    break;
                    
                case 1:
                    cadastrarAlunoENotas(teclado, nomes, notas);
                    break;
                    
                case 2:
                    localizarAlunoPeloNome(teclado, nomes, notas);
                    break;
                    
                case 3:
                    removerAlunoPeloID(teclado, nomes, notas);
                    break;
                    
                case 4:
                    atulizarDadosDoAluno(teclado, nomes, notas);
                    break;
                    
                case 5:
                    exibirAlunos(nomes, notas);
                    break;
                    
                default:
                    System.out.println("\nDigite uma opcao Valida.....");
            }           
        }while(controleGeralDoSistema);
    }
    
    static void menu(){
        System.out.println("\n================= Sistema Escolar =================\n");
        
        System.out.println("1 - Cadastrar Aluno e Notas.");
        System.out.println("2 - Buscar Aluno pelo Nome.");
        System.out.println("3 - Remover Aluno pelo Indice.");
        System.out.println("4 - Atualizar dados do Aluno.");
        System.out.println("5 - Listar todos os Alunos.");
        System.out.println("0 - Sair do Sistem.");
    }
    
    static void cadastrarAlunoENotas(Scanner teclado, ArrayList<String> nomes, ArrayList<Double> notas ){        
        teclado.nextLine();        
        boolean controleGeral = true;
        boolean subControleInterno = true;
        
        while(controleGeral){
            System.out.println("\nDigite o nome do Aluno: ");
            String nome = teclado.nextLine();
            
            if(nome.isBlank()){
                System.out.println("\nDigite um nome valido...");
                continue;
            }            
            nomes.add(nome);
            
            int i = 1;            
            do{                
                System.out.println("Digite Nota " + i + " : ");
                double nota = teclado.nextDouble();
                
                if(nota >= 0.0 && nota <= 10.0){
                    notas.add(nota);
                    i++;
                }
                else{
                    System.out.println("Digite uma Nota dentro do intevalo (0, 10).");
                }                
                
                if(i > 4){
                    controleGeral = false;
                    subControleInterno = false;
                }
                
            }while(subControleInterno);            
        }       
    }
    
    static void localizarAlunoPeloNome(Scanner teclado, ArrayList<String> nomes, ArrayList<Double> notas){
        
        if(nomes.isEmpty()){
            System.out.println("\nAinda nao existe alunos cadastrados dentro da estrutura.\n");
            return;
        }
        
        teclado.nextLine();        
        System.out.println("\nDigite o nome do Aluno para busca-lo: ");
        String nomeParaBuscar = teclado.nextLine();
        
        //int indiceAluno;
        boolean encontrado = false;
        
        for(int i = 0; i < nomes.size(); i++){            
            String aluno = nomes.get(i);
            
            if(aluno.contains(nomeParaBuscar)){
                System.out.println("\nIndice Aluno: " + i);
                System.out.println("\nNome Completo do Aluno: " + nomes.get(i));
                
                int inicio = i * 4;
                double media = calcularMedia(notas, i);
                System.out.println("Nota 1: " + notas.get(inicio));
                System.out.println("Nota 1: " + notas.get(inicio + 1));
                System.out.println("Nota 1: " + notas.get(inicio + 2));
                System.out.println("Nota 1: " + notas.get(inicio + 3));
                System.out.printf("Media: %.2f\n", media);
                System.out.println("Situacao do Aluno:" + verificarSituacao(media));
                encontrado = true;
            }            
        }
        
        if(encontrado == false){
            System.out.println("\nNao existe alunos com o nome passado para busca: (" + nomeParaBuscar + "). \n");
        }        
    }
    
    static void removerAlunoPeloID(Scanner teclado, ArrayList<String> nomes, ArrayList<Double> notas){
        
        if(nomes.isEmpty()){
            System.out.println("\nEstrutura vazia, nao ha o que remover....\n");
            return;
        }
        
        boolean controle = true;        
        while(controle){
            System.out.println("\nDigite o indice do aluno para remove-lo: ");
            int indiceAluno = teclado.nextInt();
            
            if(indiceAluno < 0){
                System.out.println("\nDigite um indice positivo....\n");
                continue;
            }
            
            if(indiceAluno > nomes.size() - 1){
                System.out.println("\nDigite um indice dentro do tamanho da estrutura.\n");
                continue;
            }
            
            int inicio = indiceAluno * 4;            
            nomes.remove(indiceAluno);
            notas.remove(inicio);
            notas.remove(inicio);
            notas.remove(inicio);
            notas.remove(inicio);
            
            System.out.println("\nNome do Aluno e sua notas excluidas....");
            controle = false;            
        }
    }
    
    static void atulizarDadosDoAluno(Scanner teclado, ArrayList<String> nomes, ArrayList<Double> notas){
        
        if(nomes.isEmpty()){
            System.out.println("\nAinda nao existe dados cadastrados para ser atualizado....");
            return;
        }
        
        boolean controle = true;
        
        while(controle){
            System.out.println("\nDigite o Indice do Aluno para atualizar ou -1 para sair: ");
            int indice = teclado.nextInt();
            
            if(indice == -1){
                System.out.println("\nRetornando ao menu principal....\n");
                controle = false;
                return;
            }
            
            if(indice < -1 || indice > nomes.size() - 1){
                System.out.println("\nDigite um indice valido....\n");
                continue;
            }
            
            boolean atualizar = true;
            
            while(atualizar){
                System.out.println("\nEscolha a opcao que deseja atualizar.");
                System.out.println("1 - Nome do Aluno.");
                System.out.println("2 - Nota 1 do Aluno.");
                System.out.println("3 - Nota 2 do Aluno.");
                System.out.println("4 - Nota 3 do Aluno.");
                System.out.println("5 - Nota 4 do Aluno.");
                System.out.println("0 - Para sair.");
                System.out.println("\nDigite um opcao: ");
                int opcao = teclado.nextInt();
                double novaNota;
                int posicaoInicial = indice * 4;
                
                switch(opcao){
                    
                    case 0:
                        controle = false;
                        atualizar = false;
                        System.out.println("\nRetornando para o Menu principal...");
                        break;
                        
                    case 1:
                        teclado.nextLine();
                        System.out.println("\nDigite o novo Nome do Aluno: ");
                        String novoNome = teclado.nextLine();
                        nomes.set(indice, novoNome);
                        System.out.println("\nNome do aluno foi atualizado....");
                        break;
                        
                    case 2:
                        System.out.println("\nDigite a nova nota 1 do Aluno: ");
                        novaNota = teclado.nextDouble();
                        notas.set(posicaoInicial, novaNota);
                        System.out.println("\nNota 1 do aluno foi atualizada....");
                        break;
                        
                    case 3:
                        System.out.println("\nDigite a nova nota 2 do Aluno: ");
                        novaNota = teclado.nextDouble();
                        notas.set(posicaoInicial + 1, novaNota);
                        System.out.println("\nNota 2 do aluno foi atualizada....");
                        break;
                        
                    case 4:
                        System.out.println("\nDigite a nova nota 3 do Aluno: ");
                        novaNota = teclado.nextDouble();
                        notas.set(posicaoInicial + 2, novaNota);
                        System.out.println("\nNota 3 do aluno foi atualizada....");
                        break;
                        
                    case 5:
                        System.out.println("\nDigite a nova nota 4 do Aluno: ");
                        novaNota = teclado.nextDouble();
                        notas.set(posicaoInicial + 3, novaNota);
                        System.out.println("\nNota 4 do aluno foi atualizada....");
                        break;
                        
                    default:
                        System.out.println("\nDigite uma opcao Valida.....");                    
                }                
            }
        }        
    }
    
    static double calcularMedia(ArrayList<Double> notas, int indiceAluno){        
        int inicio = indiceAluno * 4;
        
        double nota1 = notas.get(inicio);
        double nota2 = notas.get(inicio + 1);
        double nota3 = notas.get(inicio + 2);
        double nota4 = notas.get(inicio + 3);
        
        return (nota1 + nota2 + nota3 + nota4) / 4;    
    }
   
    static String verificarSituacao(double media){
     
        if(media >= 7.0){
            return "APROVADO";
        }
        else if(media >= 5.0){
            return "FINAL";
        }
        else{
            return "REPROVADO";
        }
    }
    
    static void exibirAlunos(ArrayList<String> nomes, ArrayList<Double> notas){
        
        if(nomes.isEmpty()){
            System.out.println("\nNao existe aluno cadastrado....");
            return;
        }
        
        System.out.println("\n ====== Informacoes dos Alunos ======\n");
        
        for(int i  = 0; i < nomes.size(); i++){
            int inicio = i * 4;
            double media = calcularMedia(notas, i);
            String situacao = verificarSituacao(media);
            
            System.out.println("\nIndice: " + i);
            System.out.println("Nome: " + nomes.get(i));
            System.out.println("Nota 1: " + notas.get(inicio));
            System.out.println("Nota 2: " + notas.get(inicio + 1));
            System.out.println("Nota 3: " + notas.get(inicio + 2));
            System.out.println("Nota 4: " + notas.get(inicio + 3));
            System.out.printf("Media: %.2f\n", media);
            System.out.println("Situacao: " +  situacao);            
        }        
    }
    
}
