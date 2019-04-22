package snackBar;

public class Main
{
    private static void workWithData()
    {

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 1.75, 36, 0);
        Snack chocolateBar = new Snack("Chocolate Bar", 1.00, 36, 0);
        Snack pretzel = new Snack("Pretzel", 2.00, 30, 0);

        Snack soda = new Snack("Soda", 2.50, 24, 1);
        Snack water = new Snack("Water", 2.75, 20, 1);


        jane.buy(soda.totalCost(3));
        System.out.println("Jane's current maoney: $" + jane.getCashOnHand());
        System.out.println("sodas left: " + soda.getQuantity());

        jane.buy(pretzel.totalCost(1));
        System.out.println("Jane's current maoney: $" + jane.getCashOnHand());
        System.out.println("pretzels left: " + pretzel.getQuantity());

        bob.buy(soda.totalCost(2));
        System.out.println("Bob's current maoney: $" + bob.getCashOnHand());
        System.out.println("sodas left: " + soda.getQuantity());

        jane.addCash(10);
        System.out.println("jane's current maoney: $" + jane.getCashOnHand());

        jane.buy(chocolateBar.totalCost(1));
        System.out.println("Jane's current maoney: $" + jane.getCashOnHand());
        System.out.println("chocolate Bars left: " + chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println("pretzels left: " + pretzel.getQuantity());

        bob.buy(pretzel.totalCost(3));
        System.out.println("Bob's current maoney: $" + bob.getCashOnHand());
        System.out.println("pretzels left: " + pretzel.getQuantity());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}