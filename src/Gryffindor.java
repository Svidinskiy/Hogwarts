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

    public void studentsChoiceGryffindor(Gryffindor[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите двух учеников для сравнения:");

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getName());
        }

        System.out.print("Введите номер первого ученика: ");
        int firstIndex = scanner.nextInt() - 1;
        System.out.print("Введите номер второго ученика: ");
        int secondIndex = scanner.nextInt() - 1;

        compareGriffindor(students, firstIndex, secondIndex);
    }

    public void compareGriffindor(Gryffindor[] students, int firstIndex, int secondIndex){
        int firstTotal = students[firstIndex].getNobility() + students[firstIndex].getBravery() + students[firstIndex].getHonor();
        int secondTotal = students[secondIndex].getNobility() + students[secondIndex].getBravery() + students[secondIndex].getHonor();

        if (firstTotal > secondTotal) {
            System.out.println(students[firstIndex].getName() + " лучший ученик, чем " + students[secondIndex].getName());
        } else if (firstTotal < secondTotal) {
            System.out.println(students[secondIndex].getName() + " лучший ученик, чем " + students[firstIndex].getName());
        } else {
            System.out.println(students[firstIndex].getName() + " и " + students[secondIndex].getName() + " равны по качествам.");
        }
    }

}
