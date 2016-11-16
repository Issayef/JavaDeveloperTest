package server;

public  class Material {
    public String Name;
    public double Price;
}
class Flour extends Material{
    String Name="Мука";
    int  Quantity;
    final static double Price=46.5;
    public double getPrice(){
        return Price;
    }
}
class Yeast extends Material{
    String Name="Дрожжи";
    int  Quantity;
    final static double Price=1600;
    public double getPrice(){
        return Price;
    }
}
class Milk extends Material{
    String Name="Молоко";
    int  Quantity;
    final static double Price=52;
    public double getPrice(){
        return Price;
    }
}
class Sugar extends Material{
    String Name="Сахар";
    int  Quantity;
    final static double Price=54;
    public double getPrice(){
        return Price;
    }
}
class Salt extends Material{
    String Name="Соль";
    int  Quantity;
    final static double Price=15;
    public double getPrice(){
        return Price;
    }
}
class Vanilla extends Material{
    String Name="Ванилин";
    int  Quantity;
    final static double Price=380;
    public double getPrice(){
        return Price;
    }
}
class VegetableOil extends Material{
    String Name="Растительное масло";
    int  Quantity;
    final static double Price=87;
    public double getPrice(){
        return Price;
    }
}
class Egg extends Material{
    String Name="Яйцо";
    int  Quantity;
    final static double Price=145;
    public double getPrice(){
        return Price;
    }
}
class Margarine extends Material{
    String Name="Маргарин";
    int  Quantity;
    final static double Price=145;
    public double getPrice(){
        return Price;
    }
}
class Jam extends Material{
    String Name="Повидло";
    int  Quantity;
    final static double Price=50;
    public double getPrice(){
        return Price;
    }
}
