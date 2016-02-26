/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author dono
 */
public class NewClass {
    public static void main(String[] args) {
        DesEncrypter encrypter = new DesEncrypter();
        String text = encrypter.encrypt("Hello ITI");
        System.out.println(text);
        String text2 = encrypter.decrypt(text);
        System.out.println(text2);
    }
}
