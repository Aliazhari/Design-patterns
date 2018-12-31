package Strategy.Strategy;

/**
 * @author Ali
 *
 */
public class OperationDivide implements Strategy {

	/* (non-Javadoc)
	 * @see Strategy.Strategy.Strategy#doOperation(int, int)
	 */
	public int doOperation(int num1, int num2) throws ArithmeticException {
		
		if (num2 == 0) throw new ArithmeticException("NO ZERO DENOMINATOR");
		
	return num1 / num2;
	}
}
