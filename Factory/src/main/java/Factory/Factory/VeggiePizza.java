package Factory.Factory;

/**
 * @author Ali
 *
 */
public class VeggiePizza extends Pizza {

	@Override
	public void makePizza() {
		
		System.out.println("Making Veggie Pizza...");
		setName("Veggie Pizza");
		setPrice(9.00f);
		
		
	}

}
