package br.fsa.faculdade;

/**
 * A classe representa as notas do aluno em uma matéria (P1, P2 e nota de trabalho)
 */

public class Nota {
    protected double P1;
    protected double P2;
    protected double Trabalho;

    /**
     * Construtor padrão
     */

    public Nota(){
        this.P1 = 0.0;
        this.P2 = 0.0;
        this.Trabalho = 0.0;
    }

    /**
     * Construtor que inicializa os valores da classe Nota
     * @param P1
     * @param P2
     * @param Trabalho
     */

    public Nota(double P1, double P2, double Trabalho){
        this.P1 = P1;
        this.P2 = P2;
        this.Trabalho = Trabalho;
    }

    /**
     * Retorna a nota da primeira prova
     * @return
     */

    public double getP1(){
        return P1;
    }

    /**
     * Define a nota da primeira prova
     * @param P1
     */

    public void setP1(double P1){
        this.P1 = P1;
    }

    /**
     * Retorna a nota da segunda prova
     * @return
     */

    public double getP2(){
        return P2;
    }

    /**
     * Define a nota da segunda prova
     * @param P2
     */
    
    public void setP2(double P2){
        this.P2 = P2;
    }

    /**
     * Retorna a nota do trabalho (atividade)
     * @return
     */

    public double getTrabalho(){
        return Trabalho;
    }

    /**
     * Define a nota de trabaho (atividade)
     * @param Trabalho
     */

    public void setTrabalho(double Trabalho){
        this.Trabalho = Trabalho;
    }
}
