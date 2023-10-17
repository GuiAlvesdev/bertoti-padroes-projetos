public class Pokemon {
    private String name;
    private AttackStrategy attackStrategy;


    public Pokemon(String name) {
        this.name = name;
    }


    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        System.out.println(name + " is attacking:");
        attackStrategy.attack();
    }

}
