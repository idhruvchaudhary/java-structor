import java.util.*;

class studentdata {

    Scanner sc = new Scanner(System.in);

    int roll;
    String name;

    void read() {

        System.out.println("enter the student roll  =");
        roll = sc.nextInt();

        System.out.println("enter the student name  =  ");
        name = sc.next();

    }

    void title() {

        System.out.print("\nroll.no\t\tname");
    }

    void show() {

        System.out.print("\n" + roll + "\t\t" + name);
    }

    void line() {
        System.out.print("\n_______________________");
    }

    void star() {
        System.out.println("*******student data************");
    }
}

public class structure {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int i, n;

        System.out.println("how many data you want to store");
        n = sc.nextInt();
        studentdata sd[] = new studentdata[n];

        for (i = 0; i < n; i++) {
            sd[i] = new studentdata();
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
