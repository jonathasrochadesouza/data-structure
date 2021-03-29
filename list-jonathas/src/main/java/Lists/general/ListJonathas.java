package Lists.general;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * public class ListaComEncadeamento<T> implements ListJonathas<T>
 * public class ListaComArray<T> implements ListJonathas<T>
 * 
 * ListaComArray
 * construtor principal - array = (T[]) new Object[initialCapacity]
 * 
 * NoLista(Integer, NoLista)
 * Change to --> NoLista(T, NoLista)
 * 
 * @author Jonathas Rocha de Souza
 */
public interface ListJonathas<T> {
    
    /**
     * @param Obj 
     */
    public void add(T Obj);
   
    /**
     * @param i
     * @param Obj 
     */
    public void add(int i, T Obj);
    
    /**
     * @param i
     * @return 
     */
    public T remove(int i);

    /**
     * @param Obj
     * @return 
     */
    public boolean removeFirst(T Obj);
    
    /**
     * @param i
     * @return 
     */
    public T get(int i);
    
    /**
     * Clear
     */
    public void clear();
    
    /**
     * @param i
     * @param Obj
     * @return 
     */
    public T set(int i, T Obj);
    
    /**
     * @param i
     * @return 
     */
    public int size(int i);
    
    /**
     * @return 
     */
    public boolean isEmpty();
    
    /**
     * @param Obj
     * @return 
     */
    public boolean contains(T Obj);
    
    /**
     * @param Obj
     * @return 
     */
    public int indexOf(T Obj);
    
    /**
     * @param Obj
     * @return 
     */
    public int lastIndexOf(T Obj);
    
    /**
     * @return 
     */
    public T[] toArray();
}
