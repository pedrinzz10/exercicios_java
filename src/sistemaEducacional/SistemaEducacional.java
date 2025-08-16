package sistemaEducacional;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SistemaEducacional {
    Set<Aluno> alunosSet;

    public SistemaEducacional(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int rm, int idade, double nota1, double nota2) {
        alunosSet.add(new Aluno(nome, rm, idade, nota1, nota2));
    }

    public void removerAlunoPorRm(int rm) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Aluno c : alunosSet) {
                if (c.getRm() == rm) {
                    alunoParaRemover = c;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public int contarAlunos() {
        return alunosSet.size();
    }

    public void exibirAlunos() {
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public double calcularMediaPorRm(int rm) {
        for (Aluno aluno : alunosSet) {
            if (aluno.getRm() == rm) {
                return (aluno.getNota1() + aluno.getNota2()) / 2;
            }
        }
        throw new RuntimeException("Aluno com RM " + rm + " não encontrado.");
    }

    public boolean verificarAprovacao(int rm) {
        return calcularMediaPorRm(rm) >= 6.0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaEducacional sistema = new SistemaEducacional();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno por RM");
            System.out.println("3 - Exibir todos os alunos");
            System.out.println("4 - Contar alunos cadastrados");
            System.out.println("5 - Calcular média por RM");
            System.out.println("6 - Verificar aprovação por RM");
            System.out.println("7 - Sair");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("RM: ");
                    int rm = sc.nextInt();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Nota 1: ");
                    double nota1 = sc.nextDouble();
                    System.out.print("Nota 2: ");
                    double nota2 = sc.nextDouble();

                    sistema.adicionarAluno(nome, rm, idade, nota1, nota2);
                    System.out.println("Aluno adicionado com sucesso!");
                }
                case 2 -> {
                    System.out.print("RM do aluno para remover: ");
                    int rm = sc.nextInt();
                    sistema.removerAlunoPorRm(rm);
                    System.out.println("Aluno removido (se existia).");
                }
                case 3 -> sistema.exibirAlunos();
                case 4 -> System.out.println("Quantidade de alunos: " + sistema.contarAlunos());
                case 5 -> {
                    System.out.print("RM do aluno: ");
                    int rm = sc.nextInt();
                    try {
                        double media = sistema.calcularMediaPorRm(rm);
                        System.out.println("Média do aluno: " + media);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 6 -> {
                    System.out.print("RM do aluno: ");
                    int rm = sc.nextInt();
                    try {
                        if (sistema.verificarAprovacao(rm)) {
                            System.out.println("Aluno aprovado!");
                        } else {
                            System.out.println("Aluno reprovado!");
                        }
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 7 -> {
                    continuar = false;
                    System.out.println("Saindo do sistema...");
                }
                default -> System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
