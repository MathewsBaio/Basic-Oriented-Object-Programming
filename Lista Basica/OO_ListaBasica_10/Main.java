import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        InstitutoEstatistico ibge = new InstitutoEstatistico("IBGE");
        
        ibge.addHabitante(cadastrarHabitante());
        ibge.addHabitante(cadastrarHabitante());
        
        
        System.out.println("A maior altura dentre os habitantes é "+ibge.maiorAltura().getAltura()+", e pertence ao individuo "+
        ibge.maiorAltura().getNome());
        System.out.println("A menor altura dentre os habitantes é "+ibge.menorAltura().getAltura()+", e pertence ao individuo "+
        ibge.menorAltura().getNome());
        System.out.println("A média de altura entre as mulheres é de "+ibge.mediaAlturaMulheres());
        System.out.println("Existem "+ibge.numeroHomens()+" homens no país");
        System.out.println(ibge.porcentagemHomens()+"% da população é composta por homens e "+ibge.porcentagemMulheres()+
        "% é composta por mulheres");
        System.out.println(ibge.mulheresAdultasLoiras()+
        "% é a proporção de mulheres que possuem entre 18 e 35 anos de idade, são loiras e possuem olhos verdes");
        
    }
    
    public static Pessoa cadastrarHabitante() {
        Scanner readLine = new Scanner(System.in);
        Pessoa hab = new Pessoa();
        
        System.out.print("Nome: ");
        hab.setNome(readLine.next());
        System.out.print("Sexo masculino ou feminino: ");
        hab.setSexo(readLine.next());
        System.out.print("Idade: ");
        hab.setIdade(readLine.nextInt());
        System.out.print("Cor dos olhos: ");
        hab.setCorOlhos(readLine.next());
        System.out.print("Cor dos cabelos: ");
        hab.setCorCabelos(readLine.next());
        System.out.print("Altura em centimetros: ");
        hab.setAltura(readLine.nextDouble());
        
        return hab;
    }
}
