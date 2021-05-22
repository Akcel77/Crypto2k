package fr.crypto.bo;

public class Tester {
    private static Crypto cryptoAkcel = new CryptoAkcel();

    public static void main(String[] args) {
        String s = "JETESTMONSCRYPT";
        String key = "KEYTEST";
        String crypted = cryptoAkcel.cryptThis(s, key);
        System.out.println(crypted);
        System.out.println(cryptoAkcel.decryptThis(crypted, key));
    }
}
