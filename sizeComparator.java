package collections.assignments;

import java.util.Comparator;

public class sizeComparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
		int i=0;
					    HDTV h1 = (HDTV) o1;
					    HDTV h2 = (HDTV) o2;
					
					    if(h1.size<h2.size)
					    	i=-1;
					    else if(h1.size>h2.size)
					    		i=1;
					    	 else if(h1.size ==h2.size)
					    		 i=0;
						
			return i;		

	}		
			   

		
	}

