package fr.crypto.ihm;


import fr.crypto.bo.Crypto;
import fr.crypto.bo.CryptoAkcel;

import javax.swing.*;
import java.io.IOException;

public class Controller  {

    private Windows windows  ;

    private Crypto cryptoAkcel = new CryptoAkcel();
    private static Controller instance;



    public static synchronized Controller get()  {
        if (instance == null){
            instance = new Controller();
        }
        return instance;
    }

    public void isCrypted(String mess, String key){
        //OUVERTURE D'UN MODAL POUR PRINT LA KEY CRYPTEE
        System.out.println(mess + " " + key);
        System.out.println(cryptoAkcel.cryptThis(mess,key));
        JOptionPane.showMessageDialog(null,cryptoAkcel.cryptThis(mess,key) , "Message Crypte", JOptionPane.PLAIN_MESSAGE);
    }

    public void isDecrypted(String mess, String key){
        //OUVERTURE D'UN MODAL POUR PRINT LA KEY DECRYPTEE
        System.out.println(mess + " " + key);
        System.out.println(cryptoAkcel.decryptThis(mess,key));
        JOptionPane.showMessageDialog(null,cryptoAkcel.decryptThis(mess,key) , "Message Decrypte", JOptionPane.PLAIN_MESSAGE);
    }




}
