import java.io.*;
import javax.swing.*;
public class Point
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x,y;

    public Point(String num)
    {
        // initialisation des variables d'instance
        
        x = Integer.parseInt(JOptionPane.showInputDialog(num +" Saisie position Point en X"));      
        y = Integer.parseInt(JOptionPane.showInputDialog(num + " Saisie position Point en Y"));        
        
    }

    public void affiche()
    {
        System.out.println( " X = " + x +" Y = " + y);
    }
    
    public int getX()
    {  
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
   
}
