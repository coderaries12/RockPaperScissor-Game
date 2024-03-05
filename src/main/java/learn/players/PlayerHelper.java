package learn.players;

import java.util.Scanner;

public class PlayerHelper {

    public static final String ROCK_ICON = "🪨";
    public static final String PAPER_ICON = "📄";
    public static final String SCISSOR_ICON = "✂️";

    // moves
    public static final String ROCK = "Rock: " + ROCK_ICON;
    public static final String PAPER= "Paper: " + PAPER_ICON;
    public static final String SCISSORS = "Scissor: " + SCISSOR_ICON;

    //method that gets the player move
    public static String getPlayerMove(int choice){
        String move = null;
        switch(choice){
            case 1:
                move = ROCK;
                break;
            case 2:
                move = PAPER;
                break;
            case 3:
                move = SCISSORS;
                break;
        }
        return move;
    }

}
