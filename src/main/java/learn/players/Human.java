package learn.players;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Human implements Player {

    @Override
    public String generateMove() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please select the Move: ");
        System.out.printf("1. %s%n",PlayerHelper.ROCK);
        System.out.printf("2. %s%n", PlayerHelper.PAPER);
        System.out.printf("3. %s%n", PlayerHelper.SCISSORS);

        int choice = 0;
        while(choice < 1 || choice > 3){
            System.out.println(("Make your move[1-3]"));
            choice = Integer.parseInt(console.nextLine());
            if(choice < 0 || choice > 3){
                System.out.println("ERROR: That's not a valid move - please try again");
            }
        }
        return PlayerHelper.getPlayerMove(choice);


    }
}
