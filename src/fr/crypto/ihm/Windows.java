package fr.crypto.ihm;

import javax.swing.*;
import java.awt.*;

/**
 * Fenetre principale d'affichage
 */
public class Windows extends JFrame {

    private JPanel mainPanel;

    public Windows(String title){
        super(title);
        this.setContentPane(getMainPanel());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500,500));
        this.setLocationRelativeTo(null);

        //TODO add components

        this.setVisible(true);
    }

    // Getter
    public JPanel getMainPanel() {
        if(mainPanel == null){
            this.mainPanel = new JPanel();
        }
        return mainPanel;
    }
}
