package com.br.fsa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(80, 175);
        p1.altura = 180;
        System.out.println(p1.calculaImc());
        System.out.println(p1.dizONome());
        p1.ehIMCOk(p1);

        Pessoa p2 = new Pessoa(80, 150);
        p2.altura = 150;
        p2.peso = 160;
        System.out.println(p2.calculaImc());
        p2.ehIMCOk(p2);
    }
}