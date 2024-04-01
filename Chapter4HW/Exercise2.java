package Chapter4HW;
import java.util.Random;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double[] arr = createRandomArray(50);
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do{
            try{
                System.out.println("Enter an integer between 0-49");
                int index = input.nextInt();
                System.out.println("The double at index " + index +
                        " is " + arr[index]);
                flag = false;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Please enter an integer between 0-49");
                input.nextLine();
            }catch(InputMismatchException e){
                System.out.println("Please enter an integer");
                input.nextLine();
            }
        }while(flag);
    }

    public static double[] createRandomArray(int size) {
        Random random = new Random();
        double[] arr = new double[size];
        for(int i = 0; i < size; i++){
            arr[i] = random.nextDouble();
        }
        return arr;
    }
}
