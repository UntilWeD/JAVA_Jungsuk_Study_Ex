package ch11;

import java.util.*;
import java.util.function.UnaryOperator;

public class MyVector implements List{
	Object[] data = null;
	int capacity = 0;
	int size = 0;
	
	public MyVector(int capacity) {
		if(capacity < 0)
			throw new IllegalArgumentException("유효하지 않은 값입니다. :"+ capacity);
		
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public MyVector() {
		this(10);
	}
	
	//최소한의 저장공간(capactiy)를 확보하는 메서드
	public void ensureCapacity(int minCapacity) {
		if (minCapacity - data.length > 0) {
			setCapacity(minCapacity);
		}
	}
	
	public boolean add(Object obj) {
		//새로운 객체를 저장하기전에 저장할 공간을 확보한다.
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}
	
	public Object get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		return data[index];
	}
	
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		oldObj = data[index];
		
		// 삭제하고자하는 객체가 마지막개체가 아니라면, 배열복사를 통해 빈자리를 채워줘야 한다.
		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		
		// 마지막데이터를 null로 한다. 배열은 0부터 시작하므로 마지막요소는 index가 size-1이다.
		data[size-1] = null;
		size--;
		return oldObj;
	}
	
	public boolean remove(Object obj) {
		for(int i=0;i<size;i++) {
			if (obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity == capacity) return; // 크기가 같으면 변경하지 않는다.
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear() {
		for(int i =0;i < size; i++)
			data[i] = null;
		size = 0;
	}
	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		
		return result;
	}
	
	public boolean isEmpty() {return size==0; }
	public int capacity() {return capacity;}
	public int size() { return size;}
	
	//리스트 인터페이스로부터 상속받은 메서드들//
	public boolean contains(Object o) {return false;}
	public Iterator iterator() {return null;}
	public Object[] toArray(Object a[]) {return null;}
	public boolean containsAll(Collection c) {return false; }
	public boolean addAll(Collection c) {return false; }
	public boolean addAll(int index, Collection c) {return false; }
	public boolean removeAll(Collection c) {return false; }
	public boolean retainAll(Collection c) {return false; }
	public boolean equals(Object o) {return false; }
	
	public Object set(int index, Object element) {return null;}
	public void add(int index, Object element) {}
	public int indexOf(Object o) {return -1;}
	public int lastIndexOf(Object o) {return -1;}
	public ListIterator listIterator(){return null;}
	public ListIterator listIterator(int index){return null;}
	public List subList(int fromIndex, int toIndex){return null;}
	
	default void sort(Comparator c) {/* 내용생략*/}
	default Spliterator spliterator() {/* 내용생략*/}   //이들은 모두 1.8이후이다.
	default void replaceAll(UnaryOperator operator) {/* 내용생략*/}
}

	}
}
