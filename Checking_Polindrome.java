//3. WAP to check if �2552� is palindrome or not.

public class Checking_Polindrome {

	public static void main(String[] args) {
		String s1="2552";
		String s2="";
		for (int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s2.equals(s1)) {
			System.out.println("String is polindrome");
		}else {
			System.out.println("String is not a polindrome");
		}
	}

}
