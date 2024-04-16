import java.util.Scanner;

public class Main
{
   void main() {
       Scanner readLine = new Scanner(System.in);
       Cachorro obj = new Cachorro();
       
       System.out.println("Insira o nome do cachorro: ");
       obj.setNome(readLine.next());
       System.out.println("Insira a raça do cachorro: ");
       obj.setRaca(readLine.next());
       System.out.println("Insira a idade do cachorro: ");
       obj.setIdade(readLine.nextInt());
       
       System.out.println("Informações registradas: ");
       System.out.println("Nome: " + obj.getNome());
       System.out.println("Raça: " + obj.getRaca());
       System.out.println("Idade: " + obj.getIdade());
   }
   
}
