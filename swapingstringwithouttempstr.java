package javaCodingPracticeQAs;

public class SwapStringWithoutTemp {

	public static void main(String[] args) {
		// To swap two string without using temp variable
		String s1="Hello";
		String s2="world";
		System.out.println("Before swapping the original strings are"+"s1="+s1+"and s2="+s2);
		//appending s2 to s1
		s1=s1+s2;
		//storing s2 in s1;//
		s2=s1.substring(0,s1.length()-s2.length());
		//now s1 has the value of s2
		s1=s1.substring(s2.length());//a=a+b
		System.out.println("After swapping the original strings are"+"s1="+s1+"and s2="+s2);		

	}

}
