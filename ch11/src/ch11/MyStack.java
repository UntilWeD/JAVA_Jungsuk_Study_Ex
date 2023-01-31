package ch11;

import java.util.*;

public class MyStack {
	public object pushh(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek();
		//만일 Stack이 비어있으면 peek()메서드가 EmptyStackException을 발생시킨다.
		//마지막요소를 삭제한다. 배열의 index가 0부터 시작하므로 1을빼준다.
		removeElementAt(size() -1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if( len ==0)
			throw new EmptyStackException();
		
		return elementAt(len-1);
	}
	
	public boolean empty() {
		return size()==0;
	}
	
	public int search(Object o) {
		int i= lastIndexOf(o);
		
		if(i>=0) { //객체를 찾은경우
			return size()-1 //Stack은 맨위에 저장된 객체의 index를 1로 정의하기때문에 
		} //계산을 통해서 구한다.
		
		return -1; //해당객체를 찾지 못하면 -1를 반환한다.
	}


}
