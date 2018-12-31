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
        	 System.out.println(ex);
         }
         
         int[] a = {1, 3, 2 };
         int[] b = {1, 2, 3 };
         System.out.println(Arrays.equals(a, b));
         
         for(int i = 0; i < 21; i++)
         System.out.println(i + " : " + fb(i));
         
       
    }
}
