package fr.crypto.ihm;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private JButton btnAkcel;
    private JButton btnJb;

    public ButtonsPanel(){
        setLayout(new FlowLayout());
        add(getBtnAkcel());
        add(getBtnJb());
    }

    public JButton getBtnAkcel() {
        if(btnAkcel == null){
            btnAkcel = new JButton();
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("ressource/mascotte.gif"));
            btnAkcel.setIcon(imageIcon);
        }
        return btnAkcel;
    }

    public JButton getBtnJb() {
        if(btnJb == null){
            btnJb = new JButton();
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("ressource/mrdollard.gif"));
            btnJb.setIcon(imageIcon);
        }
        return btnJb;
    }
}
