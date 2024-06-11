import java.util.Arrays;
public class sortableArray {
	protected Object [] array;
	public sortableArray () {
		this(10);
	}
	public sortableArray (int tam){
		array = new Object[tam];
	}
	// realização da interface
	public void sort () {Arrays.sort(array);}
	public Object get(int index, Object value){
		return array[index] = value;
	}
	public String toString() {
		return Arrays.toString(array);
	}
}