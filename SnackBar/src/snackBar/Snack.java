package snackBar;

public class Snack
{

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineID;

    public Snack (String name, double cost, int quantity, int vendingMachineID)
    {
        maxId++;
        this.id = maxId;

        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingMachineID = vendingMachineID;
    
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


    public double getCost()
    {
        return this.cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }


    public int addQuantity(int quantity)
    {
        return this.quantity += quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public int setQuantity(int quantity)
    {
        return this.quantity = quantity;
    }


    public int getVendingMachineID()
    {
        return vendingMachineID;
    }
    public int setVendingMachineID(int vendingMachineID)
    {
        return this.vendingMachineID = vendingMachineID;
    }


    public String buySnack(String snack)
    {
        return this.name = snack;
    }


    public double totalCost( int amountOfSnacks)
    {
        this.quantity -= amountOfSnacks;
        return this.cost *= amountOfSnacks;
    }

}