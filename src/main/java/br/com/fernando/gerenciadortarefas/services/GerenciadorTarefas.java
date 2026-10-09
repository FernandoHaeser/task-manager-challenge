package main.java.br.com.fernando.gerenciadortarefas.services;

import java.util.ArrayList;

import main.java.br.com.fernando.gerenciadortarefas.models.Tarefa;

/*
Crie uma classe chamada GerenciadorTarefas que armazene as tarefas em uma lista:

private ArrayList<Tarefa> tarefas = new ArrayList<>();

Implemente os métodos:

Método	Comportamento
adicionarTarefa(Tarefa tarefa)	Adiciona uma tarefa à lista.
listarTarefas()	Exibe todas as tarefas.
listarAtrasadas()	Exibe somente as tarefas atrasadas.
concluirTarefa(String titulo)	Marca uma tarefa pelo título como concluída.
Regra: depois de concluída, uma tarefa não deve mais aparecer na listagem de tarefas atrasadas. */

public class GerenciadorTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void listarTarefas() {
        System.out.println("\n=== TAREFAS ===");
        for (Tarefa tarefa : tarefas) {
            System.out.println("\nTitulo: " + tarefa.getTitulo());
            System.out.println("Data de Entrega: " + tarefa.getDataEntrega());
        }
    }

    public void listarAtrasadas() {
        System.out.println("\n=== TAREFAS ATRASADAS ===");
        for (Tarefa tarefa : tarefas) {
            if (tarefa.estaAtrasada()) {
                System.out.println("\nTitulo: " + tarefa.getTitulo());
                System.out.println("Data de Entrega: " + tarefa.getDataEntrega());
            }
        }
    }

    public void concluirTarefa(String titulo) {
        String tituloForCompare = titulo.trim().toLowerCase();
        for (Tarefa tarefa : tarefas) {
            String tituloCompare = tarefa.getTitulo().trim().toLowerCase();
            if (tituloCompare.equalsIgnoreCase(tituloForCompare)) {
                tarefa.concluir();
            }
        }
    }
}
