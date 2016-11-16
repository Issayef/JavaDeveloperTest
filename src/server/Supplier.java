package server;

/**
 * Created by Alexandr on 16.11.2016.
 */
import java.util.ArrayList;


public class Supplier {

}
class Supply {

    private ArrayList<Material> supply = new ArrayList<Material>();

    public void MakeSupply() {
        Flour muka = new Flour();
        muka.Quantity = 20;
        Yeast yeast = new Yeast();
        yeast.Quantity = 5;
        Milk milk = new Milk();
        milk.Quantity = 0;
        Sugar sugar = new Sugar();
        sugar.Quantity = 25;
        Salt salt = new Salt();
        salt.Quantity = 10;
        Vanilla vanilla = new Vanilla();
        vanilla.Quantity = 3;
        VegetableOil vegetableOil = new VegetableOil();
        vegetableOil.Quantity = 10;
        Egg egg = new Egg();
        egg.Quantity = 10;
        Margarine margarine = new Margarine();
        margarine.Quantity = 0;
        Jam jam = new Jam();
        jam.Quantity = 0;

        supply.add(muka);
        supply.add(yeast);
        supply.add(milk);
        supply.add(sugar);
        supply.add(salt);
        supply.add(vanilla);
        supply.add(vegetableOil);
        supply.add(egg);
        supply.add(margarine);
        supply.add(jam);

    }

    double getTotalPrice() {
        double Total = 0;
        for (int i = 0; i < supply.size(); i++) {
            Total += supply[i].Price;
        }
        return Total;
    }

}
