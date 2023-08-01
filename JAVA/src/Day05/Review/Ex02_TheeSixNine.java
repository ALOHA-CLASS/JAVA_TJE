package Day05.Review;

public class Ex02_TheeSixNine {
	
	public static void main(String[] args) {
		// 정수 1~100 까지 반복하면서,
		// 해당 수가 3 또는 6 또는 9 일 때,
		// 369가 되는 개수 만큼 "*" 을 출력하는 프로그램을 작성하시오.
		// ex) 3   --->  "*"
		//     39  --->  "**
		//     40  --->  40
		for (int i = 1; i <= 100 ; i++) {
			int ten = i / 10;
			int one = i % 10;
			boolean ten369 = (ten == 3 || ten == 6 || ten == 9);
			// boolean ten369 = ten != 0 && ten % 3 == 0;
			boolean one369 = (one == 3 || one == 6 || one == 9);
			// boolean one369 = one != 0 && one % 3 == 0;
			
			// 십의 자리, 일의자리 둘다 369  --> "**"
			if( ten369 && one369 )
				System.out.println("**");
			// 십의 자리, 일의자리 둘 중 하나 369  --> "*"
			else if( ten369 || one369 ) 
				System.out.println("*");
			else 
				System.out.println(i);
		}
	}

}


