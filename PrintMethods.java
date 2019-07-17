package logic;

import content.Games;

import java.util.Scanner;

public class PrintMethods {
    Scanner input = new Scanner(System.in);

    final int list1 = 1;
    final int list2 = 2;
    final int list3 = 3;

    public void chooseGamesList(Games game) { // metoda wybierająca liste gier
        System.out.println("Wybierz listę gier, którą chcesz wyświetlić:\n" +
                " 1 - Gry w które grasz\n 2 - Ukończone gry\n 3 - Gry w planach");
        int list = input.nextInt();

        switch (list) {
            case list1:
                System.out.println("Lista gier, w które grasz:\n");
                break;
            case list2:
                System.out.println("Lista ukończonych gier:\n");
                break;
            case list3:
                System.out.println("Gry, które masz w planach:\n");
                break;
            default:
        }
    }

    public void isGameMain(Games game) {
        if (game.getMainSpin() == 1) {
            System.out.print("Main series");
        } else if (game.getMainSpin() == 2) {
            System.out.print("Spin-off");
        } else {
            System.out.print("There where just two options lol");
        }
    }

    public void addGame(Games game) {
        System.out.println("What is your game title?");
        game.setTitle(input.nextLine());
        System.out.println("From what series " + game.getTitle()+" is?");
        game.setSeries(input.nextLine());
        System.out.println("On which platform do you play "+game.getTitle()+"?");
        game.setPlatform(input.nextLine());
        System.out.println("From what year is " + game.getTitle()+"?");
        game.setPublishingDate(input.nextInt());
        System.out.println("Press \"1\" if " + game.getTitle() +
                " is main series.\nPress \"2\" if its Spin-off.");
        game.setMainSpin(input.nextInt());
        System.out.println("Which part of a "+game.getSeries()+" series "
                +game.getTitle()+" is? (Only numbers allowed)");
        game.setPartInSeries(input.nextInt());
        input.nextLine();
        System.out.println("Who created "+game.getTitle()+"?");
        game.setDeveloper(input.nextLine());
        System.out.println("Who published "+game.getTitle()+"?");
        game.setPublisher(input.nextLine());
        System.out.println("\n");
        System.out.println("Dodana przez ciebie gra to:\n");
        System.out.print(game.getTitle() + "; " + game.getSeries()
                + "; " + game.getPlatform() + "; "
                + game.getPublishingDate() + "; ");
        isGameMain(game);
        System.out.println("; "+game.getPartInSeries()+"; "+game.getDeveloper()+"; "
        +game.getPublisher()+"; ");
    }
}




