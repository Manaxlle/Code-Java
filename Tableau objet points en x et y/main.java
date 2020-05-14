import java.io.*;
public class main
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
        /**
     * Constructeur d'objets de classe main
     */
    public static void main(String[]args)
    {
        // initialisation des variables d'instance
        Tableau t = new Tableau(5);
        t.initTab();
        t.affichePoint();
        t.searchPositifs();
    }
}
