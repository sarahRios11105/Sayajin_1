public class Aluno {
    private String matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        double somaDosPesos = 2.5 + 2.5 + 2.0;
        double somaPonderada = (this.notaProva1 * 2.5) + (this.notaProva2 * 2.5) + (this.notaTrabalho * 2.0);
        return somaPonderada / somaDosPesos;
    }

    public double calculoFinal() {
        double mediaAtual = media();
        double mediaMinima = 7.0;

        if (mediaAtual >= mediaMinima) {
            return 0.0;
        }

        return 10.0 - mediaAtual;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("0260012", "Bob", 6.0, 5.5, 7.0);
        System.out.println("Média: " + aluno.media());
        System.out.println("Precisa na final: " + aluno.calculoFinal());
    }
}