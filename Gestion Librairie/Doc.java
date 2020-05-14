import java.io.*;
public class Doc
{
    private String title;
    private double price;
    
    public Doc(String name, double prix)
    {
        title = name;
        price = prix;
    }
    
    public double getPrix()
    {
        return(price);
    }
    
    public String getTitre()
    {
        return(title);
    }
    
    public String affiche()
    {
        System.out.println("Titre : " + title + ", prix : " + price + "€");
        return("");
    }
}
