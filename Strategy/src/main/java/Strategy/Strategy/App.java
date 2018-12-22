package Strategy.Strategy;

/**
 * @author Ali Azhari
 * 
 * Strategy Design Pattern Demo
 *
 */
public class App 
{
    /**
     * @param args
     * @throws Exception
     */
    public static void main( String[] args ) throws Exception 
    {
    	 Context context = new Context(new OperationAdd());		
         System.out.println("20 + 3 = " + context.executeStrategy(20, 3));

         context = new Context(new OperationSubstract());		
         System.out.println("20 - 3 = " + context.executeStrategy(20, 3));

         context = new Context(new OperationMultiply());		
         System.out.println("20 * 3 = " + context.executeStrategy(20, 3));
         
         
         context = new Context(new OperationDivide());	
         try {
         System.out.println("20 / 2 = " + context.executeStrategy(20, 2));
         }
         catch (Exception ex) {
        	 System.out.println(ex);
         }
    }
}
