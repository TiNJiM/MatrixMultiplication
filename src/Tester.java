
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
		int b[][] = {{-1,3},{0,9},{1,-11},{4,-5}};
		int answer[][] = MatrixMult.mult(a,b);
		for (int count1 = 0; count1<answer.length;count1++) {
			for (int count2 = 0; count2<answer[count1].length;count2++) {
				System.out.print(answer[count1][count2]+"\t");
			}
			System.out.println(" ");
		}
	}

}
