/* Chapter 3 Extra project
	Starting pizza price is $12.99
	Toppings cost .50 cents each*/

	public class Pizza 
	{
		// instance variables for the Pizza class
		private String custName;
		private double price;
		private int numToppings;

		// new constructor method for the Pizza class
		public Pizza()
		{
			custName = "Customer";
			price = 12.99;
			numToppings = 0;
		} // End of constructor method Pizza()

		// basic static method for this class

		public static void intro()
		{
			System.out.println("**********************************");
			System.out.println("Welcome to the Digital Pizza Shop!");
			System.out.println("**********************************");
		} // end of intro() method

		// mutator(setter) methods for the pizza class
		public void enterName(String name)
		{
			custName = name;
		} //End of enterName() method

		public void addToppings(int num)
		{
			numToppings = num;
		} //End of addToppings() method

		public void calcPrice()
		{
			price = price +(numToppings * .5);
		} //end of calcPrice() method

		// Accessor (getter) methods for the Pizza Class
		public void summary()
		{
			System.out.println();
			System.out.println("Thank you, "+custName);
			System.out.println("A pizza with "+numToppings+" topping(s) will cost: $"+price);
		} // end of summary() method

 	} // end of class