public class Main
{

    public static void main(String[] args)
    {
	int price = 25;
    double total = 0;
    double salesTax = 0.05;

    salesTax = salesTax * price;
    total = salesTax + price;

    System.out.println("The total tax is " + salesTax + " and the total price with tax is " + total);
    }
}
