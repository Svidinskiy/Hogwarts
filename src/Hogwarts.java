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

    public static void studentsChoiceMagicAndTransgressionDistance(Gryffindor[] gryffindors, Slytherin[] slytherins,
                                                                   Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws) {
        System.out.println("\n");

        Hogwarts[] allStudents = new Hogwarts[gryffindors.length + slytherins.length + hufflepuffs.length + ravenclaws.length];
        System.arraycopy(gryffindors, 0, allStudents, 0, gryffindors.length);
        System.arraycopy(slytherins, 0, allStudents, gryffindors.length, slytherins.length);
        System.arraycopy(hufflepuffs, 0, allStudents, gryffindors.length + slytherins.length, hufflepuffs.length);
        System.arraycopy(ravenclaws, 0, allStudents, gryffindors.length + slytherins.length + hufflepuffs.length, ravenclaws.length);

        System.out.println("Выберите двух студентов для сравнения:");
        for (Hogwarts student : allStudents) {
            System.out.println(student.getName());
        }
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        Hogwarts student1 = null;
        Hogwarts student2 = null;
        while (student1 == null || student2 == null) {
            System.out.print("Первый студент: ");
            String student1Name = scanner.nextLine();
            System.out.print("Второй студент: ");
            String student2Name = scanner.nextLine();

            for (Hogwarts student : allStudents) {
                if (student.getName().equals(student1Name)) {
                    student1 = student;
                }
                if (student.getName().equals(student2Name)) {
                    student2 = student;
                }
            }
            if (student1 == null || student2 == null) {
                System.out.println("Некорректные имена студентов, попробуйте еще раз:");
            }
        }
        allStudents[0].compareMagicAndTransgressionDistance(student1, student2);

    }

    public void compareMagicAndTransgressionDistance(Hogwarts student1, Hogwarts student2){
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println("Мощность магии у " + student1.getName() + " и " + student2.getName() + " одинакова");
        }

        if (student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getName() + " обладает большим расстоянием трансгрессии, чем " + student2.getName());
        } else if (student1.getTransgressionDistance() < student2.getTransgressionDistance()) {
            System.out.println(student2.getName() + " обладает большим расстоянием трансгрессии, чем " + student1.getName());
        } else {
            System.out.println("Расстояние трансгрессии у " + student1.getName() + " и " + student2.getName() + " одинаково");
        }
    }
}
