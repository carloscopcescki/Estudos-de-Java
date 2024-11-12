package br.fsa;

import org.apache.commons.cli.*;
import br.fsa.pessoas.Aluno;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class GerenciaFaculdade {
    public static void main(String[] args) {
        Options options = new Options();

        // Define as opções
        options.addOption("verificaDados", false, "Verifica a consistência dos dados.");
        options.addOption("addAluno", false, "Adiciona um aluno.");
        options.addOption("listaAluno", false, "Lista todos os alunos.");
        options.addOption("editaAluno", true, "Edita um aluno pelo código.");
        options.addOption("addProfessor", false, "Adiciona um professor.");
        options.addOption("listaProfessor", false, "Lista todos os professores.");
        options.addOption("editaProfessor", true, "Edita um professor pelo código.");
        options.addOption("addCurso", false, "Adiciona um curso.");
        options.addOption("listaCurso", false, "Lista todos os cursos.");
        options.addOption("addMateria", false, "Adiciona uma matéria.");
        options.addOption("listaMateria", true, "Lista todas as matérias de um curso.");
        options.addOption("tipoAvaliacao", true, "Define o tipo de avaliação para uma nota.");
        options.addOption("NotaAluno", true, "Define o código do aluno para a nota.");
        options.addOption("NotaMateria", true, "Define o código da matéria para a nota.");
        options.addOption("Nota", true, "Define o valor da nota.");
        options.addOption("FechaMedia", true, "Calcula e exibe a média final de um aluno.");

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("verificaDados")) {
                verificaDados();
            } else if (cmd.hasOption("addAluno")) {
                addAluno();
            } else if (cmd.hasOption("listaAluno")) {
                listaAluno();
            } else if (cmd.hasOption("editaAluno")) {
                editaAluno(cmd.getOptionValue("editaAluno"));
            } else if (cmd.hasOption("addProfessor")) {
                addProfessor();
            } else if (cmd.hasOption("listaProfessor")) {
                listaProfessor();
            } else if (cmd.hasOption("editaProfessor")) {
                editaProfessor(cmd.getOptionValue("editaProfessor"));
            } else if (cmd.hasOption("addCurso")) {
                addCurso();
            } else if (cmd.hasOption("listaCurso")) {
                listaCurso();
            } else if (cmd.hasOption("addMateria")) {
                addMateria();
            } else if (cmd.hasOption("listaMateria")) {
                listaMateria(cmd.getOptionValue("listaMateria"));
            } else if (cmd.hasOption("tipoAvaliacao") && cmd.hasOption("NotaAluno")
                    && cmd.hasOption("NotaMateria") && cmd.hasOption("Nota")) {
                addNota(cmd.getOptionValue("tipoAvaliacao"),
                        cmd.getOptionValue("NotaAluno"),
                        cmd.getOptionValue("NotaMateria"),
                        Double.parseDouble(cmd.getOptionValue("Nota")));
            } else if (cmd.hasOption("FechaMedia")) {
                fechaMedia(cmd.getOptionValue("FechaMedia"));
            } else {
                formatter.printHelp("java br.fsa.GerenciaFaculdade", options);
            }
        } catch (ParseException e) {
            System.out.println("Erro ao interpretar comandos: " + e.getMessage());
            formatter.printHelp("java br.fsa.GerenciaFaculdade", options);
        }
    }

    // Métodos de exemplo
    private static void verificaDados() {
        System.out.println("Verificando consistência dos dados...");
        // Implementar lógica de verificação
    }

    private static void addAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os dados do novo aluno:");
        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Data de nascimento (dd/mm/yyyy): ");
        String dataNascStr = scanner.nextLine();
        Date dataNasc = null;
        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
            dataNasc = simpleDateFormat.parse(dataNascStr);
        } catch (Exception e) {
            System.out.println("Data inválida");
            dataNasc = new Date();
        }

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Número: ");
        String numero = scanner.nextLine();

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Estado: ");
        String estado = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("RG: ");
        String rg = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        System.out.print("Código único: ");
        String codUnico = scanner.nextLine();

        Aluno aluno = new Aluno(nome, dataNasc, cep, rua, numero, cidade, estado, telefone, genero, rg, cpf, curso, codUnico);

        System.out.println("Aluno adicionado!");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Código Único: " + aluno.getCodUnico());
    }

    private static void listaAluno() {
        System.out.println("Listando todos os alunos...");
        // Implementar listagem dos alunos
    }

    private static void editaAluno(String codigoAluno) {
        System.out.println("Editando aluno de código: " + codigoAluno);
        // Implementar lógica de edição do aluno
    }

    private static void addProfessor() {
        System.out.println("Adicionando um novo professor...");
        // Implementar criação e armazenamento do professor
    }

    private static void listaProfessor() {
        System.out.println("Listando todos os professores...");
        // Implementar listagem dos professores
    }

    private static void editaProfessor(String codigoProfessor) {
        System.out.println("Editando professor de código: " + codigoProfessor);
        // Implementar lógica de edição do professor
    }

    private static void addCurso() {
        System.out.println("Adicionando um novo curso...");
        // Implementar criação e armazenamento do curso
    }

    private static void listaCurso() {
        System.out.println("Listando todos os cursos...");
        // Implementar listagem dos cursos
    }

    private static void addMateria() {
        System.out.println("Adicionando uma nova matéria...");
        // Implementar criação e armazenamento da matéria
    }

    private static void listaMateria(String codigoCurso) {
        System.out.println("Listando matérias do curso: " + codigoCurso);
        // Implementar listagem das matérias associadas ao curso
    }

    private static void addNota(String tipoAvaliacao, String codigoAluno, String codigoMateria, double nota) {
        System.out.printf("Adicionando nota %s de %s para aluno %s na matéria %s%n", nota, tipoAvaliacao, codigoAluno, codigoMateria);
        // Implementar armazenamento da nota
    }

    private static void fechaMedia(String codigoAluno) {
        System.out.println("Calculando média final do aluno de código: " + codigoAluno);
        // Implementar cálculo de média
    }
}