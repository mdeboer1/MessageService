/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageService;

import java.util.Random;

/**
 *
 * @author mdeboer1
 * This class randomly selects a message from an array of Strings.  All properties
 * are declared final (Encapsulation) and the class only performs that actions
 * required of it (SRP), which is create an array of Strings, and randomly select
 * a String to be returned.
 */
public class RandomMessageReader implements MessageReader{
    
    private String [] randomMessage = {"Hello there!", " Today is a great day!", 
            "Have a wonderful day!", "Eat your vegetables!", "Somebody take my stapler?"};
    private Random random = new Random();
    private int randomNum;
    
    @Override
    public String readMessage(){
        randomNum = random.nextInt(5);
        return randomMessage[randomNum];
    }
}
