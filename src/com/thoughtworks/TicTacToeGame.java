package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.verify;

/**
 * Created by danielleerickson on 10/1/14.
 */
public class TicTacToeGame {

    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private String [] board;

    public TicTacToeGame(PrintStream printStream, BufferedReader bufferedReader) {

        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        board = new String[]{"","","","","","","","",""};
    }

    public void drawBoard() {

        int i=0;

        printStream.println(" "+board[i]+" | "+board[i+1]+" | "+board[i+2]+" ");

        i=3;
        while(i <9) {
            printStream.println("--------\n "+board[i]+" | "+board[i+1]+" | "+board[i+2]+" ");
            i+=3;

        }
    }

    public void movePlayer() throws IOException {
        printStream.println("Enter the number of the player you wish to move");
        int playerNumber = Integer.parseInt(bufferedReader.readLine());
        printStream.println("Enter the square number you would like to occupy");
        int squareNumber = Integer.parseInt(bufferedReader.readLine());
        String token="";
        if(playerNumber==1) {
            token = "X";
        }
        board[squareNumber-1]= token;
        drawBoard();

    }

}
