// Chapter 3 in class Pizza Exercise

// import statement for the scanner class
import java.util.Scanner;

public class PizzaShop
{
	public static void main(String[] args) 
	{
		//Variables and constants (all internal data that the code will use)
		String customer;
		int toppings;
		Scanner input = new Scanner(System.in);
		Pizza pizza1 = new Pizza();

		// input phase
		Pizza.intro();
		System.out.print("Please provide a name for the order>> ");
		customer = input.nextLine();
		System.out.print("Please enter the number of toppings>> ");
		toppings = input.nextInt();

		//Processing phase
		pizza1.enterName(customer);
		pizza1.addToppings(toppings);
		pizza1.calcPrice();

		//Output Phase
		pizza1.summary();
		System.out.println("Thank for your order!");
	}// end of main()
}// End of class PizzaShop