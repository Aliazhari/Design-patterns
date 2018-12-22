package Strategy.Strategy;

/**
 * @author Ali Azhari
 *
 */
public class OperationMultiply implements Strategy {

	/* (non-Javadoc)
	 * @see Strategy.Strategy.Strategy#doOperation(int, int)
	 */
	public int doOperation(int num1, int num2) {
		
		return num1 * num2;
	}

}
