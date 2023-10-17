package controller;

import model.Tarefa;
import view.TarefaView;

import java.util.ArrayList;
import java.util.List;

public class TarefaController {
    private List<Tarefa> listaTarefas;
    private TarefaView tarefaView;

    public TarefaController() {
        listaTarefas = new ArrayList<>();
        tarefaView = new TarefaView();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        listaTarefas.add(tarefa);
    }

    public void atualizarView() {
        for (Tarefa tarefa : listaTarefas) {
            tarefaView.mostrarTarefa(tarefa.getDescricao());
        }
    }
}
