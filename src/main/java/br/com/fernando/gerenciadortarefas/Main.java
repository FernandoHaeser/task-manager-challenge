package main.java.br.com.fernando.gerenciadortarefas;

import java.time.LocalDate;

import main.java.br.com.fernando.gerenciadortarefas.models.Tarefa;
import main.java.br.com.fernando.gerenciadortarefas.services.GerenciadorTarefas;

public class Main {
	public static void main(String[] args) {

		Tarefa tarefa1 = new Tarefa("Estudar Java", LocalDate.now().plusDays(2), false);
		Tarefa tarefa2 = new Tarefa("Fazer trabalho", LocalDate.now().minusDays(1), false);
		Tarefa tarefa3 = new Tarefa("Revisar POO", LocalDate.now().minusDays(3), false);

		GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

		gerenciadorTarefas.adicionarTarefa(tarefa1);
		gerenciadorTarefas.adicionarTarefa(tarefa2);
		gerenciadorTarefas.adicionarTarefa(tarefa3);

		gerenciadorTarefas.listarTarefas();
		gerenciadorTarefas.listarAtrasadas();
		gerenciadorTarefas.concluirTarefa("Fazer Trabalho");
		gerenciadorTarefas.listarAtrasadas();
	}
}
