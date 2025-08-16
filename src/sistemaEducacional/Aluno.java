package sistemaEducacional;

public class Aluno {
    private String nome;
    private int rm;
    private int idade;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int rm, int idade, double nota1, double nota2) {
        this.nome = nome;
        this.rm = rm;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno() {}



    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", rm=" + rm +
                ", idade=" + idade +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade inválida");
        }
    }


    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException("Nota inválida");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            throw new IllegalArgumentException("Nota inválida");
        }
    }

}
