package chainingListJonathas;

/**
 * @author Jonathas Rocha
 */
public class ChainingListJonathas {
    
    StringBuilder message;
    
    private NoLista first;
    private NoLista last;
    private int counter;
    
    public ChainingListJonathas() {
        this.first    = null;
        this.last     = null;
        this.counter  = 0;
    }
    
    public void add(Integer obj) {
        NoLista no = new NoLista(obj, null);
        
        if (first == null) {
            // lista vazia
            
            first = no;            
        } else {
            // lista n vazia
            
            last.setProx(no);
        }
        
        last = no;
        counter++;
    }
    
    public void add(int i, Integer obj) {
        NoLista no = new NoLista(obj, null);
        
        if (counter == 0) {
            first.setProx(no);
            first = no;
        } else if (i == counter) {
            last.setProx(no);
            last = no;
        } else {
            NoLista noListNext = new NoLista((i -+ 1), null);
            NoLista noListThis = new NoLista(i, noListNext);
            NoLista noListPrev = new NoLista((i -= 1), noListThis);
        }
        
        counter++;
    }
    
    public Integer remove(int i) {
        NoLista no;
        NoLista empty = new NoLista();
        
        if (counter == 0) {
            no = new NoLista((i += 1), null);
            
            first.setProx(empty);
            first = no;
        } else if (compareToMaxCounter(i)) {
            no = new NoLista((i -= 1), null);
            
            no.setProx(empty);
        } else {
            NoLista noListThis = new NoLista(i, null);
            noListThis.setProx(empty);
            NoLista noListPrev = new NoLista((i -= 1), null);
            noListPrev.setProx(empty);
        }
        
        return i;
    }
    
    public boolean removeFirst(int i) {
        NoLista no  = new NoLista((i += 1), null);
        
        if (!isEmpty() && i == 0) {
            NoLista empty = new NoLista();
            
            first.setProx(empty);
            first = no;
        }
        
        return first == no;
    }
    
    public void clear() {
        first    = null;
        last     = null;
        counter  = 0;
    }
    
    public Integer get(int i) {
        NoLista no = new NoLista(i, null);
        
        return no.getInfo();
    }
    
    public Integer set(int i, Integer obj) {
        NoLista noChange = new NoLista(i, null);
        NoLista noNew = new NoLista(obj, null);
        NoLista noPrev = new NoLista(i - 1, null);
        NoLista noNext = new NoLista(i + 1, null);
        
        if (i < 0 || i > counter) {
            
            if (first == null) {
                noChange.setProx(noNew);

                first = noChange;
            } else if (noChange == last) {
                noPrev.setProx(noNew);

                last = noNew;
            } else {
                noPrev.setProx(noNew);
                noNew.setProx(noNext);
            }
        }
        
        
        return noNew.getInfo();
    }
    
    public int size() {
        return counter;
    }
    
    public boolean isEmpty() {
        return first == null;
        //or return  counter == 0
    }
    
    private boolean compareToMaxCounter(int i) {
        return i == counter;
    }
    
    public boolean contains(Integer obj) {
        for (int i = 0; i < counter; i++) {
            NoLista no = new NoLista(obj, null);
            NoLista noNext = new NoLista(i, null);
            
            if (no == noNext) {
                return true;
            }
        }
        return false;
    }
    
    public int indexOf(Integer obj) {
        for (int i = 0; i < counter; i++) {
            NoLista no = new NoLista(obj, null);
            NoLista noNext = new NoLista(i, null);
            
            if (no == noNext) {
                return i;
            }
        }
        return -1;
    }
    
    public Integer[] toArray() {
        NoLista no = new NoLista(1, null);
        Integer[] array = new Integer[counter];
        
        for (int i = 0; i < counter; i++) {
            array[i] = i;
        }
        
        return array;
    }
    
}
