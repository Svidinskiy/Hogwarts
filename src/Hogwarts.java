import java.util.Scanner;

public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void compareMagicAndTransgressionDistance(Hogwarts student2){
        if (this.getMagicPower() > student2.getMagicPower()) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (this.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println("Мощность магии у " + this.getName() + " и " + student2.getName() + " одинакова");
        }

        if (this.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(this.getName() + " обладает большим расстоянием трансгрессии, чем " + student2.getName());
        } else if (this.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student2.getName() + " обладает большим расстоянием трансгрессии, чем " + this.getName());
        } else {
            System.out.println("Расстояние трансгрессии у " + this.getName() + " и " + student2.getName() + " одинаково");
        }
    }

}
