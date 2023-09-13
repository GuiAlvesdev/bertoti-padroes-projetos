import java.util.ArrayList;
import java.util.List;

public class Composite implements Componente {
    private List<Componente> componentes = new ArrayList<>();

    public void add(Componente component) {
        componentes.add(component);
    }

    public void remove(Componente component) {
        componentes.remove(component);
    }

    @Override
    public void desenhar() {
        System.out.println("Composição:");

        for (Componente component : componentes) {
            component.desenhar();
        }
    }

}
