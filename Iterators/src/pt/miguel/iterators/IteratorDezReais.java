package pt.miguel.iterators;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class IteratorDezReais implements Iterator<Double> {
    private DezReais dezReais;
    private int currentIndex;
    private int modificationsCounter;
    private boolean canRemove;


    public IteratorDezReais(DezReais dezReais){
        this.dezReais = dezReais;
        this.currentIndex = -1;
        this.modificationsCounter = dezReais.modificationsCounter;
        this.canRemove = false;
    }

    public void isValidState(){
        if(this.modificationsCounter != dezReais.modificationsCounter) throw new IllegalStateException("Concurrent Modification Detected.");
    }
    public boolean hasNext(){
        isValidState();
        return currentIndex+1 < dezReais.list.size() && currentIndex+1 < DezReais.MAX_ELEMENTS;
    }

    public Double next(){
        isValidState();
        if(!hasNext()) throw new NoSuchElementException("No more elements");
        Double value = dezReais.list.get(++currentIndex);
        canRemove = true;
        return value;
    }

    public void remove(){
        isValidState();
        if(!canRemove) throw new IllegalStateException("Can't remove right now");
        dezReais.remove(currentIndex);
        currentIndex--;
        canRemove = false;
        modificationsCounter++;
        
    }


}
