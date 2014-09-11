package Messenger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Messenger.MessageWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author mdeboer1
 */
public class GuiMessageWriter implements MessageWriter{

    @Override
    public void writeMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
