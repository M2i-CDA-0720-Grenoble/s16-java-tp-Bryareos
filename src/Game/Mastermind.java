package Game;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mastermind {
    private Scanner scanner;
    private boolean isRunning;

    private static final char OK = 'o';
    private static final char ABSENT = '-';
    private static final char MISPLACED = 'x';

    private static final int COLORS_NB = 6;
    private static final int COLORS_MAX = 4;
    private static final int ESSAIS_MAX = 10;
    private static final Color[] COLORS = {};

    private int count;
    private char[] solution = new char[COLORS_NB];
    private char[] proposition = new char[COLORS_NB];

    public boolean victory = false;

    public Mastermind() {
        // Crée un objet Scanner permettant de traiter les saisies de l'utilisateur
        scanner = new Scanner (System.in);

        System.out.println("Mastermind, trouve la combinaison des " + COLORS_NB + " couleurs entre les couleurs suivantes :" + COLORS);
        System.out.println( OK + " siginife que c'est la bonne couleur à la bonne place, " + ABSENT + "signifie que la couleur est absente et " + MISPLACED +
                "signifie que la couleur est présente mais pas à la bonne place");
        System.out.println("Attention, vous avez droit a " + ESSAIS_MAX + " essais");
        System.out.println("----------------------------");




        System.out.println("Victoire en seulement "+count+ " coups");
        terminate();
    }

    /**
     * Met a jour l'état du jeu
     */
    public void update() {
        // Invite l'utilisateur à rentrer une ligne de texte
        System.out.println("");
        System.out.println("> ");
        String userInput = scanner.nextLine().trim();

        // Si l'utilisateur a rentré "exit", termine le jeu
        if ("exit".equals(userInput)) {
            terminate();
            return;
        }

    }

    private match(Pattern p, Matcher m)
    {

    }
    private void terminate() {
        isRunning = false;
        scanner.close();
    }
    public boolean getIsRunning() {
        return isRunning;
    }
}
