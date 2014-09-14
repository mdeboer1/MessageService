package MessageService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author mdeboer1
 * This class takes a typed in message from the keyboard.  All properties are
 * private (Encapsulation) and the class only performs the actions it needs to, 
 * which is get a message from the keyboard and return it (SRP) to the calling class 
 * (MessageManager).
 */
public class KeyboardMessageReader implements MessageReader{
    
    private Scanner keyboard = new Scanner(System.in);
    private String message;
    
    @Override
    public String readMessage() {
        System.out.println("Enter in your message.");
        message = keyboard.nextLine();
        return message;
    }
}
