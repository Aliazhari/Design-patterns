package Factory.Factory;

/**
 * @author Ali
 *
 */
public class PepperoniPizza extends Pizza {

	@Override
	public void makePizza() {
		
		System.out.println("Making Pepperoni Pizza...");
		setName("Pepperoni Pizza");
		setPrice(10.00f);
		
	}

}
