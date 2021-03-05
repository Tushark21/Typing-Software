/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typing.tutor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tushar
 */
public class TypingTutor {

    /**
     */
    public static Properties p = new Properties();

    public static void main(String[] args) {
        // TODO code application logic here
        FileReader reader=null;
        try {
            reader = new FileReader("info.properties");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fileWriter = new FileWriter("info.properties");
                reader = new FileReader("info.properties");
                //Logger.getLogger(TypingTutor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex1) {
                Logger.getLogger(TypingTutor.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        //System.out.println("Error"+reader);
        Properties prop = new Properties();
        
        try {
            prop.load(reader);
            //System.out.print("k"+p.getProperty("name"));
            if (prop.getProperty("name")!=null) {
                //System.out.println("ss");
                MainFrame mF = new MainFrame();
                mF.setVisible(true);
            } else {
                //System.out.println("DFf");
                ContainerFrame c = new ContainerFrame();
                c.setVisible(true);
                //System.out.print("b"+p.getProperty("name"));
            }
        } catch (IOException ex) {
            Logger.getLogger(TypingTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
