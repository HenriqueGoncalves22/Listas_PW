public class Vetor {
    public static void main(String[] args) {
        //declarando um vetor
        String[] alunos = new String[5];
        alunos[0] = "Eliane";
        alunos[1] = "Ana";
        alunos[2] = "Maria";
        alunos[3] = "Joao";
        alunos[4] = "Murilo";

        System.out.println("Alunos:\n");
        for (int i=01; i< alunos.length; i++)
        {
            System.out.println(alunos[i]);
        }

    }
}
