public class App {
    public static void main(String[] args) {
        
        Character knight = new Character(strength: 10, agility: 5, intelligence: 0, name:"Chen");

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();
        knight.sayMyName();


        Character mage = new Character(strength: 0, agility: 5, intelligence: 10, name:"Akasha");

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();
        mage.sayMyName();


        Character thief = new Character(strength: 5, agility: 10, intelligence: 0, name:"Gondar");

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();
        thief.sayMyName();

        Character archer = new Character(strength: 5, agility: 5, intelligence: 5, name:"Jasmine");

        archer.strength = 5;
        archer.agility = 5;
        archer.intelligence = 5;
        archer.name = "Jasmine";
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();
        archer.sayMyName();
        
    }
}