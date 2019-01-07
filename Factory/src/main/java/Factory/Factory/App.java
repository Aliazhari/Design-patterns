package Factory.Factory;

import java.util.Scanner;


/**
 * @author Ali
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	PizzaFactory pizzaFactory = new PizzaFactory();
    	Pizza pizza = null;
    	
    	@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
    	System.out.println("Order your favorite Pizza");
    	System.out.println("\tC: Cheese Piiza");
    	System.out.println("\tP: Pepperoni Piiza");
    	System.out.println("\tV: Veggie Piiza");
    	System.out.print("\t> ");
    	if (userInput.hasNextLine()) {
    		String typeOfPizza = userInput.nextLine();
    		pizza = pizzaFactory.makePizza(typeOfPizza);
    		if (pizza == null) 
    			System.out.println("Your pizza type is not available");
    		else
    			System.out.println( pizza.ServePizza()  + ", and the price is: " + pizza.receipt());
    	}
    	
    
   
    }
}
