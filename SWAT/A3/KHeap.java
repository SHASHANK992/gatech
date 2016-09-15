import korat.finitization.*;
import korat.finitization.impl.*;

public class KHeap {
    private int k;
    private int size;
    private int array[];

    public boolean repOK() {
        // returns true if shape and heap property are satisfied
        // complete this method
        
        // Make sure the array is not null
        if (array == null)
        {
            return false;
        }
        
        // Make sure that the size is reasonable
        // Note: I am not sure why the check here is not to see if the
        // size matches the size of the array
        if (size < 0 || size > array.length)
        {
            return false;
        }
        
        // Go through every non-empty element
        for (int i = 0; i < size; i++)
        {
            // Ensure current array element is valid (non-empty)
            int elem_i = array[i];
            if (elem_i == -1)
            {
                return false;
            }
            
            // Ensure that the ordering is correct
            // The parent is greater than the child
            if (i > 0)
            {
                int elem_parent = array[ (i-1)/k ];
                if(elem_i > elem_parent)
                {
                    return false;
                }
            }
        }
        
        // Check that the elements at the end of the array
        // are null
        for (int i = size; i < array.length; i++)
        {
            if (array[i] != -1)
            {
                return false;
            }
        }
        
        return true;
    }

    public static IFinitization finKHeap(int k, int maxSize, int maxArrayLength, int maxArrayValue) {
        IFinitization f = FinitizationFactory.create(KHeap.class);
        IIntSet ks = f.createIntSet(k, k);
        f.set("k", ks);
        //complete the remaining method
        // Define limits on size member
        IIntSet sizes = f.createIntSet(0, 1, maxSize);
        f.set("size", sizes);
        
        // Define limits on heap array
        IIntSet arrayLength = f.createIntSet(0, 1, maxArrayLength);
        IIntSet arrayValues = f.createIntSet(-1, 1, maxArrayValue);
        IArraySet arrays = f.createArraySet(int[].class, arrayLength, arrayValues, 1);
        f.set("array", arrays);
        
        return f;
    }
}
