package Strategy.Strategy;

import java.util.Arrays;

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
	
	public static int fb(int n) {
		
		if ((n == 0) || (n == 1))
		    return n;
		return (fb(n - 1) + fb(n-2));
	}
    public static void main( String[] args ) throws Exception 
    {
    	 Context context = new Context(new OperationAdd());		
         System.out.println("20 + 3 = " + context.executeStrategy(20, 3));

         context = new Context(new OperationSubstract());		
         System.out.println("20 - 3 = " + context.executeStrategy(20, 3));

         context = new Context(new OperationMultiply());		
         System.out.println("20 * 3 = " + context.executeStrategy(20, 2));
         
         
         context = new Context(new OperationDivide());	
         try {
         System.out.println("20 / 2 = " + context.executeStrategy(20, 0));
         }
         catch (Exception ex) {
        	 System.out.println("20 / 0 = " + ex);
         }
         
  
       
    }
}
