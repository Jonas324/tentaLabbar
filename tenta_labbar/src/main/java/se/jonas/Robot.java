package se.jonas;

public class Robot {
    
    public void run() {

        generateRobotNaame();
    }

    private void generateRobotNaame() {
        char[] ch = "ABCDEFGHIJKLMNOPQRSTUVWZYZ".toCharArray();

        String randomLetters = String.valueOf(ch[(int) ((Math.random() * 26))])
                + String.valueOf(ch[(int) ((Math.random() * 26))]);
        int randomNum = (int) ((Math.random() * 1000));
        String randomDigit = " ";

        if (randomNum < 10) {
            randomDigit = "00" + String.valueOf(randomNum);
        } else if (randomNum < 100 && randomNum > 9) {
            randomDigit = "0" + String.valueOf(randomNum);

        } else
            randomDigit = String.valueOf(randomNum);
    
    String robotName = randomLetters + randomDigit;

    System.out.println(robotName);
    }    
}
