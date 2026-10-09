package main.java.br.com.fernando.gerenciadortarefas.models;

import java.time.LocalDate;

public class Tarefa {

    private String titulo;
    private LocalDate dataEntrega;
    private boolean concluida;

    public Tarefa(String titulo, LocalDate dataEntrega, boolean concluida) {
        this.titulo = titulo;
        this.dataEntrega = dataEntrega;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        concluida = true;
    }

    public boolean estaAtrasada() {
        if (!concluida && dataEntrega.isBefore(LocalDate.now()))
            return true;
        else
            return false;
    }
}
