package MessageService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author mdeboer1
 * This class writes a message to a GUI
 */
public class GuiMessageWriter implements MessageWriter{

    @Override
    public void writeMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Daily Message", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
