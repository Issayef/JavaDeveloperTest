package server;

/**
 * Created by Alexandr on 16.11.2016.
 */
public class Main {

    public static void main(String[] args) {

        Company firm = new Company("Test",15000);
        String s;
        s= firm.getInfo();
        System.out.println(s);
        firm.withdrawal(10000);
        s= firm.getInfo();
        System.out.println(s);
        Bulochka bul = new Bulochka("Bulka");
        System.out.println(bul.getPrice());
        Vatrushka vat = new Vatrushka("Bulka");
        System.out.println(vat.getPrice());
        Bread bread = new Bread("Bulka");
        System.out.println(bread.getPrice());

    }

}
