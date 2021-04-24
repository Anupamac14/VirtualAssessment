import java.io.File;

public class CompareFilePathEx {
	public static void main(String[] args) {
		File file1 =new File("C:\\Users\\Anupama.C\\Documents\\Anu\\Hello11728318065434885552.tmp");
		File file2 =new File("C:\\Users\\Anupama.C\\Documents\\Anu\\Hello11728318065434885552.tmp");
		if (file1.compareTo(file2) == 0) {
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both files are not same");
		}
	}
}
