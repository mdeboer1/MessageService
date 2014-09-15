package MessageService;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdeboer1
 * This class delegates the responsibilities to lower classes.  It receives two 
 * strings from the start up class, and creates the necessary objects in the 
 * constructor.  This hides all Reader and Writer classes from the start up.
 */
public class MessageManager {
    
    private MessageReader reader;
    private MessageWriter writer;
    
    public MessageManager(String write, String read){
        switch (read) {
            case "1":
                reader = new KeyboardMessageReader();
                break;
            case "2":
                reader = new GuiMessageReader();
                break;
            case "3":
                reader = new RandomMessageReader();
                break;
        }
        switch (write) {
            case "1":
                writer = new ConsoleMessageWriter();
                break;
            case "2":
                writer = new GuiMessageWriter();
                break;
        }
     }
    
    public void manageMessage(){
        String message = reader.readMessage();
        writer.writeMessage(message);
    }
}
