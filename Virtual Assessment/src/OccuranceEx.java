import java.util.Scanner;

public class OccuranceEx {
	public static void main(String[] args) {
		String removeChar;
		char delChar;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter String");
		removeChar =s.nextLine();
		System.out.println("Enter the character to remove");
		delChar =s.next().charAt(0);
		String str = removeChar.replace(delChar,Character.MIN_VALUE);
		System.out.println(str);
	}
}
