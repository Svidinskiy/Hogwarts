import java.util.Scanner;

public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int intelligence, int wisdom, int wit, int creativity, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;

    }


    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }
    public int getWit(){
        return wit;
    }
    public int getCreativity() {
        return creativity;
    }


    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String toString() {
        return "Когтевран: " +
                "студент-" + getName() +
                ", ум-" + intelligence +
                ", мудрость-" + wisdom +
                ", остроумие-" + wit +
                ", творчество-" + creativity +
                ", сила магии-" + getMagicPower() +
                ", расстояние трансгрессии-" + getTransgressionDistance();
    }


    public void compareRavenclaw(Ravenclaw student){
        int firstTotal = this.getIntelligence() + this.getWisdom() + this.getCreativity() + this.getWit();
        int secondTotal = student.getIntelligence() + student.getWisdom() + student.getCreativity() + student.getWit();

        if (firstTotal > secondTotal) {
            System.out.println(this.getName() + " лучший ученик, чем " + student.getName());
        } else if (firstTotal < secondTotal) {
            System.out.println(student.getName() + " лучший ученик, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по качествам.");
        }
    }
}
