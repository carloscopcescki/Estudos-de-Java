package com.br.fsa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(80, 175);
        p1.altura = 180;
        System.out.println(p1.calculaImc());
        System.out.println(p1.dizONome());
    }
}