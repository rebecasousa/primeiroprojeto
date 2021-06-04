
/** Rebeca Sousa
 * 
 */
 
import java.util.List;

public class Aluno{

     private String nome;
     private int id;
     private double media;
     protected double nota1;
     protected double nota2;
     
public void getNome(String nome){

    System.out.println("Digite um nome:");
}

public void getAlteranome(){
    nomes = new nome[]
    nomes.alteranome("Altere o nome:");
}

public void getAlteraId(){
    ids= new id[]
    Ids.alteraId("Altere o id:");
}

private double retornaMedia(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a primeira nota:");
    nota1 = sc.nextDouble();
    System.out.println("Digite a segunda nota:");
    nota2 = sc.nextDouble();
    calculaMedia(nota1,nota2, media);
    return media;
}
}
   

