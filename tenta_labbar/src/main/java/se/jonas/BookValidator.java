package se.jonas;

import java.util.ArrayList;

public class BookValidator {

    public void run() {

        String code = "3-598-21508-8";

        isValidFormat(code);
    }

    private void isValidFormat(String code) {

        String[] split = code.split("-");

        if (split[0].length() == 1 && split[1].length() == 3 && split[2].length() == 5 && split[3].length() == 1) {

            boolean cheek = chekCode(code);

            if (cheek == true) {
                boolean calc = calculateISBN(code);

                System.out.println(calc);
            }

            else {
                System.out.println("Fel kod!");
            }
        } else {
            System.out.println("Fel kod!");
        }
    }

    private boolean chekCode(String code) {

        boolean bool = false;
        for (int i = 0; i < code.length(); i++) {

            char ch = code.charAt(i);
            String c = String.valueOf(ch);
            if(i == 0 && !Character.isDigit(ch))
                return false;
            if (i == 1 || i == 5 || i == 11) {
                if (c.equals("-")) {
                    bool = true;
                } else {
                    return false;
                }
            } else if (i == 12 && c.equals("X") || Character.isDigit(ch)) {
                bool = true;
            } else {
                return false;
            }

        }

        return bool;
    }

    private boolean calculateISBN(String code) {
        boolean bool = true;
        ArrayList<Integer> n = new ArrayList<>();
        String[] c = code.split("-");  
        String numStr = c[0] + c[1] + c[2] + c[3];

        for(int i = 0; i < numStr.length(); i++){
            String s = String.valueOf(numStr.charAt(i));
            if(s.equals("X")){
                n.add(10);
            }
            else{
                n.add((int)numStr.charAt(i));
            }
        }
        
        double sum = (n.get(0)*10 + n.get(1)*9 + n.get(2)*8 + n.get(3)*7 + n.get(4)*6 + n.get(5)*5 + n.get(6)*4 + n.get(7)*3 + n.get(8)*2 + n.get(9)*1) % 11;
        
        if (sum == 0){
            bool = false;
        }
        return bool;
    }
}
