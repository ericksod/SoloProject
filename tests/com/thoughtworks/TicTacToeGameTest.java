package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class TicTacToeGameTest {
    TicTacToeGame game;
    PrintStream printStream;
    BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {

        printStream = mock(PrintStream.class);
        game = new TicTacToeGame(printStream,bufferedReader);
        bufferedReader = mock(BufferedReader.class);
    }

    @Test
    public void shouldPrintBoard() throws Exception {
        game.drawBoard();
        verify(printStream).println("  |  |  ");
        verify(printStream,times(2)).println("--------\n  |  |  ");
    }

    @Test
    public void shouldPrintXinFirstSquareWhenUserMovesPlayerOneToSquareOne() throws IOException {


        when(bufferedReader.readLine()).thenReturn("1");
        when(bufferedReader.readLine()).thenReturn("1");

        game.movePlayer();

        verify(printStream).println(" X |  |  \n");
        verify(printStream,times(2)).println("--------\n  |  |  ");

    }
}