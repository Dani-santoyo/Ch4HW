package Chapter4HW;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: 4/1, 2024
 * Triangle - contains 3 double variables as well as checkSides() to check
 * if triangle object will have valid side lengths.
 */

public class Triangle {
    private double l1, l2, l3;

    public Triangle(double l1, double l2, double l3){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    //If any two sides are less than the 3rd side, IllegalTriangleSideException is created
    public boolean checkSides() throws IllegalTriangleSideException{
        if(this.l1 + this.l2 > this.l3 && this.l2 + this.l3 > this.l1 &&
           this.l3 + this.l1 > this.l2){
            return true;
        }else {
            throw new IllegalTriangleSideException("Error: side lengths do not creat a valid triangle");
        }
    }
}
