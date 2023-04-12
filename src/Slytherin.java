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

    public void studentsChoiceSlytherin(Slytherin[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите двух учеников для сравнения:");

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getName());
        }

        System.out.print("Введите номер первого ученика: ");
        int firstIndex = scanner.nextInt() - 1;
        System.out.print("Введите номер второго ученика: ");
        int secondIndex = scanner.nextInt() - 1;

        compareSlytherin(students, firstIndex, secondIndex);
    }

    public void compareSlytherin(Slytherin[] students, int firstIndex, int secondIndex){
        int firstTotal = students[firstIndex].getCunning() + students[firstIndex].getDetermination() + students[firstIndex].getAmbition() +
                students[firstIndex].getResourcefulness() + students[firstIndex].getDesireForPower();
        int secondTotal = students[secondIndex].getCunning() + students[secondIndex].getDetermination() + students[secondIndex].getAmbition() +
                students[secondIndex].getResourcefulness() + students[secondIndex].getDesireForPower();

        if (firstTotal > secondTotal) {
            System.out.println(students[firstIndex].getName() + " лучший ученик, чем " + students[secondIndex].getName());
        } else if (firstTotal < secondTotal) {
            System.out.println(students[secondIndex].getName() + " лучший ученик, чем " + students[firstIndex].getName());
        } else {
            System.out.println(students[firstIndex].getName() + " и " + students[secondIndex].getName() + " равны по качествам.");
        }
    }

}
