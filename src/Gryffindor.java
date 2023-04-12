import java.util.Scanner;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String name, int nobility, int honor, int bravery, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }



    @Override
    public String toString() {
        return "Гриффиндор: " +
                "Студент-" + getName() +
                ", благородство-" + nobility +
                ", честь-" + honor +
                ", храбрость-" + bravery +
                ", сила магии-" + getMagicPower() +
                ", расстояние трансгрессии-" + getTransgressionDistance();
    }



    public void compareGriffindor(Gryffindor student) {
        int firstTotal = this.getNobility() + this.getBravery() + this.getHonor();
        int secondTotal = student.getNobility() + student.getBravery() + student.getHonor();

        if (firstTotal > secondTotal) {
            System.out.println(this.getName() + " лучший ученик, чем " + student.getName());
        } else if (firstTotal < secondTotal) {
            System.out.println(student.getName() + " лучший ученик, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " равны по качествам.");
        }
    }

}
