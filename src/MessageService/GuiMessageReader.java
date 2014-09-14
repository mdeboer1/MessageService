/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageService;
import javax.swing.JOptionPane;
/**
 *
 * @author mdeboer1
 * This class allows for the user to enter in the message through a GUI.  All 
 * properties are private (Encapsulation) and it only performs the actions needed,
 * which is to read a message from a GUI and return the message (SRP) to caller 
 * (MessageManager).
 */
public class GuiMessageReader implements MessageReader {
    
    private String message;
    
    @Override
    public String readMessage() {
        message = JOptionPane.showInputDialog(null, "Enter in your daily message,"
                + "Daily Message", JOptionPane.PLAIN_MESSAGE);
        return message;
    }
}
