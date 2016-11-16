package server;

/**
 * Created by Alexandr on 16.11.2016.
 */
public class Company {

    private String CompanyName;
    private double Capital;

    public Company(){
        CompanyName="";
        Capital=0;
    }
    public Company(String name,double capital){
        CompanyName=name;
        Capital= capital;
    }
    public String getName(){
        return CompanyName;
    }
    public double getCash(){
        return Capital;
    }
    public String getInfo(){
        return String.format("CompanyName: "+CompanyName+"; Capital left: "+Capital);
    }
    void deposit(double money){
        if (money<0)
            System.out.println("Разрешена только положительная сумма");
        else
            Capital+=money;
    }
    //списание денег фирмы
    void withdrawal(double money){
        if (money<0)
            System.out.println("Разрешена только положительная сумма");
        if (Capital>money)
            Capital-=money;
        else
            System.out.println("У фирмы не достаточно денег для проведения операции");
    }
	/*void skladEmpty(){
		Flour.Quantity=0;
		Yeast.Quantity=0;
		Milk.Quantity=0;
		Sugar.Quantity=0;
		Salt.Quantity=0;
		Vanilla.Quantity=0;
		VegetableOil.Quantity=0;
		Egg.Quantity=0;
		Margarine.Quantity=0;
		Jam.Quantity=0;
	}*/
}