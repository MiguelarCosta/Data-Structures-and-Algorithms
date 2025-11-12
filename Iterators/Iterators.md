# Iterator

### An Iterator is an object that allows you to cross through a Data Structure/Collection.
### Allows the programmers to preserve the independence between the algorithms and the Data Structures manipulated.
### The Iterator is supplied by the Data Structure.

## In Java, Iterators must implement the following Interface:
````java
public interface Iterator<E>{
    boolean hasNext();
    E next(); 
    default void remove();
    default void forEachRemaining(Consumer<? super E> action); //Java 8+
}
````
## New Data Structures / Classes must provide the iterator through a factory method:
```` java
public class Pair <T> implements Iterable<T>{
    T p1, p2;
    
    Iterator <T> iterator(){
        return new IteratorPair<T>(this);
    } 
    // Remaining Class...
}

public class IteratorPair<T> implements Iterator<T>{
    int counter = 0;
    Pair<T> pair;
    
    boolean hasNext(){
        return counter != 2;
    }
    
    T next(){
        switch(counter){
            case 0: counter++; return pair.p1;
            case 1: conter ++; return pair.p2;
            default: throw new NoSuchElementExeption();
        };
    }
}
````
## Iterators must throw the following exceptions:
### UnsupportedOperationException -> Operation is not supported (ex: remove);
### NoSuchElementException -> Trying to access a element that does not exist;
### IllegalStateException -> Trying to remove without advancing to the first element or trying to remove the same element more than one time;
### ConcurrentModificationException -> Using an invalid state Iterator (the collection has been modified externally).

## Example:

```` java
public class MyList <T> implements Iterable<T> {
    private List<T> list = new ArrayList<T>();
    private modificationsCounter = 0; //This counter is used to SuportConcurrentModifications, if this counter and the counter on the Iterator class are different the Iterator throws ConcurrentModificationException
    
    public void add(T value){
        list.add(value);
        modificationsCounter++;
    }
    
    public void remove(int index){
        list.remove(index);
        modificationsCounter++;
    }
    
    public int getModificationsCounter(){ return modificationsCounter; }
    public T get(int index){ return list.get(index)}
    public int size(){ return list.size; }
    
    public Iterator<T> iterator(){
        return new IteratorMyList<T>(this);
    }
}


public class IteratorMyList<T> {
    private MyList list;
    private boolean canRemove; 
    private int modificationsCounter; //Internal Modifications Counter
    private int currentIndex;
    
    public IteratorMyList(T list) {
        this.list = list;
        this.canRemove = false; //Did not advance yet
        this.currentIndex = -1; //Start at invalid index, only advances to a valid index after next() is called
    }
    
    private void isValidState(){
        if (this.modificationsCounter != list.getModificationsCounter()) throw new IllegalStateException();
    }
    
    public boolean hasNext() {
     isValidState();
     return currentIndex +1 < list.size();
    }
    
    public T next(){
        isValidState();
        if(!hasNext()) throw new NoSuchElementException();
        T value = list.get(++currentIndex);
        canRemove = true;
        return value;
    }
    
    public void remove() { //Remove is Supported
        isValidState();
        if(!canRemove) throw new IllegalStateException();
        list.remove(currentIndex);
        modificationsCounter ++;
        currentIndex --;
    }
    
    public void remove(){ // Remove isn't supported
        throw new UnsupportedOperationException();
    }
}

//Use example:
public static <T> boolean search(Iterable<T> list, T obj){
    Iterator<T> it = list.iterator();
    
    while(it.hasNext()){
        if (it.next() == obj)
            return true;
    }
    return false;
}
````