import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args) {
        //Code goes here\\
        Scanner keyboard = new Scanner(System.in);
        int testing;
        String question;

        //Initialization phase\\
        System.out.println("Hello! I am the all knowing Italian Meatball!");
        System.out.println("Ask me any yes or not question.");
        question = keyboard.nextLine();
        System.out.println("Now pick a number 1-100");
        testing = keyboard.nextInt();

        if (testing<10) {
            System.out.println("Not very likely");
        }
        else if (testing>=10 && testing<20){
            System.out.println("That's classified");
        }
        else if (testing>=20 && testing<30){
            System.out.println("I don't know! Do I look like a Wizard?");
        }
        else if (testing>=30 && testing<40){
            System.out.println("Probably not");
        }
        else if (testing>=40 && testing<50){
            System.out.println("Never ever gonna happen");
        }
        else if (testing>=50 && testing<60){
            System.out.println("Looks pretty likely to my eyes");
        }
        else if (testing>=60 && testing<70){
            System.out.println("Very likely");
        }
        else if (testing>=70 && testing<80){
            System.out.println("All roads point to YES");
        }
        else if (testing>=80 && testing<90){
            System.out.println("Yeah, I mean probably at the least");
        }
        else if (testing>=90 && testing<100){
            System.out.println("Yes. Simple as that.");
        }


    }

}
