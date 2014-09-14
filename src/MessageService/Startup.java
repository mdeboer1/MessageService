package MessageService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdeboer1
 * This is the main, creates message and manager objects, sends information to
 * manager object for delegation of responsibilities.  Uses Liskov's Substitution
 * Principle.  
 */
public class Startup {
        public static void main(String[] args) {
        
//            This line creates a object that writes to the console
            MessageWriter writer = new ConsoleMessageWriter();
            
//            This line creates an object that reads from keyboard input
    //        MessageReader reader = new KeyboardMessageReader();
            
//            This line creates an object that writes to a GUI
    //        MessageWriter writer = new GuiMessageWriter();
            
//            This line creates an object that reads randomly from an array
    //        MessageReader reader = new RandomMessageReader();
            
//            This line creates an object that reads from GUI input
            MessageReader reader = new GuiMessageReader();
            
//            This line creates the object to manage all the types of messages
            MessageManager manager = new MessageManager(writer, reader);
            
//            This line calls the method that directs the message from source to destination
            manager.manageMessage();
    }
}
