import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Décrivez votre classe Convertisseur ici.
 *
 * @Amir Nasseri (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Mafenetre extends JFrame implements ActionListener
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private JTextField saisieFranc = new JTextField(20);
    private JTextField resultatEuro = new JTextField(20);
    private JLabel label1 = new JLabel("Francs");
    private JLabel label2 = new JLabel("Euros");
    private JButton bFtoE = new JButton("F>>E");
    private JButton bEtoF = new JButton("E>>F");
    private JButton bquit = new JButton("Quitter");

    public Mafenetre()
    {
        // initialisation des variables d'instance
        setTitle ("Convertisseur");
        Container panneau = getContentPane();
        
        
        JPanel saisie = new JPanel(new FlowLayout(FlowLayout.CENTER));
        saisie.add(saisieFranc);
        saisie.add(label1);
        
        JPanel casse = new JPanel(new FlowLayout(FlowLayout.CENTER));
        casse.add(bFtoE);
        casse.add(bEtoF);
        casse.add(bquit);
        
        JPanel executer = new JPanel(new FlowLayout(FlowLayout.CENTER));
        executer.add(resultatEuro);
        executer.add(label2);
        
        
        panneau.add(saisie,BorderLayout.NORTH);
        panneau.add(casse,BorderLayout.CENTER);
        panneau.add(executer,BorderLayout.SOUTH);
        
        
        bFtoE.addActionListener(this);
        bEtoF.addActionListener(this);
        bquit.addActionListener(this);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == bFtoE){
          String F = saisieFranc.getText();

          double f = Double.valueOf(F);
          f = f / 6.55957;
          
          String E = Double.toString(f);
          
          resultatEuro.setText(E);
        }
        
        else if (source == bEtoF){
          String E = resultatEuro.getText();

          double euro = Double.valueOf(E);
          euro = euro * 6.55957;
          
          String F = Double.toString(euro);
          
          saisieFranc.setText(F);
        }
        
        else if (source == bquit){
          System.exit(0);
        }
    }
}
