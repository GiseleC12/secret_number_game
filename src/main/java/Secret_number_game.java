import java.util.Scanner;

public class Secret_number_game {
    public static void main(String[] args){
        //Prompt a user input for a secret number
        System.out.println("What is a secret number?");

        //Collect user input
        Scanner reader = new Scanner(System.in);
        String secretNumber = reader.nextLine();

        //if number is ten, print "You won! Well done!"
        // otherwise print "You lost! Sorry!"
        if (secretNumber.equals("ten")){
            System.out.println("You won! Well done!");
        } else {
            System.out.println("You lost! Sorry!");
        }reader.close();
    }
}
