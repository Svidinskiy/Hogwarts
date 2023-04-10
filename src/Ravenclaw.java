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
    public static void compareRavenclaw(Ravenclaw[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите двух учеников для сравнения:");

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getName());
        }

        System.out.print("Введите номер первого ученика: ");
        int firstIndex = scanner.nextInt() - 1;
        System.out.print("Введите номер второго ученика: ");
        int secondIndex = scanner.nextInt() - 1;

        int firstTotal = students[firstIndex].getIntelligence() + students[firstIndex].getWisdom() + students[firstIndex].getCreativity() + students[firstIndex].getWit();
        int secondTotal = students[secondIndex].getIntelligence() + students[secondIndex].getWisdom() + students[secondIndex].getCreativity() + students[secondIndex].getWit();

        if (firstTotal > secondTotal) {
            System.out.println(students[firstIndex].getName() + " лучший ученик, чем " + students[secondIndex].getName());
        } else if (firstTotal < secondTotal) {
            System.out.println(students[secondIndex].getName() + " лучший ученик, чем " + students[firstIndex].getName());
        } else {
            System.out.println(students[firstIndex].getName() + " и " + students[secondIndex].getName() + " равны по качествам.");
        }
    }
}
