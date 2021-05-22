package fr.crypto.ihm;


import fr.crypto.bo.Crypto;
import fr.crypto.bo.CryptoAkcel;

import javax.swing.*;
import java.io.IOException;

public class Controller  {

    private Windows windows ;

    private Crypto cryptoAkcel = new CryptoAkcel();
    private static Controller instance;



    public static synchronized Controller get()  {
        if (instance == null){
            instance = new Controller();
        }
        return instance;
    }

    public void cryptThis(){
        System.out.println("YES");

        String mess = windows.getMessage().getText();
        String key = windows.getClef().getText();
        System.out.println(mess + " " + key);
//        if (windows.getRadioCrypter().isSelected()){
//
//            cryptoAkcel.cryptThis(mess,key);
//            JFrame frame = new JFrame("Message Crypte");
//
//            //2. Optional: What happens when the frame closes?
//            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//
//            //4. Size the frame.
//            frame.pack();
//
//            //5. Show it.
//            frame.setVisible(true);
//            JOptionPane.showMessageDialog(frame, "Nice");
//        }
    };




}
