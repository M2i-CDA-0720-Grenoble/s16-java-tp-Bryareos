import Game.Mastermind;

public class App
{
    // Cette méthode est appelée automatiquement au lancement de l'application
    public static void main(String[] args) throws Exception {
        // Efface la console
        System.out.print("\033[H\033[2J");   
        System.out.flush();

        // Créer une nouvelle partie
        Mastermind mastermind = new Mastermind();

        while (mastermind.getIsRunning()) {
            mastermind.update();
        }
        System.out.println("Goodbye !");
    }
}
