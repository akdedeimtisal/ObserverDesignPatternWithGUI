/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imtisal
 */
public class Main {

    AfadOffice ao;

    CellPhone myPhone;

    TV myTv;
    
    SmartWatch myWatch;

    public Main() {
        ao = new AfadOffice();
        myPhone = new CellPhone(ao);
        myTv = new TV(ao);
        myWatch = new SmartWatch(ao);
        ao.setAlertMessage("There will be an earthquake in a few minutes. \nMove to a safe area.");
        ao.statusChanged();
    }
    
    

}
