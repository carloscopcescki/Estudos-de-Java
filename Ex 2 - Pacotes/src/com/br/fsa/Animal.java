package com.br.fsa;

public class Animal {
    public int peso;
    public int altura;

    public Animal(int peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public String dizONome() {
        return "Animal Genérico";
    }

    public static String ehAnimal(Animal animal){
        return animal.dizONome();
    }
}