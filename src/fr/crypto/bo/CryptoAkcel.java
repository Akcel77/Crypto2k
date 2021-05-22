package fr.crypto.bo;

public class CryptoAkcel implements Crypto {


    @Override
    public String cryptThis(String msg) {
        return null;
    }

    @Override
    public String cryptThis(String s, String key) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) < 65 || s.charAt(i) > 90){ //ASCII character (capital letter)
                throw new IllegalArgumentException("" +
                        "Seul les characteres majuscules sont acceptes");
            }
            //add shift modularly
            char encyphered = s.charAt(i) + getShift(key, i) > 90 ? (char)((s.charAt(i) + getShift(key, i)) - 26) : (char)(s.charAt(i) + getShift(key, i));
            builder.append(encyphered);
        }

        return builder.toString();

    }

    @Override
    public String decryptThis(String s,  String key) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) < 65 || s.charAt(i) > 90){ //ASCII character (capital letter)
                throw new IllegalArgumentException("" +"Seul les characteres majuscules sont acceptes");
            }
            //subtract shift modularly
            char decyphered = s.charAt(i) - getShift(key, i) < 65 ? (char)((s.charAt(i) - getShift(key, i)) + 26) : (char)(s.charAt(i) - getShift(key, i));
            builder.append(decyphered);
        }
        return builder.toString();
    }

    private static int getShift(String key, int i) {
        char keyChar = key.charAt(i % key.length());
        if(keyChar < 65 || keyChar > 90){
            throw new IllegalArgumentException("" +
                    "Seul les characteres majuscules sont acceptes");
        }
        return ((int) keyChar) - 65;
    }


    @Override
    public String decryptThis(String msg) {
        return null;
    }

}
