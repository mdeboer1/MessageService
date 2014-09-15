package MessageService;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdeboer1
 * This is the main, creates strings to store user input, passes those strings
 * to MessageManager.  Input is validated so only specific information input by
 * the user will be accepted.
 */
public class Startup {
        public static void main(String[] args) {

            String read, write;
                      
            read = JOptionPane.showInputDialog("How would you like to input the message?" +
                        "Type 1 for console input, 2 for GUI input, or 3 to get from an array.");
            
            while( !((read.equals("1") || read.equals("2") || read.equals("3")))){
                //display warning message
                JOptionPane.showMessageDialog(null, "You have entered a non-supported number.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                read = JOptionPane.showInputDialog("How would you like to input the message?" +
                        "Type 1 for console input, 2 for GUI input, or 3 to get from an array.");
            }
            
            write = JOptionPane.showInputDialog("How would you like to display your message?" +
                    "Type 1 to display in the console or 2 to display in a GUI.");
            
            while (!(write.equals("1") || write.equals("2"))){
                    JOptionPane.showMessageDialog(null, "You have entered a non-supported number.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                    write = JOptionPane.showInputDialog("How would you like to display your message?" +
                    "Type 1 to display in the console or 2 to display in a GUI.");
            }        
            MessageManager manager = new MessageManager(write, read);
            manager.manageMessage();
        }   
}