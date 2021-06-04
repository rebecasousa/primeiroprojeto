
import java.util.List;

public class Disciplina
{
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        aluno1.alteranome();
        aluno1.alteraId();
        Aluno.nota1 = 3.5;
        Aluno.nota2 = 6.5;
        System.out.println("A media do aluno é:" + aluno1.retornaMedia());
        aluno1.passou(false);
    }
    
    Aluno[]alunos = new Aluno[10];
    
    String[]alunos = ("Rebeca","Lucas","Carol","Liz","Luiz","Cintia","Pedro", "Matheus","Julia","Julio");
    int numAluno = 1;
    
    while(numAluno<10){
        
        System.out.println(Aluno[numAluno]);
    }
    
}