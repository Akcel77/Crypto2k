package fr.crypto.bo;

/**
 * Cryptage V0.1
 * On ajoute +1 au char, ne prend pas en compte de key
 */
public class CryptoMoji implements Crypto{

    @Override
    public String cryptThis(String msg) {
        return cryptThis(msg,null);
    }

    @Override
    public String cryptThis(String msg, String key) {
        char[] strArray = msg.toCharArray();
        StringBuilder response = new StringBuilder();
        for (char letter : strArray) {
            int letterCast = (int) letter + 1;
            response.append((char) letterCast);
        }
        return response.toString();
    }

    @Override
    public String decryptThis(String msg) {
        char[] strArray = msg.toCharArray();
        StringBuilder response = new StringBuilder();
        for (char letter : strArray) {
            int letterCast = (int) letter - 1;
            response.append((char) letterCast);
        }
        return response.toString();
    }

    @Override
    public String decryptThis(String msg, String key) {
        return null;
    }
}
