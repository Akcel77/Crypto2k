package fr.crypto.ihm;

import javax.swing.*;
import java.awt.*;

/**
 * Fenetre principale d'affichage
 */
public class Windows extends JFrame {

    private JTextField message, clef ;
    private JRadioButton radioCrypter, radioDecrypter;
    private ButtonsPanel btns;

    private JPanel mainPanel, radioType;

    public Windows(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(800,500));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        contentInit();
    }

    // Getter


    public void contentInit(){

        //Initialisation du Layout
        this.mainPanel = new JPanel();
        mainPanel.setLayout( new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        //ICI margin de depart pour chaques items
        gbc.insets = new Insets(3 ,3 ,3 ,3);


        //  gridx correspond au colonne
        //  gridy a la ligne
        gbc.gridx = 2;
        gbc.gridy = 1;
        mainPanel.add(new JLabel("Message"),gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        mainPanel.add(getMessage(),gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        mainPanel.add(new JLabel("Clef de cryptage"),gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        mainPanel.add(getClef(),gbc);

        //Ici j'instancie de nouvelle marge
        gbc.insets = new Insets(20 ,3 ,3 ,3);
        gbc.gridy = 5;
        gbc.gridx = 1;
        mainPanel.add(new JLabel(""),gbc);
        gbc.gridx=2;
        gbc.gridheight = 1;
        mainPanel.add(getRadioType(),gbc);

        gbc.insets = new Insets(30 ,3 ,3 ,3);
        gbc.gridy =6;
        gbc.gridx =2;
        gbc.gridwidth = 2;
        mainPanel.add(getBtns(), gbc);


        setContentPane(mainPanel);


    }


    /**
     *GETTER DES BUTTONS
     */
    public JTextField getMessage() {
        if (message == null){
            message = new JTextField(30);
        }
        return message;
    }
    public JTextField getClef() {
        if (clef == null){
            clef = new JTextField(30);
        }
        return clef;
    }

    public JRadioButton getRadioCrypter() {
        if (radioCrypter == null){
            radioCrypter = new JRadioButton("Crypter message");
        }
        return radioCrypter;
    }

    public JRadioButton getRadioDecrypter() {
        if (radioDecrypter == null){
            radioDecrypter = new JRadioButton("Decrypter message");
        }
        return radioDecrypter;
    }
    /**
     * Regroupe les radios type sur un seul bouton
     * @return les radios btns
     */
    public JPanel getRadioType() {
        if (radioType == null){
            radioType = new JPanel();
            radioType.setLayout(new BoxLayout(radioType, BoxLayout.Y_AXIS));
            radioType.add(getRadioCrypter());
            radioType.add(getRadioDecrypter());
            ButtonGroup buttonGroup = new ButtonGroup();
            buttonGroup.add(getRadioCrypter());
            buttonGroup.add(getRadioDecrypter());
        }
        return radioType;
    }


    public ButtonsPanel getBtns() {
        if (btns == null){
            btns = new ButtonsPanel();

        }
        return btns;
    }
}
