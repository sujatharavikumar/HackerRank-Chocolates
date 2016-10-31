package Ravikumar.Sujatha.Chocolates;

/**
 * Created by sujatharavikumar on 10/27/16.
 */
public class Chocolates {

    static void calculate(int[] arr) {
        int numberOfChocolates = 0;
        for (int value: arr){
            if (value == 1)
                numberOfChocolates = 1;
            else {
                numberOfChocolates = (int) Math.pow(Math.ceil((double)value/2.0),2);
            }
            System.out.println(numberOfChocolates);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 8};
        calculate(arr);

    }
}
