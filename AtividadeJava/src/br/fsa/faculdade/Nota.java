package br.fsa.faculdade;

public class Nota {
    protected double P1;
    protected double P2;
    protected double Trabalho;

    public Nota(){
        this.P1 = 0.0;
        this.P2 = 0.0;
        this.Trabalho = 0.0;
    }

    public Nota(double P1, double P2, double Trabalho){
        this.P1 = P1;
        this.P2 = P2;
        this.Trabalho = Trabalho;
    }

    public double getP1(){
        return P1;
    }

    public void setP1(double P1){
        this.P1 = P1;
    }

    public double getP2(){
        return P2;
    }
    
    public void setP2(double P2){
        this.P2 = P2;
    }

    public double getTrabalho(){
        return Trabalho;
    }

    public void setTrabalho(double Trabalho){
        this.Trabalho = Trabalho;
    }
}
