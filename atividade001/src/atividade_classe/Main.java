package atividade_classe;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rhayssa", "03/08/2002", 20);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getDataNascimento());
        System.out.println(pessoa.getIdade());
    }
}
