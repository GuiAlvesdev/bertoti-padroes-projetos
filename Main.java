public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu");
        Pokemon charmander = new Pokemon("Charmander");

        pikachu.setAttackStrategy(new ThunderboltAttack());
        charmander.setAttackStrategy(new FireAttack());

        pikachu.performAttack();
        charmander.performAttack();
    }
}
