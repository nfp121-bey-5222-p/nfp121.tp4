package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        

        // à compléter à l'identique de la question 2_1, (du copier/coller)...
        // le bouton A a 3 observateurs jbo1, jbo2 et jbo3

        // le bouton B a 2 observateurs jbo1 et jbo2

        // le bouton C a 1 observateur jbo1

        // à compléter pour la question 2_2 (JMouseObserver)
            // le bouton A a 1 observateur jmo1
            // le bouton B a 1 observateur jmo2
            // le bouton C a 1 observateur jmo3
        boutonA.addActionListener(new JButtonObserver("jbo1",contenu));
        boutonA.addActionListener(new JButtonObserver("jbo2",contenu));
        boutonA.addActionListener(new JButtonObserver("jbo3",contenu));
        boutonB.addActionListener(new JButtonObserver("jbo1",contenu));
        boutonB.addActionListener(new JButtonObserver("jbo2",contenu));
        boutonC.addActionListener(new JButtonObserver("jbo1",contenu));
        
        boutonA.addMouseListener(new JMouseObserver("jmo1",contenu));
        boutonA.addMouseListener(new JMouseObserver("jmo2",contenu));
        boutonA.addMouseListener(new JMouseObserver("jmo3",contenu));
        boutonB.addMouseListener(new JMouseObserver("jmo1",contenu));
        boutonB.addMouseListener(new JMouseObserver("jmo2",contenu));
        boutonC.addMouseListener(new JMouseObserver("jmo1",contenu));
    }
    
     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }


}
