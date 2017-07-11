package collections.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TVList  {

	public static void main(String[] args) {
		
		HDTV h1 = new HDTV("Sony",40);
		HDTV h2 = new HDTV("LG",50);
		HDTV h3 = new HDTV("Samsung",35);
		HDTV h4 = new HDTV("Philips",60);
		
		ArrayList<HDTV> tvList = new ArrayList<HDTV>();
		tvList.add(h1);
		tvList.add(h2);
		tvList.add(h3);
		tvList.add(h4);
		
	Collections.sort(tvList,new sizeComparator());
	System.out.println("Sorted based on size");
	System.out.println("Brandname  Size");
	Iterator itr=tvList.iterator();  
	while(itr.hasNext()){  
	HDTV hd=(HDTV)itr.next();  
	System.out.println(hd.BrandName+ "  "+ hd.size  );  
	}  
		
		
	}

	
	}


