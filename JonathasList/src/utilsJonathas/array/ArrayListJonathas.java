package utilsJonathas.array;

public class ArrayListJonathas/* extends ArrayListJonathasAbstract */{

	private Integer    array[];
	private boolean    resizable;
	private int 	   initialCapacity;
	private int 	   counter;
	private static int X = 7;
	
	public ArrayListJonathas() {
		this(10);
	}
	
	public ArrayListJonathas(int initialCapacity) {
		this(10, true);	
	}
	
	public ArrayListJonathas(int initialCapacity, boolean resizable) {
		this.initialCapacity = initialCapacity;
		this.resizable = 	   resizable;
		this.counter = 		   0;
		this.array = 		   new Integer[initialCapacity];
	}
	
	private void resizeArray() {
		// array temporary
		Integer array_temp[] = new Integer[array.length + X];
		array_temp = array;
		
		array = new Integer[array.length + X];
		array = array_temp;
	}
	
	public void add(Integer obj) {
		array[counter] = obj;
		counter++;
		
		if(resizable && counter == array.length) {
			resizeArray();
		}
	}
	
	public Integer[] toArray() {
		// not null return. TODO: Change
		return array;
	}

}
