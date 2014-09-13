package MessageService;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mdeboer1
 * This class writes a message to the console.
 */
public class ConsoleMessageWriter implements MessageWriter{

    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
    
}
