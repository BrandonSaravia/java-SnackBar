package snackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;


    public Customer (String name, double cashOnHand)
    {
        maxId++;
        this.id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId()
    {
        return id;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }


    public void buy(double snackCost)
    {
        this.cashOnHand -= snackCost;
    }


    public double getCashOnHand()
    {
        return this.cashOnHand;
    }
    public void addCash(double cashOnHand)
    {
        this.cashOnHand += cashOnHand;
    }
    

    @Override
    public String toString() 
    {
        String rtnStr = "id: " + id + "\n" +
                        "name: " + name + "\n" +
                        "cashOnHand: " + cashOnHand  + "\n";
        return rtnStr;
    }
}
