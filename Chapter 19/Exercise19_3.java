/*
Name: Amanda Cauzza 
Date: 7/30

Write the following method that returns a new ArrayList. 
The new list contains the non-duplicate elements from the original list. 
Use Exercise19_03.java the test class.
 */
import java.util.ArrayList;

public class Exercise19_3 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(14);
    list.add(42);
    list.add(25);
    
    ArrayList<Integer> newList = removeDuplicates(list);
    	for (int i = 0; i < list.size() - 1; i++) {
    		for (int j = i + 1; j < list.size(); j ++) {
    			if (list.get(i).compareTo(list.get(j)) == 0)
    				list.remove(j);
    		}
    	}
 
    
    System.out.print(newList);
  }

private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
	// TODO Auto-generated method stub
	return list;
}
}