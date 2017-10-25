/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Santosh Goteti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // TODO code application logic here
        String USERNAME = "Santosh";
        String password = "abcd";
        System.out.println("Username: "+USERNAME);
		System.out.println("MD5: " + Encryption.MD5(password));
                System.out.println("SHA1: " + Encryption.SHA1(password));
    }
    
}
