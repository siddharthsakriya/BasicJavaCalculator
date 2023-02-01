package calc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice = 0;
        double getInput1;
        double getInput2;

        Scanner input = new Scanner(System.in);

        while(choice < 1 || choice > 4){
            System.out.println("Please pick a number 1-4, 1: Addition, 2: Subtraction, 3: Multiplication, 4: Division : ");
            choice = input.nextInt();
        }

        System.out.println("Choose first and second inputs: ");
        getInput1 = input.nextDouble();
        getInput2 = input.nextDouble();


        Operation calculate = new Operation();

        switch (choice){
            case 1:
                System.out.println(calculate.addition(getInput1, getInput2));
                break;
            case 2:
                System.out.println(calculate.subtraction(getInput1, getInput2));
                break;
            case 3:
                System.out.println(calculate.multiplication(getInput1, getInput2));
                break;
            case 4:
                System.out.println(calculate.division(getInput1,getInput2));

        }
    }
}