import korat.finitization.*;
import korat.finitization.impl.*;

public class KHeap {
    private int k;
    private int size;
    private int array[];

    public boolean repOK() {
        // returns true if shape and heap property are satisfied
        // complete this method
    }

    public static IFinitization finKHeap(int k, int maxSize, int maxArrayLength, int maxArrayValue) {
        IFinitization f = FinitizationFactory.create(KHeap.class);
        IIntSet ks = f.createIntSet(k, k);
        f.set("k", ks);
        //complete the remaining method
    }
}
