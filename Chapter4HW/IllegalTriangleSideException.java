package Chapter4HW;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: 4/1, 2024
 * IllegalTriangleSideException - Exception class
 */
public class IllegalTriangleSideException extends Exception{
    public IllegalTriangleSideException(String alert){
        super(alert);
    }
}
