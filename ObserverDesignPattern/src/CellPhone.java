/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imtisal
 */
public class CellPhone implements Observer, IDisplay {

    private Subject afad;

    String message;

    public CellPhone(Subject afad) {
        this.afad = afad;
        this.afad.register(this);
    }
    
    

    @Override
    public void update(String alertMessage) {
        this.message = alertMessage;
        displayMessage();
    }

    @Override
    public String displayMessage() {
       // System.out.println("a toast message is displayed for 15 min-->" + message);
        return "Phone Alarm!!\n" + message;
    }

}
