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
        
        MessageWriter writer = new ConsoleMessageWriter();
        MessageReader reader = new KeyboardMessageReader();
//        MessageWriter writer = new GuiMessageWriter();
        
        MessageManager manager = new MessageManager(writer, reader);
        
        manager.manageMessage();
    }
}
