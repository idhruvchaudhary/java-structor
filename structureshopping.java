import java.util.*;

class shop {

    Scanner sc = new Scanner(System.in);
    int price, qty, total;
    String cname, iname;
    int i;

    void cname() {

        System.out.println("enter coustomer name");
        cname = sc.next();

    }

    void read() {

        total = 0;
        for (i = 0; i < 2; i++) {

            System.out.println("enter  the item name");
            iname = sc.next();

            System.out.println("enter  the item price");
            price = sc.nextInt();

            System.out.println("enter  the item qty");
            qty = sc.nextInt();

            total = price * qty;
        }

    }

    void title() {

        System.out.println("\niname\t\t\tprice\t\t\tqty\t\t\ttotal");
    }

    void show() {

        System.out.println("\n" + iname + "\t\t\t" + price + "\t\t\t" + qty + "\t\t\t" + total);
    }

    void cshow() {
        System.out.println("\n\ncoustomer name =" + cname);
    }

    void line() {
        System.out.print("\n___________________________________________________");
    }

    void star() {
        System.out.println("****************** bill ********************");
    }

}

public class structureshopping {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, n;

        System.out.println("enter the coustomer number ");
        n = sc.nextInt();

        shop sd[] = new shop[n];

        for (i = 0; i < n; i++) {
            sd[i] = new shop();
            sd[i].cname();
            sd[i].read();

        }

        for (i = 0; i < n; i++) {
            sd[0].star();
            sd[i].cshow();
            sd[0].title();
            sd[0].line();
            sd[i].show();
        }

    }
}
