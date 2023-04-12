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
        Hogwarts.studentsChoiceMagicAndTransgressionDistance(gryffindors, slytherins, hufflepuffs, ravenclaws);

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
                    gryffindors[0].studentsChoiceGryffindor(gryffindors);
                    break;
                case 2:
                    slytherins[0].studentsChoiceSlytherin(slytherins);
                    break;
                case 3:
                    hufflepuffs[0].studentsChoiceHufflepuff(hufflepuffs);
                    break;
                case 4:
                    ravenclaws[0].studentsChoiceRavenclaw(ravenclaws);
                    break;
                default:
                    System.out.println("Некорректный выбор");
            }
        }
    }


}