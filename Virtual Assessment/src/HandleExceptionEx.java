
public class HandleExceptionEx {
	public static void main(String[] args) {
		try {
			int arr[] = new int[7];
			arr[4] = 30/0;
			System.out.println("Output");
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excess array elements");
		}
		catch(Exception e) {
			System.out.println("other Exception");
		}
		System.out.println("out of try catch block");
	}
}
