package fr.crypto.bo;

/**
 * Interface cryptage
 */
public abstract interface Crypto {

    String cryptThis(String msg);
    String cryptThis(String msg, String key);
    String decryptThis(String msg);
    String decryptThis(String msg, String key);
}
