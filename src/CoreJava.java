
public class CoreJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 5;
		String website = "Ega";
		char letter = 'e';
		double dec = 2.99;
		boolean myCard = true;
		
		System.out.println(myNum + "is the value sotred in the number variable");
		System.out.println(website);
		
		//Array
		int[] arr = new int [5];
		arr[0] = 1 ; 
		arr[1] = 2 ; 
		arr[2] = 3 ;
		arr[3] = 4 ;
		arr[4] = 5 ;
		
		int [] arr2 = {1,2,3,4};
		
		 
		
		//for lop 
		for(int i = 0; i < arr.length; i ++)
		{
			System.out.println(arr[i]);
		}
		
		String [] name = {"Ega", "Rijki", "Firdaus"};
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for ( String s: name) 
		{
			System.out.println(s);
		}
		

	}

}
