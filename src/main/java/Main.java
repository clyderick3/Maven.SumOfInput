import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int userInput = 0; //number user submits. Maximum value.
        int sum = 0;
        Scanner requestNumber = new Scanner(System.in);
        System.out.println("Input your number.");
        userInput = requestNumber.nextInt();

        for (int i = 0; i <= userInput ; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of this input number is " + sum + ".");
            }
}
