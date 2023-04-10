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
    public static void compareHufflepuff(Hufflepuff[] students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите двух учеников для сравнения:");

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].getName());
        }

        System.out.print("Введите номер первого ученика: ");
        int firstIndex = scanner.nextInt() - 1;
        System.out.print("Введите номер второго ученика: ");
        int secondIndex = scanner.nextInt() - 1;

        int firstTotal = students[firstIndex].getHardworking() + students[firstIndex].getLoyal() + students[firstIndex].getHonest();
        int secondTotal = students[secondIndex].getHardworking() + students[secondIndex].getLoyal() + students[secondIndex].getHonest();

        if (firstTotal > secondTotal) {
            System.out.println(students[firstIndex].getName() + " лучший ученик, чем " + students[secondIndex].getName());
        } else if (firstTotal < secondTotal) {
            System.out.println(students[secondIndex].getName() + " лучший ученик, чем " + students[firstIndex].getName());
        } else {
            System.out.println(students[firstIndex].getName() + " и " + students[secondIndex].getName() + " равны по качествам.");
        }
    }

}
