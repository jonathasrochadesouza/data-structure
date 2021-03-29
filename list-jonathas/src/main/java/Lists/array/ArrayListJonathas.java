package Lists.array;

import Lists.general.ListJonathas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRO DEV
 */
public class ArrayListJonathas<T> implements ListJonathas<T> {

    private T              array[];
    private boolean        resizable;
    private int 	   initialCapacity;
    private int 	   counter;
    private static int     X = 7;
    private T              cache = null;
    private Integer        cache_index = null;
        
    public ArrayListJonathas() {
        this(10);
    }

    public ArrayListJonathas(int initialCapacity) {
        this(10, true);	
    }

    public ArrayListJonathas(int initialCapacity, boolean resizable) {
        this.initialCapacity =     initialCapacity;
        this.resizable = 	   resizable;
        this.counter = 		   0;
        this.array = 		   (T[]) new Integer[initialCapacity];
    }
    
    /**
     * {@inheritDoc }
     * 
     * use library 'arrays.copy'
     */
    private void resizeArrayList() {
        // array temporary
        T array_temp[] = (T[]) new Object[array.length + X]; //Não é possível inicializar um vetor sem ser de nenhum tipo armazenado na memória, por isso forçamos u cast
//        array_temp = array;        

        int num = 0;
        for (T Obj : array) {
            array_temp[num] = Obj;
            num++;
        }
        
        array = array_temp;
        
        if (cache != null) {
            add(cache);
            cache = null;
        } if (cache_index != null) {
            add(cache);
            cache = null;
            cache_index = null;
        } else if (cache != null) {
            add(cache);
            cache = null;
        }
    }
    
    @Override
    public void add(T Obj) {
        if(resizable && counter == array.length) {
            resizeArrayList();
            cache = Obj;
        }
        
        array[counter] = Obj;
        counter++;
    }

    @Override
    public void add(int i, T Obj) {
        if(counter == array.length) {
            resizeArrayList();
            cache = Obj;
            cache_index = i;
        }
        
        array[i] = Obj;
        counter++;
    }

    @Override
    public T remove(int i) {
        T cache_removed = array[i];
        array[i] = null;
        
        if (array[i] == null) {
            counter--;
        }
        
        return cache_removed;
    }

    @Override
    public boolean removeFirst(T Obj) {
        if(array.length > 0) {
            array[0] = null;
            
            return array[0] == null;
        }
        return false;
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public void clear() {
        
    }

    @Override
    public T set(int i, T Obj) {
        return null;
    }

    @Override
    public int size(int i) {
        return counter;
    }

    @Override
    public boolean isEmpty() {
        int num = 0;
        for (T obj : array) {
            num++
        }
    }

    @Override
    public boolean contains(T Obj) {
        return false;
    }

    @Override
    public int indexOf(T Obj) {
        return 0;
    }

    @Override
    public int lastIndexOf(T Obj) {
        return 0;
    }

    @Override
    public T[] toArray() {
        // not null return. TODO: Change
	return array;
    }
    
}
