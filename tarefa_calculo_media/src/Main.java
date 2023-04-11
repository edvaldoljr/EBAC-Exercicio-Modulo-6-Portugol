public class Main {
    public static void main(String[] args) {

        MediaAluno aluno = new MediaAluno("Edvaldo junior", 10, 8, 9, 10);

        System.out.println("Média Aluno");
        System.out.println(aluno.calculandoMedia());
    }
}