package ch11;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator{
	int cursor = 0;
	int lastRet = -1;
	
	public MyVector2(int capacity) {
		super(capacity);
	}
	
	public MyVector2() {
		this(10);
	}
	
	public String toString() {
		String tmp = "";
		Iterator it = iterator();
		
		for(int i=0;it.hasNext();i++) {
			if(i!=0) tmp+=", ";
			tmp +=it.next();
		}
		return "[" +tmp+ "]";
	}
	
	public Iterator iterator() {
		cursor = 0;
		lastRet = -1;
		return this;
	}
	
	public boolean hasNext() {
		return cursor != size();
	}
	
	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
	}
	
	public void remove() {
		//더이상 삭제할것이 없으면 IllegalStateException을 발생시킨다.
		if(lastRet==-1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--;     // 삭제후에 cursor위치값 감소
			lastRet = -1; // lastRet의 값을 초기화 한다.
		}
	}

}
