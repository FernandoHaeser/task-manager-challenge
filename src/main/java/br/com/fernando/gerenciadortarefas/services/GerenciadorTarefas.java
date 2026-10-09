package main.java.br.com.fernando.gerenciadortarefas.services;

import java.util.ArrayList;

import main.java.br.com.fernando.gerenciadortarefas.models.Tarefa;

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
