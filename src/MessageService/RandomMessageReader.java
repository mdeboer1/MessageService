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
 */
public class RandomMessageReader implements MessageReader{
    
    public String readMessage(){
        String [] randomMessage = {"Hello there!", " Today is a great day!", 
            "Have a wonderful day!", "Eat your vegetables!", "Somebody take my stapler?"};
        Random random = new Random();
        int randomNum = random.nextInt(5);
        return randomMessage[randomNum];
    }
}
