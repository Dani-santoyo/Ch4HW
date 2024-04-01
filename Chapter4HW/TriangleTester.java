package Chapter4HW;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: 4/1, 2024
 * TriangleTester - main method that handles IllegalTriangleSidesException.
 */
public class TriangleTester {
    public static void main(String[] args){
        try{
            Triangle t1 = new Triangle(3,3,3);
            System.out.println("Triangle 1 has valid side lengths: " + t1.checkSides());

            //invalid side lengths - will print alert message created in IllegalTriangleSideException
            Triangle t2 = new Triangle(1,2,3);
            System.out.println("Triangle 2 has invalid side lengths: " + t2.checkSides());
        }catch(IllegalTriangleSideException e){
            System.out.println(e);
        }
    }
}
