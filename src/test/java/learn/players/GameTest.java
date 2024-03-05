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

    @Test
    void scissorsShouldBeatPaper(){
        // arranging
        String result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.PAPER);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you WIN 😁🎉",PlayerHelper.PAPER, PlayerHelper.SCISSORS),result);
    }

    @Test
    void paperShouldBeatRock(){
        // arranging
        String result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.ROCK);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you WIN 😁🎉",PlayerHelper.ROCK, PlayerHelper.PAPER),result);
    }

    @Test
    void rockShouldBeatScissor(){
        // arranging
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.SCISSORS);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you WIN 😁🎉",PlayerHelper.SCISSORS, PlayerHelper.ROCK),result);
    }

    // unhappy path - lost  condition are working fine

    @Test
    void scissorShouldNotBeatRock(){
        // arranging
        String result = game.determineWinner(PlayerHelper.SCISSORS, PlayerHelper.ROCK);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you LOSE 😒",PlayerHelper.ROCK, PlayerHelper.SCISSORS),result);
    }

    @Test
    void rockShouldNotBeatPaper(){
        // arranging
        String result = game.determineWinner(PlayerHelper.ROCK, PlayerHelper.PAPER);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you LOSE 😒",PlayerHelper.PAPER, PlayerHelper.ROCK),result);
    }

    @Test
    void paperShouldNotBeatScissor(){
        // arranging
        String result = game.determineWinner(PlayerHelper.PAPER, PlayerHelper.SCISSORS);
        // assert
        assertNotNull(result);
        assertEquals(String.format("The computer picked %s and you picked %s, you LOSE 😒",PlayerHelper.SCISSORS, PlayerHelper.PAPER),result);
    }







}