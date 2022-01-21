package lecture04_05;

import java.util.Iterator;
import java.util.List;

public interface MyList<E> extends Iterable<E>{


    // Public methods
    public void add(int index, E item);

    public void add(E item);

    public E get(int index);

    public int size();

    public E set (int index, E replaceValue);

    public E remove(int index);

    public boolean removeI(Object i);




}
