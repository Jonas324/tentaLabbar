package se.jonas;

public class AI {

    public void run() {

        System.out.println("Hello, i am Bob. How are you?");

        char ch = ' ';
        while (true) {

            String resp = System.console().readLine();

            for (int i = 0; i < resp.length(); i++) {
                ch = resp.charAt(i);
                
                if (Character.isUpperCase(ch) && resp.endsWith("?")) {
                    System.out.println("Calm down! I know what im doing");
                    break;
                }
                if (resp.endsWith("?")) {
                    System.out.println("Sure.");
                    break;
                }
                else if (Character.isUpperCase(ch)) {
                    System.out.println("WHOA! No need to yell");
                    break;
                }
                else if (!(resp.endsWith("?"))){
                    System.out.println("Whatever.");
                    break;
                }
            }
            
        }
    }
}
