
public class TestSortableArray {
	public static void main (String[] args){
		sortableArray a = new sortableArray(5);	
		a.get(0,4);
		a.get(1,2);
		a.get(2,8);
		a.get(3,1);
		a.get(4,5);
		System.out.println(a.toString());
		a.sort();
		System.out.println(a.toString());
	}
}