package Singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Singleton instance1 = Singleton.getInstance();
    	Singleton instance2 = Singleton.getInstance();
        System.out.println( instance1 == instance2 ); // rhis should print true
    }
}
