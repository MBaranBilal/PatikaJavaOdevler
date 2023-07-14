public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge > 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            System.out.println("Bloklama şansı 0-100 aralığında olmalı.");
            this.dodge = 0;
        }

    }

    public int hit(Fighter foe) {
        System.out.println(this.name + "==>" + foe.name + " sporcusuna " + this.damage + " hasar vurdu.");

        if (isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı !");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean isDodge() {
        double randNumber = Math.random() * 100;
        return randNumber <= this.dodge;
    }
}
