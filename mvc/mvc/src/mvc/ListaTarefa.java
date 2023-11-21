package mvc;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	
	private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return new ArrayList<>(tarefas);
    }
    
    

}
