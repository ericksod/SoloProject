package com.thoughtworks;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        TicTacToeGame game = new TicTacToeGame(System.out);
        game.drawBoard();
    }
}
