package Factory.Factory;

/**
 * @author Ali
 *
 */
public class CheesePizza extends Pizza {

	@Override
	public void makePizza() {
		
		System.out.println("Making Cheese Pizza...");
		setName("Cheeze Pizza");
		setPrice(8.00f);
	}

}
