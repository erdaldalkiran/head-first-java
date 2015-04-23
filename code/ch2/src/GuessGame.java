import java.util.Arrays;

/**
 * Created by ed on 4/23/15.
 */
public class GuessGame {
    private Player[] players = { new Player(),new Player(),new Player()};

    public void startGame(){
        int numberIGuessed = (int) (Math.random() * 10);

        System.out.println("The number I guess: " + numberIGuessed);

        while (true){
            int[] guessedNumbers = new int[3];
            for(int i= 0; i < players.length; i++){
                players[i].guess();
                guessedNumbers[i] = players[i].getNumber();
            }

            if(Arrays.asList(guessedNumbers).contains(numberIGuessed)){

                System.out.println("We have a winner!");

                if(guessedNumbers[0] == numberIGuessed){
                    System.out.println("First player guess the number!");
                }

                if(guessedNumbers[1]  == numberIGuessed){
                    System.out.println("Second player guess the number!");
                }


                if(guessedNumbers[2]  == numberIGuessed){
                    System.out.println("Third player guess the number!");
                }

                break;
            }
            else{
                System.out.println("No one has guessed the correct number!");
                System.out.println("They are gonna try again!");
            }
        }
    }
}
