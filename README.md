Vou te passar um desafio de uns 20–30 minutos, envolvendo POO, LocalDate, ArrayList e lógica. Sem exagerar na complexidade: o foco é praticar a sintaxe escrevendo código de verdade.

Desafio Java: Gerenciador de tarefas 📅

Stock Bureau - OXFORD Carnet SIGNATURE A5 couverture rigide brochure 160 pages quadrillées 5x5. Coloris aléatoires



Add to Favorites



Objetivo: criar um programa que permita cadastrar tarefas com prazos e consultar quais estão atrasadas.



Você vai praticar:



Classes, objetos e encapsulamento

ArrayList<Tarefa>

LocalDate e comparação de datas

Laços for e condicionais

Métodos que retornam valores

1. Crie a classe Tarefa

Cada tarefa deve ter:



String titulo

LocalDate dataEntrega

boolean concluida



Implemente:



Um construtor para inicializar os atributos.

Getters para acessar os dados.

Um método concluir() que marca a tarefa como concluída.

Um método estaAtrasada() que retorna true se a tarefa não estiver concluída e a data de entrega for anterior à data atual.



Dica: pesquise ou relembre os métodos LocalDate.now() e isBefore().

2. Crie a classe GerenciadorTarefas

Ela deve possuir:



Java

private ArrayList<Tarefa> tarefas = new ArrayList<>();

Implemente os seguintes métodos:

Método

Comportamento

adicionarTarefa(Tarefa tarefa)

Adiciona uma tarefa à lista

listarTarefas()

Exibe todas as tarefas

listarAtrasadas()

Exibe somente as tarefas atrasadas

concluirTarefa(String titulo)

Marca uma tarefa pelo título como concluída

Atenção: ao concluir uma tarefa, ela não deve mais aparecer na listagem de atrasadas.

3. Teste no main

Cadastre três tarefas com prazos relativos à data atual:



"Estudar Java" — entrega daqui a 2 dias.

"Fazer trabalho" — entrega ontem.

"Revisar POO" — entrega há 3 dias.



Depois:



Liste todas as tarefas.

Liste apenas as atrasadas.

Conclua "Fazer trabalho".

Liste novamente as atrasadas.



Para criar as datas, você pode usar:



Java

LocalDate.now().plusDays(2);
LocalDate.now().minusDays(1);
LocalDate.now().minusDays(3);

4. Critérios para considerar concluído

Checklist de progresso



0/6



Criei as classes Tarefa e GerenciadorTarefas



Usei encapsulamento e construtor



Armazenei objetos em um ArrayList



Implementei a comparação de datas



Consegui concluir uma tarefa pelo título



Testei os casos de atraso e conclusão

Regras do desafio

Não use streams, lambdas ou bibliotecas externas.

Tente resolver usando apenas o Java básico.

Não coloque toda a lógica dentro do main: distribua as responsabilidades entre as classes.

Se travar, tente resolver primeiro a classe Tarefa e depois avance para o gerenciador.



Quando terminar, me envie seu código. Vou revisar como se fosse um code review: sintaxe, POO, lógica, uso de datas e possíveis melhorias — sem reescrever tudo por você.
