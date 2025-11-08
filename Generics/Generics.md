# Programing with Generics
## Generics let you create classes, interfaces and methods that can operate on different data types while maintaining compile-time type safety.
## Common Generic Type Parameters
| Symbol        | Meaning                                                             | Example Use    |
|---------------|---------------------------------------------------------------------|----------------|
| `T`           | Type (general)                                                      | `class Box<T>` |
| `E`           | Element(used in lists)                                              | `List<E>`      |
| `K`           | Key (used in maps)                                                  | `Map<K,V>`     |
| `V`           | Value (used in maps)                                                | `Map<K,V>`     |
| `?`           | Wildcard (any type)                                                 | `List<?>`      |
| `X extends Y` | `X` is equal or extends the class `Y` (or implements interface `Y`) |
| `X super Y`   | `Y` is equal or extends `X`(or implements interface `X`)            |

### `X` or `Y` can be replaced with `?` that means any class.


## Generic Methods
``` java
public static <T> void printArray(T[] array){
    for (T item : array)
        System.out.print(item + " ");
    System.out.println();    
}

public static void main(String[] args){
    Integer[] nums = {1, 2, 3};
    String[] words = {"A","B","C"};
    printArray(nums);
    printArray(words);

}
```
## Generic Class
``` java
public class Pair <T,S> {
    T first;
    S second;
    
    public Pair(T a, S b){
        first=a;
        second=b;
    }
    
    public T getFirst(){
        return first;
    }
    
    public S getSecond(){
        return second;
    }
    
    public setFirst(T a){
        first=a;
    }
    
    public setSecond(S b){
        second=b;
    }
    
    
}
```