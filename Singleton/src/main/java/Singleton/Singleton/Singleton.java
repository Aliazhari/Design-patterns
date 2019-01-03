package Singleton.Singleton;

/**
 * @author Ali
 *
 */
public class Singleton {

	private static Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) 
			uniqueInstance = new Singleton();
		
		return uniqueInstance;
	}

	// other methods here . . .

	public String getDescription() {
		return "Using statical initialization for Singleton!";
	}

}