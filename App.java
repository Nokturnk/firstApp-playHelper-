package content;

import logic.PrintMethods;

public class App {
    public static void main(String[] args) {
        Games[] nowPlayed = new Games[1000];
        Games[] finished = new Games[1000];
        Games[] planned = new Games[1000];
        Games[][] gamesTab = new Games[3][];
        gamesTab[0] = nowPlayed;
        gamesTab[1] = finished;
        gamesTab[2] = planned;

//        Games game1 = new Games("Super Smash Bros. Ultimate", "Super Smash Bros.",
//                "Nintendo Switch", 2018, true,
//                6, "Nintendo", "Nintendo");
//
        PrintMethods printMethods = new PrintMethods();
//
//        printMethods.chooseGamesList(game1);
        Games game = new Games();
        printMethods.addGame(game);
    }
}
