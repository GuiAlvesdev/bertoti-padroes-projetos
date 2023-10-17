import controller.TarefaController;

public class Main {
    public static void main(String[] args) {

        TarefaController controller = new TarefaController();

        controller.adicionarTarefa("levar filho na escola");
        controller.adicionarTarefa("ir ao mercado");
        controller.adicionarTarefa("Estudar API");

        controller.atualizarView();
    }
}