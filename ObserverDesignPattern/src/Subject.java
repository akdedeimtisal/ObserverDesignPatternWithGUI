/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imtisal
 */
public interface Subject {
    public void register(Observer o);
    public void remove(Observer o);
    public void notifyObservers();
}
