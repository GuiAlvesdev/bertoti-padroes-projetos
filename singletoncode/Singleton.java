public class Singleton {

    private static Singleton instance;

    // Construtor privado para impedir a criação de instâncias fora da classe
    private Singleton() {

    }

    // Método público para obter a instância única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos de instância da classe
    public void facaalgo() {
        // Implementação
    }



}
