import java.util.ArrayList;
import java.util.List;

public class ExemploArrayObjeto {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome="Isaque";
        aluno.telefone="7846549548";
        Aluno aluno1 = new Aluno("Maria", "7545649877");

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        alunos.add(aluno1);

        alunos.forEach(a -> {
            System.out.println(a.nome);
            System.out.println("telefone: "+ a.telefone);
            System.out.println("--------------------");});

    }
}
