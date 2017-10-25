/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author s528130
 */
import java.math.BigInteger;
import java.security.*;
import java.security.MessageDigest;

public class Encryption {

    public static String MD5(String input) {
        String hashtext = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messagedigest = md.digest(input.getBytes());
            BigInteger bi = new BigInteger(1, messagedigest); // use the biginteger constructor, by speciying the
            // magnitude..
            hashtext = bi.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashtext;
    }

    public static String SHA1(String input) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] messagedigest = md.digest(input.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < messagedigest.length; i++) {
            sb.append(Integer.toString((messagedigest[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

}
