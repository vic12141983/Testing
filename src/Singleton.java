/**
 * Provided Victor Herrera
 * Design Patter Singleton
 * Designed to ge a single instance
 * This pattern involves a single class which is responsible to create
 * an object while making sure that only single object gets created
 */
public class Singleton {
    /**
     * Private constructor
     **/
    private Singleton() {
    }

    /**
     * Creating an instance of the class
     **/
    public static final Singleton singleInstance = new Singleton();

    /**
     * Global access point of the instance
     **/
    public static Singleton getInstance() {
        return singleInstance;
    }
    /**
     * Method provided by Victor Herrera
     * Will be used to intance to print string values to screen.
     * @return input
     * Returns input passed to parameter
     * **/
    public String printMessage(String input) {
        System.out.println(input);
        return input;
    }

}
