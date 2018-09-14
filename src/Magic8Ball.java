import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {
        //Code goes here\\
        Scanner keyboard = new Scanner(System.in);
        int testing;
        String question;

        //Initialization phase\\
        System.out.println("What is your question?");
        question = keyboard.nextLine();
        System.out.println("Now pick a number 1-100");
        testing = keyboard.nextInt();
        if (testing<10) {
            System.out.println("Not very good");

        }

        if (testing>10) if (testing<21){
            System.out.println("That's pretty good");
        }
        if (testing>20) if (testing<31){
            System.out.println("Not too likely");
        }


    }

}
