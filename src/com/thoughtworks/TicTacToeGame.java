package com.thoughtworks;

import java.io.PrintStream;

import static org.mockito.Mockito.verify;

/**
 * Created by danielleerickson on 10/1/14.
 */
public class TicTacToeGame {

    private PrintStream printStream;

    public TicTacToeGame(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void drawBoard() {
        printStream.println("  |  |\n--------");
        printStream.println("  |  |\n--------");
        printStream.println("  |  |");
    }
}
