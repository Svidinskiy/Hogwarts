import java.util.Scanner;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;


    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int desireForPower,
                     int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }


    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setDesireForPower(int desireForPower) {
        this.desireForPower = desireForPower;
    }


    @Override
    public String toString() {
        return "Слизерин: " +
                "студент-" + getName() +
                ", хитрость-" + cunning +
                ", решительность-" + determination +
                ", амбициозность-" + ambition +
                ", находчивость-" + resourcefulness +
                ", жажда власти-" + desireForPower +
                ", сила магии-" + getMagicPower() +
                ", расстояние трансгрессии-" + getTransgressionDistance();
    }



    public void compareSlytherin(Slytherin student){
        int firstTotal = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getDesireForPower();
        int secondTotal = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getDesireForPower();

        if (firstTotal > secondTotal) {
            System.out.println(this.getName() + " лучший ученик, чем " + student.getName());
        } else if (firstTotal < secondTotal) {
            System.out.println(student.getName() + " лучший ученик, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по качествам.");
        }
    }

}
