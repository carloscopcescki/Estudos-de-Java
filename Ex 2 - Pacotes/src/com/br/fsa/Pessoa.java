package com.br.fsa;

public class Pessoa extends Animal {
    public static int abaixo = 18;
    public static int acima = 30;

    public Pessoa(int peso, int altura) {
        super(peso, altura);
    }

    @Override
    public String dizONome() {
        return "Pessoa";
    }

    public String dizONome(String x) {
        return x + "Pessoa";
    }

    public float calculaImc() {
        float alturaMetro = this.altura / 100.f;
        return this.peso / (alturaMetro * alturaMetro);
    }

    public static void ehIMCOk(Pessoa pessoa) {
        float resultado = pessoa.calculaImc();
        if (resultado <= abaixo) {
            System.out.println("Abaixo do mínimo");
        } else if (resultado >= acima) {
            System.out.println("Acima do recomendado");
        } else {
            System.out.println("IMC Ok!");
        }
    }
}