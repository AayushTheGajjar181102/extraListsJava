package arraylists;

import java.util.*;
import lists.*;

class FirstArrayList{
	
	public static void main(String[] args){
		
		//instantiations
		List a = new ArrayList();
		List b = new ArrayList();
		List c = new ArrayList();
		
		//add one value
		a.add(5);
		
		//add multiple continuous values new*
		Lists.adds(a,8,9);
		Lists.adds(b,15,18,21);
		
		//add one value at given index
		a.add(1,12);
		
		//add one object at given index
		b.addAll(1,a);
		
		//add values from other list
		c = b.subList(4,7);
		
		//using for loop new*
		Lists.print(a);
		
		//replace the value at given index
		a.set(1,6);
		
		//using listiterator
		Lists.print(a.listIterator()); 
		Lists.print(b.listIterator());
		Lists.print(c.listIterator());
		
		//using reverse listiterator new*
		Lists.print(c.listIterator(c.size()));
		
	}
}
