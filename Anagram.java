import java.util.Arrays;

/* 
   Test1: first= Keep   second = Peek. || output: Anagram = true.
   Test1: first= Test   second = Best. || output: Anagram = false.
 */

public class Anagram {
	
	public static void anagram(String first, String second)
	{
	   String s1 = first.replaceAll(" ", "");  //removing all white spaces.
	   String s2 = second.replaceAll(" ", "");
	   boolean status=true;
	   
	   if(s1.length()!= s2.length()) //comparing length after removing white spaces.
	     {
		  status =false;   
	     }
	   else
	     {
		   char[] Array1= s1.toLowerCase().toCharArray(); //storing all characters into array.
		   char[] Array2= s2.toLowerCase().toCharArray();
		   
		   Arrays.sort(Array1);    //sorting array
		   Arrays.sort(Array2);
		   //System.out.println(Array1);
		   //System.out.println(Array2);
		   status= Arrays.equals(Array1, Array2);  //comparing array1 and array2. 
	     }
	   
	   if(status)
	     {
	       System.out.println(first+" and " +second+ " are Anagrams.");
	     }
	   
	   else
	     {
		   System.out.println(first+" and " +second+ " are not Anagrams.");	   
	     }
	}

	   public static void main(String[] args) {
		
         anagram("Keep", "Peek");              //calling method to check two strings.
         anagram("Mother in Law", "Hitler Woman");
         
	   }

}
