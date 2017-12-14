/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tweeto;

/**
 *
 * @author Abood
 */
public class Tweeto {
    private String ID;
    private String Tweet;
    private Tweeto next;

    public Tweeto(String ID, String Tweet) {
        this.ID = ID;
        this.Tweet = Tweet;
        this.next = null;
    }

    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTweet() {
        return Tweet;
    }

    public void setTweet(String Tweet) {
        this.Tweet = Tweet;
    }

    public Tweeto getNext() {
        return next;
    }

    public void setNext(Tweeto next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ID: " + ID + " , Tweet: " + Tweet;
    }
    
    
}
