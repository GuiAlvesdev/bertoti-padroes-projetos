import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Criando formas simples
        Componente circulo =  new Circulo();
        Componente retangulo = new Retangulo();

        // Criando uma composição e adicionando formas simples
        Composite composite = new Composite();
        composite.add(circulo);
        composite.add(retangulo);

        // Criando outra composição e adicionando a composição anterior
        Composite anotherComposite = new Composite();
        anotherComposite.add(composite);

        // Desenhando todas as formas
        circulo.desenhar();
        System.out.println("---");
        Retangulo.desenhar();
        System.out.println("---");
        composite.desenhar();
        System.out.println("---");
        anotherComposite.desenhar();
    }
}
