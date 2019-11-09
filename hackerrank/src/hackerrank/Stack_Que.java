package hackerrank;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Stack_Que {
	public static void main(String args[])
	{
//		Stack<Integer> st= new Stack<Integer>();
//		st.push(1);
//		st.push(2);
//		st.add(3);
//		int z = (int)st.pop();
//		
//		System.out.println(st);
		
		PriorityQueue<Integer> que= new PriorityQueue<Integer>();
		
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		
		Iterator it= que.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		que.remove();
		System.out.println(que);
		
	}
}
