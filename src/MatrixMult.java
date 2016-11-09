
public class MatrixMult {
	private MatrixMult (){
		
	}
	public static int[][] mult (int a[][], int b[][]) { 
		int bCol = 0;
		int ans[][] = new int[a.length][b[bCol].length];
		for (int count1 = 0; count1<ans.length;count1++){
			for(int count2 = 0; count2<ans[count1].length;count2++){
				ans [count1][count2] = 0;
			}
		}
		for (int c1=0;c1<b[bCol].length;c1++){
			for(int c2=0;c2<a.length;c2++){
				for(int c3=0;c3<a[c2].length;c3++){
					ans [c2][bCol] += (a[c2][c3] * b[c3][bCol]);
				}
			}
			bCol++;
		}
		return ans;
	}
}
