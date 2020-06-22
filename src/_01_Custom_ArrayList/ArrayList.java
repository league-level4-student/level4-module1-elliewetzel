package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] name;
	
	public ArrayList() {
		name = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return name[loc];
	}
	
	public void add(T val) {
		//int i;
		//int c;
		T[] nArr = (T[]) new Object[name.length+1];
		for(int i = 0; i < nArr.length-1;i++) {
			nArr[i] = name[i];
		}
		nArr[nArr.length-1] = val;
		name = nArr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] naArr = (T[]) new Object[name.length+1];
		for(int i = 0; i < naArr.length; i++) {
			if(i < loc) {
				naArr[i] = name[i];
			}
			else if(i==loc) {
				naArr[loc] = val;
			}
			else if(i > loc){
				naArr[i] = name[i-1];
			}
		}
		name = naArr;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		name[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] namArr = (T[]) new Object[name.length-1];
		for(int i = 0; i < namArr.length; i++) {
			if(i>=loc) {
				namArr[i] = name[i+1];
			}
			else {
				namArr[i]= name[i];
			}
		}
		name = namArr;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i < name.length; i++) {
			if(name[i] == val) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return name.length;
	}
}