package se.jonas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HockeyPlayers {

    public void run() {
        readPlayerFromFile();

        while (true) {
            System.out.println("1. Creaate player");
            System.out.println("2.  List players");
            System.out.println("3. Exit");

            System.out.println();

            int sel = Integer.parseInt(System.console().readLine());

            if (sel == 0)
                break;
            if (sel == 1) {
                createPlayer();
                savePlayerToFile();
            }
            if (sel == 2)
                listPlayers();
        }
    }

    private void readPlayerFromFile() {
    }

    private void listPlayers() {
    }

    private void savePlayerToFile() {
    }

    private void createPlayer() {
    }


}