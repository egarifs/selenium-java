import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,4,5,6,7,8,10,12};
		
		//check array has multiple 2
		
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i] % 2==0) {
				System.out.println(arr2[i]);
			}
		
			else {
				System.out.println(arr2[i] + "is not multiple of 2");	
			}
		}
		System.out.println("=======================");
		ArrayList<String> a = new ArrayList();
		a.add("firdaus");
		a.add("rijki");
		a.add("ega");
		a.add("egarifs");
//		a.remove(3);
		System.out.println(a.get(3));
		 
		
		for(int i=0; i<a.size();i++){
			System.out.println(a.get(i));
		}
		System.out.println("=======================");
		
		for(String val :a) {
			System.out.println(val);
		}
		
		//check in array contain ega
		System.out.println(a.contains("ega"));
		
		//item is present in Array list
		
		
		//create object of the class - object.method
		
		System.out.println("=======================");
		String [] name = {"Ega", "Rijki", "Firdaus"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("Firdaus"));
		
		

	}

}
