
public class CoreJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string is an object
		String s = "Ega Rijki Firdaus";
		String s1 = "Ega Rijki Firdaus";
		String s2 = "Ega Rijki Firdaus";

		String[] splitString = s.split("Rijki");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);

		for (int i =s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		
		

	}

}
