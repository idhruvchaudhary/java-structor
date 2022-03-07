import java.util.*;

class emp {

    Scanner sc = new Scanner(System.in);

    int sal;
    double hra, da, ntsal;
    String name;

    void read() {

        System.out.println("enter the name");
        name = sc.next();

        System.out.println("enter the salary");
        sal = sc.nextInt();

        hra = sal * 0.12;
        da = sal * 0.05;
        ntsal = sal + hra + da;

    }

    void line() {
        System.out.print("\n___________________________________________________");
    }

    void star() {
        System.out.println("******************employee data********************");
    }

    void show() {
        System.out.println("\n" + name + "\t\t" + sal + "\t\t" + hra + "\t\t" + da + "\t\t" + ntsal);
    }

    void title() {
        System.out.println("\nname\t\tsal\t\thra\t\tda\t\tntsal");
    }

}

public class structureemployee {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, n;

        System.out.println("how many data you want to insert");
        n = sc.nextInt();

        emp sd[] = new emp[n];

        for (i = 0; i < n; i++) {
            sd[i] = new emp();
            sd[i].read();
        }

        sd[0].star();
        sd[0].title();
        sd[0].line();

        for (i = 0; i < n; i++) {
            sd[i].show();
        }
    }

}
