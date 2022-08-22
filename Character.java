public class Character {
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name);
    }

    public void sayMyStrength() {
        System.out.println("Watchout! my strength is " + strength);
    }
    
    public void sayMyAgility() {
        System.out.println("Prepare! my agility is " + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("Get Ready! my intelligence is " + intelligence);
    }
} 