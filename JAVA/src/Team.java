import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
	
	public static void main(String[] args) {
		// 13명
		// 13명 중 1명 랜덤으로 뽑기
		int one = (int) (Math.random() * 13); // 0~12
		
		String students[] 
				= {"강진수","구교찬","김민정","김수빈","김준혁","이용성","이유나","이정훈","임성민","정슬기","정재원","추윤주","한현진"};
		
		System.out.println("one : " +  students[one] );
		
		
		List<String> studentList = new ArrayList<>();
		for (int i = 0; i < students.length; i++) {
			studentList.add(students[i]);
		}
		System.out.println("--------------------------------------");
		
		studentList.remove( one );
		
		Collections.shuffle(studentList);
		
		int k = 1;
		for (String s : studentList) {
			System.out.print(s + " ");
			if( k % 4 ==0 )
				System.out.println();
			k++;
		}
	}
}






