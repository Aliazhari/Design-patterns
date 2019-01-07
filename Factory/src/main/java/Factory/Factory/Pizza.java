package Factory.Factory;

/**
 * @author Ali
 *
 */
public abstract class Pizza {
	private float price;
	private String name;
	
	public abstract void makePizza();
	
	
	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String ServePizza() {
		return name;
	}
	public float receipt() {
		return price;
	}

}
