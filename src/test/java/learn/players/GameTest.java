package learn.players;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// 3 A's of Testing
// Arrange -set up our test enviroment
// Act - this is where we invoke our methods, run our code
// Assert - check the output we get is what we rae expecting
class GameTest {
    Game game = new Game();
    // Ties are working
    @Test
    void twoOfTheSameInputShouldTie(){
        // arranging
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.ROCK);
        // assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- its a tie!",PlayerHelper.ROCK),result);

        // arranging
        result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.PAPER);
        // assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- its a tie!",PlayerHelper.PAPER),result);

        // arranging
        result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.SCISSORS);
        // assert
        assertNotNull(result);
        assertEquals(String.format("You both picked %s -- its a tie!",PlayerHelper.SCISSORS),result);

    }




}