package pt.miguel.binarysearch.res;

import java.util.Arrays;
import java.util.Random;

public class CreateArray {
    
    /**
     * Creates a sorted array of integers that includes the specified value.
     * @param value Value to include in the array.
     * @param dimension Dimension of the array.
     * @param differentValues If true, all elements in the array will be different.
     * @return Sorted array of integers.
     */
    static int[] createArrayWith(
            int value,
            int dimension,
            boolean differentValues){
        int[] arr =new int[dimension];
        if(differentValues){
            for(int i=0;i<dimension;i++)
                arr[i]=i*10;
            if((value%10!=0)||(0>value)||(value>(dimension-1)*10))
                arr[0]=value;
        }
        else{
            Random r=new Random();
            int range = (Math.abs(value) < 10) ? 10 : Math.abs(value);
            for(int i=0;i<dimension;i++)
                arr[i]=r.nextInt(range*4)-range*2;
            arr[0]=value;

        }
        Arrays.sort(arr);
        return arr;
    }
}
