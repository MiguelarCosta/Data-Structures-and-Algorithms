package pt.miguel.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DezReais implements Iterable<Double>{
    static final int MAX_ELEMENTS = 10;
    List<Double> list;
    int modificationsCounter;

    public DezReais(){
        this.list = new ArrayList<>();
        modificationsCounter = 0;
    }

    public void add(Double value){
        if(list.size() == MAX_ELEMENTS) throw new IllegalStateException("Array is already at maximum capacity "+ MAX_ELEMENTS);
        list.add(value);
        modificationsCounter ++;
    }

    public void remove(int index){
        list.remove(index);
        modificationsCounter ++;
    }

    public Iterator<Double> iterator(){
        return new IteratorDezReais(this);
    }

}
