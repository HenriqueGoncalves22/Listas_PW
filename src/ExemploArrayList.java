import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        //Add -> adiciona elementos na lista
        nomes.add("Eliane");
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Fatima");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        nomes.add(1,"Joao");
        System.out.println("=================================\n");
        for (String nome: nomes) {
            System.out.println(nome);
        }
        System.out.println("=================================\n");
        System.out.println("Tamanho da lista: " + nomes.size());
        nomes.remove(2);
        for (String nome: nomes) {
            System.out.println(nome);
        }

        //Verificar se existe um nome na lista
        System.out.println("=================================\n");
        if(nomes.contains("Ana")){
            System.out.println("Existe na lista");
        }
        else {
            System.out.println("Não existe na lista");
        }

        //Ordenar uma lista
        nomes.sort(null);
        System.out.println("=================================\n");
        for (String nome: nomes){
            System.out.println(nome);
        }

        //Método
        System.out.println("=================================\n");
        //nomes.forEach(n -> System.out.println(n)) => nomes.forEach(System.out::println);
        nomes.forEach(System.out::println);


    }
}
