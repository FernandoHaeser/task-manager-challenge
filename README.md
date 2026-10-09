# Desafio Java: Gerenciador de Tarefas 📅

**Objetivo:** criar um programa que permita cadastrar tarefas com prazos e consultar quais estão atrasadas.

## 🎯 Conceitos praticados

- Programação Orientada a Objetos (POO)
- Classes, objetos e encapsulamento
- `ArrayList<Tarefa>`
- `LocalDate` e comparação de datas
- Laços `for` e condicionais
- Métodos e valores de retorno

**Tempo estimado:** 20–30 minutos  
**Nível:** iniciante

---

## 1. Classe `Tarefa`

Crie uma classe chamada `Tarefa` com os seguintes atributos:

- `String titulo`
- `LocalDate dataEntrega`
- `boolean concluida`

Implemente:

- Um construtor para inicializar os atributos.
- Getters para acessar os dados.
- Um método `concluir()` que marca a tarefa como concluída.
- Um método `estaAtrasada()` que retorna `true` se a tarefa não estiver concluída e sua data de entrega for anterior à data atual.

**Dica:** utilize `LocalDate.now()` e `isBefore()`.

---

## 2. Classe `GerenciadorTarefas`

Crie uma classe chamada `GerenciadorTarefas` que armazene as tarefas em uma lista:

```java
private ArrayList<Tarefa> tarefas = new ArrayList<>();
```

Implemente os métodos:

| Método | Comportamento |
| --- | --- |
| `adicionarTarefa(Tarefa tarefa)` | Adiciona uma tarefa à lista. |
| `listarTarefas()` | Exibe todas as tarefas. |
| `listarAtrasadas()` | Exibe somente as tarefas atrasadas. |
| `concluirTarefa(String titulo)` | Marca uma tarefa pelo título como concluída. |

**Regra:** depois de concluída, uma tarefa não deve mais aparecer na listagem de tarefas atrasadas.

---

## 3. Testes no `main`

Cadastre três tarefas com prazos relativos à data atual:

- **Estudar Java:** entrega daqui a 2 dias.
- **Fazer trabalho:** entrega ontem.
- **Revisar POO:** entrega há 3 dias.

Para criar as datas, utilize:

```java
LocalDate.now().plusDays(2);
LocalDate.now().minusDays(1);
LocalDate.now().minusDays(3);
```

Depois, execute os seguintes passos:

1. Liste todas as tarefas.
2. Liste apenas as tarefas atrasadas.
3. Conclua a tarefa `"Fazer trabalho"`.
4. Liste novamente as tarefas atrasadas e confirme que `"Fazer trabalho"` não aparece mais.

---

## ✅ Checklist de conclusão

- [ ] Criei as classes `Tarefa` e `GerenciadorTarefas`.
- [ ] Usei encapsulamento e construtor.
- [ ] Armazenei objetos em um `ArrayList`.
- [ ] Implementei a comparação de datas.
- [ ] Consegui concluir uma tarefa pelo título.
- [ ] Testei os casos de atraso e conclusão.

---

## 📌 Regras do desafio

- Não use Streams, lambdas ou bibliotecas externas.
- Utilize apenas recursos básicos do Java.
- Não coloque toda a lógica no `main`: distribua as responsabilidades entre as classes.
- Se travar, implemente primeiro a classe `Tarefa` e depois avance para o gerenciador.

## 🧠 Pós-desafio

Quando terminar, revise o código considerando:

- A responsabilidade de cada classe.
- O tratamento de títulos que não existem.
- O comportamento quando não há tarefas atrasadas.
- A legibilidade e a organização dos métodos.

