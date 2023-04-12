import java.util.Scanner;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;


    public Hufflepuff(String name, int hardworking, int loyal, int honest, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

    }


    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }


    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }


    public String toString() {
        return "Пуффендуй: " +
                "студент-" + getName() +
                ", трудолюбие-" + hardworking +
                ", верность-" + loyal +
                ", честность-" + honest +
                ", сила магии-" + getMagicPower() +
                ", расстояние трансгрессии-" + getTransgressionDistance();
    }

    public void compareHufflepuff(Hufflepuff student){
        int firstTotal = this.getHardworking() + this.getLoyal() + this.getHonest();
        int secondTotal = student.getHardworking() + student.getLoyal() + student.getHonest();

        if (firstTotal > secondTotal) {
            System.out.println(this.getName() + " лучший ученик, чем " + student.getName());
        } else if (firstTotal < secondTotal) {
            System.out.println(student.getName() + " лучший ученик, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по качествам.");
        }
    }

}
