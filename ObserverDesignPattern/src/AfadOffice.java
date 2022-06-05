
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author imtisal
 */
public class AfadOffice implements Subject {

    private ArrayList<Observer> observerList;

    private String alertMessage;

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;

    }

    public String getAlertMessage() {
        return alertMessage;
    }
    
    

    public AfadOffice() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        int i = observerList.indexOf(observer);

        if (i >= 0) { //if there is a observer, remove it.
            observerList.remove(observer);
        } else { //there is no observer
            System.out.println("There is no observer that you want to remove");
        }

    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(alertMessage);

        }

    }

    public void statusChanged() {
        notifyObservers();
    }

}
