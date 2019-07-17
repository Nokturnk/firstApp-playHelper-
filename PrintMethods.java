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
        public void addGame (Games game) {
            System.out.println("Podaj tytuł gry:");
            game.setTitle(input.nextLine());
            System.out.println("Podaj serię do której należy "+game.getTitle());
            game.setSeries(input.nextLine());
            System.out.println("Na jakiej platformie grasz?");
            game.setPlatform(input.nextLine());
            System.out.println("W którym roku była premiera"+game.getTitle());
            game.setPublishingDate(input.nextInt());
            System.out.print(game.getTitle() + "; "  + "; " + game.getPlatform()
                    + "; " + game.getPublishingDate() + "; ");
            if (game.isMainSpinoff() == true) {
                System.out.print("Główna seria");
            } else {
                System.out.print("Spin-Off");
            }
            System.out.print("; " + game.getPartInSeries() + "; " + game.getDeveloper() + "; "
                    + game.getPublisher());

        }
    }




