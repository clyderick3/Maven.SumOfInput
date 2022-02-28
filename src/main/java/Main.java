import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
//int n = 100;
int x = 0;
int sum = 0;
Scanner requestNumber = new Scanner(System.in);
System.out.println("Input your number.");
x = requestNumber.nextInt();

for (int i = 0; i<=x; i++) {
    sum = sum + i;
}

System.out.println("The sum of this input number is " + sum + ".");
    }
}
