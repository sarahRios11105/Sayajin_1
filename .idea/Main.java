public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("0260012", "Bob", 6.0, 5.5, 7.0);

        System.out.println(aluno.media());
        System.out.println(aluno.calculoFinal());
    }
}