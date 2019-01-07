package Factory.Factory;

/**
 * @author Ali
 *
 */
public class PizzaFactory {
	
	public Pizza makePizza(String typeOfPizza) {
		
		Pizza pizza = null;
		
		if (typeOfPizza.equalsIgnoreCase("C"))  
			pizza = new CheesePizza();
		else
			if (typeOfPizza.equalsIgnoreCase("P"))  
				pizza = new PepperoniPizza();
			else
				if (typeOfPizza.equalsIgnoreCase("V"))  
					pizza = new VeggiePizza();
		
		if (pizza != null)
			pizza.makePizza();
		return pizza;	
		
			
	}

}
