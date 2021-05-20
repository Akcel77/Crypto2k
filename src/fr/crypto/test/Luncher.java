package fr.crypto.test;

import fr.crypto.ihm.Windows;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class Luncher {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable(){


                //Run l'application
                @Override
                public void run(){
                    try {
                        UIManager.setLookAndFeel(new NimbusLookAndFeel());
                    } catch (UnsupportedLookAndFeelException e) {
                        e.printStackTrace();
                    }
                    Windows luncher = new Windows("Crypto2000");
                }
            });
        }
    }