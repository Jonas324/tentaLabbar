package se.jonas;

import java.util.ArrayList;

public class Scrabble {

    ArrayList<String> scrabbleList = new ArrayList<>();
    int scrabblePoints = 0;

    public void run() {

        while (true) {
            System.out.println("1. Write a word");
            System.out.println("X. Exit");
            String word = System.console().readLine();

            if(word.equals("1")){
                inputWord();
                calculateScrabblePoints();
                System.out.println(scrabbleList);
                System.out.println(scrabblePoints);
            }
                

            if (word.toUpperCase().equals("X"))
                break;
            else
                System.out.println("Wrong input");
        }
    }    

    private void inputWord() {

        System.out.println("Write a word");
        scrabbleList.add(System.console().readLine().toUpperCase());

    }
    
    private void calculateScrabblePoints() {

        for(int i = 0; i < scrabbleList.size(); i++){
            for(int j = 0; j < scrabbleList.get(i).toUpperCase().length(); j++){
                char ch = scrabbleList.get(i).charAt(j);
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'L' || ch == 'N' || ch == 'R' || ch == 'S' || ch == 'T'){
                    scrabblePoints++;
                }
                if(ch == 'D' || ch == 'G'){
                    scrabblePoints += 2;
                }
                if(ch == 'B' || ch == 'C' || ch == 'M' || ch == 'P'){
                    scrabblePoints += 3;
                }
                if(ch == 'F' || ch == 'H' || ch == 'V' || ch == 'W' || ch == 'Y'){
                    scrabblePoints += 4;
                }
                if(ch == 'K'){
                    scrabblePoints += 5;
                }
                if(ch == 'J' || ch == 'X' ){
                    scrabblePoints += 8;
                }
                if(ch == 'Q' || ch == 'Z'){
                    scrabblePoints += 10;
                }
            }
        }
    }
}
