package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TicTacToeGame game = new TicTacToeGame(System.out, bufferedReader, );
        game.drawBoard();
        game.movePlayer();
    }
}
