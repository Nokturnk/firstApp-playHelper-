package app;

import content.Games;
import logic.PrintMethods;

public class App {
    public static void main(String[] args) {
        PrintMethods print = new PrintMethods();

        Games[] nowPlayed = new Games[1000];
        Games[] finished = new Games[1000];
        Games[] planned = new Games[1000];
        Games[][] gamesTab = new Games[3][];
        gamesTab[0] = nowPlayed;
        gamesTab[1] = finished;
        gamesTab[2] = planned;

        Games game = new Games();

        print.addGame(game);
    }
}