/**
 * Classe principal para gerenciar a faculdade via prompt
 */

package br.fsa;

import br.fsa.faculdade.Nota;
import org.apache.commons.cli.*;

import br.fsa.faculdade.Curso;
import br.fsa.faculdade.Materia;
import br.fsa.pessoas.Aluno;
import br.fsa.pessoas.Professor;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class GerenciaFaculdade {

    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Materia> materias = new ArrayList<>();
    private static List<Nota> notas = new ArrayList<>();

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
        
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();
    
        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataNascStr = scanner.nextLine();
        Date dataNasc = null;

        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataNasc = simpleDateFormat.parse(dataNascStr);
        } catch (Exception e) {
            System.out.println("Data inválida, usando a data atual.");
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
    
        Aluno aluno = new Aluno(nome, dataNasc, cep, rua, numero, cidade, estado, telefone, genero, rg, cpf, curso);
    
        System.out.println("Aluno adicionado com sucesso!");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Código Único: " + aluno.getCodUnico());
    }

    private static void listaAluno() {
        if(alunos.isEmpty()){
            System.out.println("Não há alunos!");
        }else{
            System.out.println("Lista de alunos: ");
            for(Aluno aluno : alunos){
                System.out.println("Código: " + aluno.getCodUnico());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("----------------------------------------");
            }
        }
    }

    private static void editaAluno(String codigoAluno) {
        Aluno aluno = null;
        for (Aluno a : alunos) {
            if (a.getCodUnico().equals(codigoAluno)) {
                aluno = a;
                break;
            }
        }

        if(aluno == null){
            System.err.println("Código não encontrado: " + codigoAluno);
            return;
        }
        System.out.println("Editando aluno: " + aluno.getNome());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um novo nome: ");
        String novoNome = scanner.nextLine();
        if(!novoNome.isEmpty()){
            aluno.setNome(novoNome);
        }

        System.out.println("Insira o novo curso: ");
        String novoCurso = scanner.nextLine();
        if(!novoNome.isEmpty()){
            aluno.setCurso(novoCurso);
        }

        System.out.println("Dados atualizados:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
    }

    private static void addProfessor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados do novo professor:");

        System.out.print("Nome do professor: ");
        String nome = scanner.nextLine();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        String dataNascStr = scanner.nextLine();
        Date dataNasc = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataNasc = simpleDateFormat.parse(dataNascStr);
        } catch (Exception e) {
            System.out.println("Data inválida, usando a data atual.");
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

        System.out.println("Informe as matérias que o professor leciona:");
        String materiasInput = scanner.nextLine();
        List<String> listaMaterias = new ArrayList<>();
        if (!materiasInput.isEmpty()) {
            for (String materia : materiasInput.split(",")) {
                listaMaterias.add(materia.trim());
            }
        }

        System.out.print("Informe o código único do professor: ");
        String codUnico = scanner.nextLine();

        Professor professor = new Professor(nome, dataNasc, cep, rua, numero, cidade, estado, telefone, genero, rg, cpf, listaMaterias, codUnico);

        professores.add(professor);

        System.out.println("Professor adicionado com sucesso!");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Código Único: " + professor.getCodUnico());
        System.out.println("Matérias: " + String.join(", ", professor.getListaMaterias()));
    }

    private static void listaProfessor() {
        if(professores.isEmpty()){
            System.out.println("Não há professores!");
        }else{
            System.out.println("Lista de professores: ");
            for(Professor professor : professores){
                System.out.println("Código: " + professor.getCodUnico());
                System.out.println("Nome: " + professor.getNome());
                System.out.println("Matéria: " + String.join(", ", professor.getListaMaterias()));
                System.out.println("----------------------------------------");
            }
        }
    }

    private static void editaProfessor(String codigoProfessor) {
        Professor professor = null;
        for(Professor p : professores){
            if(p.getCodUnico().equals(codigoProfessor)){
                professor = p;
                break;
            }
        }

        if (professor == null){
            System.err.println("Código não encontrado: " + codigoProfessor);
            return;
        }

        System.out.println("Editando professor: " + professor.getNome());
        System.out.println("Nome: " + professor.getNome());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um novo nome: ");
        String novoNomeProfessor = scanner.nextLine();
        if(!novoNomeProfessor.isEmpty()){
            professor.setNome(novoNomeProfessor);
        }

        System.out.println("Dados atualizados:");
        System.out.println("Nome: " + professor.getNome());
    }

    private static void addCurso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o código do curso: ");
        String codigoCurso = scanner.nextLine();

        Curso novoCurso = new Curso(cursos, codigoCurso);
        cursos.add(novoCurso);
        System.out.println("Curso com código " + codigoCurso + " adicionado com sucesso!");
    }

    private static void listaCurso() {
        if(cursos.isEmpty()){
            System.out.println("Nenhum curso foi cadastrado!");
            return;
        }

        System.out.println("Lista de cursos: ");
        for(Curso curso : cursos){
            System.out.println("Código: " + curso.getCodigo());
            if(curso.getListaMaterias().isEmpty()){
                System.out.println("Nenhuma matéria foi cadastrada!");
            }else{
                System.out.println("Matérias: ");
                for(Materia materia : curso.getListaMaterias()){
                    System.out.println("Código da Matéria: " + materia.getCodigo() + ", Curso: " + materia.getCurso());
                }
            }
        }
    }

    private static void addMateria() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do curso associado à matéria: ");
        String curso = scanner.nextLine();

        System.out.print("Informe o código da matéria: ");
        String codigoUnico = scanner.nextLine();

        Materia novaMateria = new Materia(curso, codigoUnico, notas);
        materias.add(novaMateria);

        System.out.println("Matéria cadastrada! Curso: " + curso + ", Código: " + codigoUnico);
    }

    private static void listaMateria(String codigoCurso) {
        Curso cursoCadastrado = null;
        for(Curso curso : cursos){
            if(curso.getCodigo().equals(codigoCurso)){
                cursoCadastrado = curso;
                break;
            }
        }

        if(cursoCadastrado == null){
            System.out.println("Curso com código " + codigoCurso + "não cadastrado!");
            return;
        }

        System.out.println("Matérias do Curso " + codigoCurso + ":");
        List<Materia> materias = cursoCadastrado.getListaMaterias();
        if (materias.isEmpty()) {
            System.out.println("Nenhuma matéria cadastrada para este curso.");
        } else {
            for (Materia materia : materias) {
                System.out.println("Código da Matéria: " + materia.getCodigo() + ", Curso: " + materia.getCurso());
            }
        }
    }

    public static void addNota(Materia materia, String tipoAvaliacao, double nota) {
        Nota notaCadastrada = materia.getListaNota().stream().findFirst().orElse(new Nota());

        switch (tipoAvaliacao) {
            case "P1":
                notaCadastrada.setP1(nota);
                System.out.println("Nota " + nota + " adicionada para P1");
                break;
            case "P2":
                notaCadastrada.setP2(nota);
                System.out.println("Nota " + nota + " adicionada para P2");
                break;
            case "Trabalho":
                notaCadastrada.setTrabalho(nota);
                System.out.println("Nota " + nota + " adicionada para Trabalho");
                break;
            default:
                System.out.println("Tipo de avaliação inválido");
                return;
        }

        if (materia.getListaNota().isEmpty()) {
            materia.getListaNota().add(notaCadastrada);
        }
    }

    public static void fechaMedia(Aluno aluno, List<Materia> listaMaterias) {
        double p1, p2, trabalho, media;
        String status;

        System.out.println("Matérias e Médias do Aluno: " + aluno.getCodUnico());

        for (Materia materia : listaMaterias) {
            if (materia.getCurso().equals(aluno.getCurso())) {
                for (Nota nota : materia.getListaNota()) {
                    p1 = nota.getP1();
                    p2 = nota.getP2();
                    trabalho = nota.getTrabalho();

                    media = (p1 + p2) * 0.8 + trabalho * 0.2;

                    if (media < 5.0) {
                        status = "Em Recuperação";
                    } else {
                        status = "APROVADO";
                    }

                    System.out.println("Matéria: " + materia.getCodigo() +
                            " | Média: " + media +
                            " | Status: " + status);
                }
            }
        }
    }
}
