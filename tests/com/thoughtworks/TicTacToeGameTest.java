package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TicTacToeGameTest {
    TicTacToeGame game;
    PrintStream printStream;

    @Before
    public void setUp() throws Exception {

        printStream = mock(PrintStream.class);
        game = new TicTacToeGame(printStream);
    }

    @Test
    public void testDrawBoard() throws Exception {
        game.drawBoard();
        verify(printStream,times(2)).println("  |  |\n--------");
        verify(printStream).println("  |  |");
    }
}