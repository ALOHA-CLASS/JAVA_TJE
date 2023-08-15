package 질문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("item : ");
		String item = sc.nextLine();
		list.add(item);
		
		System.out.println( list.isEmpty() );
		
		for (String a : list) {
			System.out.println(a);
		}
	}
}
