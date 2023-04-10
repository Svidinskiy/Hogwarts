import java.util.Scanner;
public class Main {
    public static Gryffindor[] gryffindors = new Gryffindor[3];
    public static Slytherin[] slytherins = new Slytherin[3];
    public static Hufflepuff[] hufflepuffs= new Hufflepuff[3];
    public static Ravenclaw[] ravenclaws= new Ravenclaw[3];
    public static void main(String[] args) {
        gryffindors[0] = new Gryffindor("Гарри Поттер", 90, 90, 95 ,93 ,86);
        gryffindors[1] = new Gryffindor("Гермиона Грейнджер", 91, 87, 81, 82, 85);
        gryffindors[2] = new Gryffindor("Рон Уизли", 76, 75, 71, 79, 70);

        slytherins[0] = new Slytherin("Драко Малфой", 70, 90, 80, 60, 75, 92, 80);
        slytherins[1] = new Slytherin("Грэхэм Монтегю", 60, 85, 75, 65, 70, 85, 74);
        slytherins[2] = new Slytherin("Грегори Гойл", 55, 80, 70, 55, 65, 60, 74);

        hufflepuffs[0] = new Hufflepuff("Захария Смит", 75, 90, 80, 85, 62);
        hufflepuffs[1] = new Hufflepuff("Седрик Диггори", 85, 95, 90, 82, 68);
        hufflepuffs[2] = new Hufflepuff("Джастин Финч-Флетчли", 80, 90, 75, 87, 90);

        ravenclaws[0] = new Ravenclaw("Чжоу Чанг", 90, 95, 90, 85, 76, 87);
        ravenclaws[1] = new Ravenclaw("Падма Патил", 85, 90, 85, 90,79, 76);
        ravenclaws[2] = new Ravenclaw("Маркус Белби", 80, 85, 80, 75,96, 69);

        printAllStudents();
        compareStudents();
        compareMagicAndTransgressionDistance();

    }
    public static void printAllStudents() {
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println(gryffindor.toString());
        }
        System.out.println("\n");

        for (Slytherin slytherin : slytherins) {
            System.out.println(slytherin.toString());
        }
        System.out.println("\n");

        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println(hufflepuff.toString());
        }
        System.out.println("\n");

        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println(ravenclaw.toString());
        }
        System.out.println("\n");
    }

    public static void compareStudents() {
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        while (flag < 1 || flag > 4) {
            System.out.println("Выберите факультет, студентов которого хотите сравнить:");
            System.out.println("1. Гриффиндор");
            System.out.println("2. Слизерин");
            System.out.println("3. Пуффендуй");
            System.out.println("4. Когтевран");
            System.out.print("Введите номер факультета:");
            flag = scanner.nextInt();
            System.out.println("\n");
            switch (flag) {
                case 1:
                    Gryffindor.compareGryffindor(gryffindors);
                    break;
                case 2:
                    Slytherin.compareSlytherin(slytherins);
                    break;
                case 3:
                    Hufflepuff.compareHufflepuff(hufflepuffs);
                    break;
                case 4:
                    Ravenclaw.compareRavenclaw(ravenclaws);
                    break;
                default:
                    System.out.println("Некорректный выбор");
            }
        }
    }

    public static void compareMagicAndTransgressionDistance() {
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