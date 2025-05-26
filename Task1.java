import java.util.*;
public class Task1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();
    int min = 1;
    int max = 100;
    int numberToGuess = random.nextInt(max - min + 1) + min;
    int attempts = 0;
    int userGuess = -1;
    
    System.out.println("Welcome to the Number Guessing Game!\n");
    System.out.println("To start the game type '1'");
    System.out.println("To end the game type '0'");
    int begin =scanner.nextInt();
    if(begin == 1)
    {
    System.out.println("Note: You can do maximum 10 attempts to guess\n");
    System.out.println("There is a number between "+min+" and "+max+".Try to guess it!");
    int repeat=-1;
    while(repeat!=0)
    {
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;
            if (userGuess < numberToGuess && attempts<=10) {
                System.out.println("Your guess was small try to guess bigger number than "+userGuess+"\n");
            } else if (userGuess > numberToGuess && attempts<=10) {
                System.out.println("Your guess was large try to guess smaller number than "+userGuess+"\n");
            } else if(userGuess == numberToGuess && attempts<=10){
                System.out.println("Congratulations! You've guessed the number correctly in " + attempts + " attempts.\n");
                System.out.println("Your score is "+(11-attempts)*10+"/100.");
                System.out.println("Do you want to continue the game type '1'");
                System.out.println("To end the game type '0'");
                repeat=scanner.nextInt();
                if(repeat==1)
                {
                    numberToGuess=random.nextInt(max - min + 1) + min;
                    userGuess=-1;
                    attempts=0;
                }
                else{
                    System.out.println("Code Ended!!");
                }
            }
            else{
                System.out.println("You Have completed maximum attempts.");
                System.out.println("Game Over");
                System.out.println("Do you want to continue the game type '1'");
                System.out.println("To end the game type '0'");
                repeat=scanner.nextInt();
                if(repeat==1)
                {
                    numberToGuess=random.nextInt(max - min + 1) + min;
                    userGuess=-1;
                    attempts=0;
                }
                else{
                    System.out.println("Code Ended!!");
                }
            } 
        }
    }
    }
    else if(begin==0){
        System.out.println("Game Ended.");
    }
    scanner.close();
}
}