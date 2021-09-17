import java.util.Scanner;
enum Planets {
    MARS("Mars", "6,44*10^23", 2, 6780),
    JUPITER("Jupiter", "1,9*10^27", 16, 142600),
    SATURN("Saturn", "5,68*10^26", 30, 120660);
    private String name;

    public String getName() {
        return name;
    }

    private String mass;

    public String getMass() {
        return mass;
    }

    private int sputnik;

    public int getSputnik() {
        return sputnik;
    }

    private long diameter;

    public long getDiameter() {
        return diameter;
    }
    Planets(String n, String m, int s, long d) {
        name = n;
        mass = m;
        sputnik = s;
        diameter = d;
    }
}
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1, чтобы вывести информацию о планете Марс.");
        System.out.println("Введите 2, чтобы вывести информацию о планете Юпитер.");
        System.out.println("Введите 3, чтобы вывести информацию о планете Сатурн.");
        int a = scan.nextInt();
        Planets pl;
        switch (a) {
            case 1:
                pl = Planets.MARS;
                break;
            case 2:
                pl = Planets.JUPITER;
                break;
            case 3:
                pl = Planets.SATURN;
                break;
            default:
                pl = null;
                break;
        }
        if(pl == null)
            System.out.println("Такой планеты нет.");
        else {
            System.out.println("Имя планеты: " + pl.getName());
            System.out.println("Масса: " + pl.getMass());
            System.out.println("Количество спутников: " + pl.getSputnik());
            System.out.println("Диаметр: " + pl.getDiameter());
        }
    }
}
