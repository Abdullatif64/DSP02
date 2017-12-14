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
public class TweetoHT {
    Tweeto[] HT;
    int size; 

    public TweetoHT() {
        this.HT = new Tweeto[37];
    }

    public Tweeto[] getHT() {
        return HT;
    }

    public void setHT(Tweeto[] HT) {
        this.HT = HT;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TweetoHT{" + "HT=" + HT + ", size=" + size + '}';
    }
    
    public int hash(String ID){
        int index;
        int ch  = ID.toLowerCase().charAt(1);
        if(ch >= 98)
            index = ch % 37;
        else
            index = (ch % 37) + 1;
        
        return index;
    }
    
    public void insert(Tweeto T) 
    {
        int index = hash(T.getID());
        
        if (HT[index] == null)
        {
            HT[index] = T;
            size++;
            return;
        }
        // If not empty
        Tweeto temp = HT[index]; 
        while (temp.getNext() != null)
        {
            temp = temp.getNext();
        }
        temp.setNext(T);
        T.setNext(null);
        size++;
    }
    
    public Tweeto search(String U, String K)
    {
        int index = hash(U);
        Tweeto temp = HT[index];
        while(temp != null)
        {
            if (temp.getID().equalsIgnoreCase(U) && temp.getTweet().contains(K))
                return temp;
            temp = temp.getNext();
        } 
        return temp;
    }
        
}

