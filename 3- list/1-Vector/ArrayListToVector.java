/*
Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/

import java.util.*;
publ
		for(int i=0; i<v.size(); i++){
			for(int j=i+1; j<v.size(); j++){
				
				int val1 = (int) v.get(i);
                int val2 = (int) v.get(j);

                if (val1 > val2) {
                   
                    v.set(i, val2);
                    v.set(j, val1);
                }
			}
		}
		
		System.out.println(v);
	}
}
