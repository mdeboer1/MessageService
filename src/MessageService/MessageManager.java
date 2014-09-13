package MessageService;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdeboer1
 * This class delegates the responsibilities to lower classes.  
 */
public class MessageManager {
    private MessageWriter writer;
    private MessageReader reader;
    
    public MessageManager(MessageWriter writer, MessageReader reader){
        this.reader = reader;
        this.writer = writer;
        
    }
    
    public void manageMessage(){
        String message = reader.readMessage();
        writer.writeMessage(message);
    }
}
