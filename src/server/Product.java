package server;

/**
 * Created by Alexandr on 16.11.2016.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Product {
    public String Name;
    public double Price;
    public Product(String name){
        Name=name;
    }
}
class Bulochka extends Product{
    Bulochka(String name){
        super(name);
    }
    double Price=0.07*Flour.Price+0.002*Yeast.Price+0.025*Milk.Price+0.01*Sugar.Price+0.001*Salt.Price+
            0.0002*Vanilla.Price+0.0028*VegetableOil.Price+0.0042*Egg.Price+5;
    public double getPrice(){
        return new BigDecimal(Price).setScale(2, RoundingMode.UP).doubleValue();
    }
}
class Vatrushka extends Product{
    Vatrushka(String name){
        super(name);
    }
    double Price=0.0125*Flour.Price+0.0009*Yeast.Price+0.003*Milk.Price+0.0012*Sugar.Price+0.002*Salt.Price+
            0.00125*Egg.Price+0.0056*Margarine.Price+0.01*Jam.Price+5;
    public double getPrice(){
        return new BigDecimal(Price).setScale(2, RoundingMode.UP).doubleValue();
    }
}
class Bread extends Product{
    Bread(String name){
        super(name);
    }
    double Price=0.3*Flour.Price+0.1*Milk.Price+0.001*Sugar.Price+0.005*Salt.Price+
            0.068*VegetableOil.Price+5;
    public double getPrice(){
        return new BigDecimal(Price).setScale(2, RoundingMode.UP).doubleValue();
    }
}

