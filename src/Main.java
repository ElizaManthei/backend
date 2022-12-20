import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String letters[] = {"nul", "een", "twee", "drie", "vier", "vijf", "zes", "seven", "acht", "negen"};

        Translator transl = new Translator(numbers, letters);
        Scanner userIn = new Scanner(System.in);

        int user = 0;
        String userChoice = "";
        boolean ofPlay = true;

        while (ofPlay) {
            System.out.println("Print x om te stoppen, v om te vertalen");
            userChoice = userIn.next();

            if (userChoice.equals("x")) {
                ofPlay = false;
                System.out.println("Tot volgende keer.");
            } else if (userChoice.equals("v")) {
                System.out.println("Voer een cijfer in (van 0 tot 9): ");
                user = userIn.nextInt();
                if (user >= 0 && user < 10) {
                    System.out.println(user + "  is " + transl.translate(user));
                } else {
                    System.out.println("Ik begrijp u niet.");
                }
            }else {
                System.out.println("Ik begrijp u niet.");

            }
        }
    }
}