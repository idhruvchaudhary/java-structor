import java.util.*;

class cricketdata {

    Scanner sc = new Scanner(System.in);

    int age;
    String name, country, type;

    void read() {
        System.out.println("enter the name of cricketer");
        name = sc.next();

        System.out.println("enter the cricketer age");
        age = sc.nextInt();

        System.out.println("enter the type of cricketr");
        type = sc.next();

        System.out.println("enter the country of cricketer");
        country = sc.next();

    }

    void title() {

        System.out.print("\nname\t\tage\t\ttype\t\tcountry");

    }

    void show() {
        System.out.print("\n" + name + "\t\t" + age + "\t\t" + type + "\t\t" + country);
    }

    void line() {
        System.out.print("\n______________________________________");
    }

    void star() {
        System.out.println("******************student data********************");
    }

}

public class structurecricket {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, n;

        System.out.println("how many data you want to insert ");
        n = sc.nextInt();

        cricketdata sd[] = new cricketdata[n];

        for (i = 0; i < n; i++) {
            sd[i] = new cricketdata();
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
