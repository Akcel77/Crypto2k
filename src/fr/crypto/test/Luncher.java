package fr.crypto.test;

import fr.crypto.ihm.Windows;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.io.File;
import java.io.IOException;


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
                    try {
                        Windows luncher = new Windows("Crypto2000");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }