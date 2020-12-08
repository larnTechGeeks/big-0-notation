package comp2402a4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class RyabkoTree implements PrefixStack {
	List<Integer> elements;
	int items;

  public RyabkoTree() {
	  elements = new ArrayList<Integer>();
	  items = 0;
	  //throw new UnsupportedOperationException();
  }

  public void push(int x) {
	  try {
		  elements.add(x);
		  items++;
	  }
	  catch(Exception e) {
		  throw new UnsupportedOperationException();
	  }
  }

  public int pop() {
	 
	  try {
		  int elem = elements.remove(0);
		  items--;
		  return elem;
	  }
	  catch(Exception e) {
		  throw new UnsupportedOperationException();
	  }
  }


  public int get(int i) {
	  try {
		  Iterator<Integer> it = iterator();
		  int count = 0;
		  while(it.hasNext()){
			  int val = it.next();
			  if (count == i) {
				  return val;
			  }
			  count ++;
		  }
	  }
	  catch(Exception e) {
		  throw new UnsupportedOperationException();
	  }
    return 0;
  }

  public int set(int i, int x) {
	  try {
		  int elem = elements.set(i, x);
		  return elem;
	  }
	  catch(Exception e) {
		  throw new UnsupportedOperationException();
	  }
	  
    
  }

  public long prefixSum(int i) {
	  Iterator<Integer> it = iterator();
	  long sum=0;
	  try {
		  int count = 0;
		  while(it.hasNext() && count <=i){
			  int val = it.next();
			  sum += val;
			  count ++;
		  }
	  }
	  catch(Exception e) {
		  throw new UnsupportedOperationException();
	  }
	  
	  return sum;
    
  }

	public int size() {
		try {
			return items;
		}
		catch(Exception e){
			throw new UnsupportedOperationException();
		}
	    
	}

	public Iterator<Integer> iterator() {
		try {
			Iterator<Integer> iterator = elements.iterator(); 
			return iterator;
		}
		catch(Exception e) {
			throw new UnsupportedOperationException();
		}
	}
	
	public void printValues() {
		for (int i=0; i<items; i++) {
			System.out.println("Index: "+i+ "Value: "+ elements.get(i));
		}
	}
}
