package com.listaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");
        lista.add("Quarto");

        System.out.println(lista.get(2));
    }
}
