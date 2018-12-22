package Strategy.Strategy;

/**
 * @author Ali Azhari
 *
 */
/**
 * @author Ali
 *
 */
public class Context {

	private Strategy strategy;

	   /**
	 * @param strategy
	 */
	public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   /**
	 * @param num1
	 * @param num2
	 * @return
	 * @throws Exception
	 */
	public int executeStrategy(int num1, int num2) throws Exception {
	      return strategy.doOperation(num1, num2);
	   }
}

