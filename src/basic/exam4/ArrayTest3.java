package basic.exam4;

public class ArrayTest3 {
	public static void main(String[] args) { 
// public(누구에게나) static(정적, 처음부터 메모리가 들어가 있어야 하는 void(return 할 거 없다.))

//		int	             [열] 
//		int	         [행][열]
//		int      [표][행][열]
//		int[더비][표][행][열]
		int[][] score = { { 100, 90, 80, 70 }, // [][] 인 이유는 array 안에 array가 들어가기 때문이다!! 
						  { 90, 80, 70, 60 }, 
						  { 80, 70, 60, 50 } 
					    }; // 이런 참조자료형을 통해서 stack - hash map - heap 을 이해 할 수 있네!!
						   // heap에 있으면 수정하기 좋네, 동적이네..
		
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		
		int score_length = score.length;
		for (int row = 0; row < score_length; row++) {
			int sum = 0;
			int column_count = 0;
			for (int column = 0; column < score[row].length; column++) { 
//				모든 행의 column 개수가 다 같을 수는 없다... 그래서 score[0] 이 아닌 score[row]를 쓴다!!
				sum += score[row][column];
				System.out.print(score[row][column] + "\t");
				column_count ++;
			}
			System.out.print(sum + "\t");
			System.out.println(sum/column_count);
		} // 이 for문으로 stack 구조를 이해 할 수 있네...
	}
}
