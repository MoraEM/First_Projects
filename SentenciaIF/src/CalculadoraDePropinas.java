import java.util.Scanner;

public class CalculadoraDePropinas {
    public static void main(String[] args) {
        //amount*Percentage/100 that comes from 100%-------------ignore

        Scanner input = new Scanner(System.in);

        System.out.println("Tips Calculator");

        System.out.println("What is the amount to pay?");
        double amount = input.nextDouble();

        System.out.println("What is the tip percentage?");
        int percent = input.nextInt();

        double totalTips = (amount*percent)/100;

        if (percent < 10){
            System.out.println("The atention/product was bad");

        } else if(percent > 10 && percent < 20) {
            System.out.println("Thanks for the tips!");

        }else if (percent > 20 && percent <= 100){
            System.out.println("OMG! Thank you so much, im so happy!! ❤");

        }else{
            System.out.println("Error!!");
        }
        System.out.println("Amount of tips for the employee: "+totalTips );
    }
}
