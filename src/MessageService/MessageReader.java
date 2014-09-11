package MessageService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mdeboer1
 * This is the interface for reading messages intended to be compliant with
 * DIP and Liskov's Substitution Principle
 */
public interface MessageReader {
    
    public abstract String readMessage();
}
