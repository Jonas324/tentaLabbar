package se.jonas;

public class Twofer {

    public void run() {

        System.out.println("Hur många gånger vill du köra: ");
        int antal = Integer.parseInt(System.console().readLine());

        for(int i = 0; i < antal; i++){
            System.out.println("Skriv ett namn: ");
            String namn = System.console().readLine();

            String twofer = generateTwofer(namn);
            System.out.println(twofer);
        }
    }

    private String generateTwofer(String namn) {
        String twofer = "One for " + namn + ", one for me.";
        if((namn.equals(""))){
            return "One for you, one for me.";
        } 
        else
        return twofer;
    }

}
