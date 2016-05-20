/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphonebookfullversion;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Глеб
 */
public class MainBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        PhoneBook p = new PhoneBook();
        p.startPrograme();
    }

}
