package 질문;
import java.io.File;
import java.util.Scanner;

public class _16 {
	public static void main(String[] args) {
		System.out.println("번호\t이름\t성적\t반");
		Scanner sc = null;
		try {
			File file = new File("student.txt");
			sc = new Scanner(file);
			String line = "";
			while (sc.hasNextLine()) {
				line = sc.nextLine();
				String arr[] = line.split("\\/");
				for (String i : arr) {
					System.out.print(i + "\t");
				}
				System.out.println();
				// java.lang.IllegalStateException: Scanner closed
				// sc.close() <- 여기서 Scanner 객체를 닫아버리면, 
				// 				 메모리에서 객체가 해제되므로, 사용할 수 없다.
			}
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
