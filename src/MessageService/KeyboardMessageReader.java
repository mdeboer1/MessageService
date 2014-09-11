package MessageService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import MessageService.MessageReader;
import java.util.Scanner;
/**
 *
 * @author mdeboer1
 */
public class KeyboardMessageReader implements MessageReader{
    
    Scanner keyboard = new Scanner(System.in);

    /**
     *
     * @return
     */
    @Override
    public String readMessage() {
        System.out.println("Enter in your message.");
        String message = keyboard.nextLine();
        return message;
    }
}
