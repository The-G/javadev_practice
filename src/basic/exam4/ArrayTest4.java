package basic.exam4;

public class ArrayTest4 {
	public static void main(String[] args) { 

		int[][][] score = 
			            {
		            		{
								  { 100, 90, 80, 70}, // [][] 인 이유는 array 안에 array가 들어가기 때문이다!! 
								  { 90, 80, 70, 60 }, 
								  { 80, 70, 60, 50 } 			            			
		            		},
		            		{
								  { 100, 100, 90, 80},
								  { 100, 90, 80, 70 }, 
								  { 90, 80, 70, 60 } 			            			
		            		}	
					    }; // 이런 참조자료형을 통해서 stack - hash map - heap 을 이해 할 수 있네!!
						   // heap에 있으면 수정하기 좋네, 동적이네..
		int score_len = score.length;
		for(int table=0;table<score_len; table++) {
			System.out.println( (table+1) + "학기 성적표");
			System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
			for(int row = 0; row < score[table].length; row++) {
				int sum = 0;
				for(int column = 0; column < score[table][row].length; column++) {
					System.out.print(score[table][row][column] + "\t");
					sum += score[table][row][column];
				}
				System.out.println(sum + "\t" + sum/score[table][row].length);
			}
			System.out.println();
		}
	}
}
