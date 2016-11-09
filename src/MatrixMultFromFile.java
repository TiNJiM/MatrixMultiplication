import java.util.*;
import java.io.*;
public class MatrixMultFromFile {
	public static void main(String[] args) throws IOException {
		
		//file input
		Scanner sf = new Scanner (new File("U:\\Workshop\\MatrixMultiplication\\src\\MatrixData.txt"));
		int maxIndx = -1;
		String text[] = new String[100];
		while(sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
		int a[][] = new int[3][4];
		int b[][] = new int[4][2];
		//scanning each row of the array
		int j = 0;
		for (j = 0; j<=maxIndx; j++) {
			Scanner sc = new Scanner(text[j]);
			int count1 = 0;
			int count2 = 0;
			if(j<4){ //for a[][]
				while (sc.hasNextInt()){
					a[j][count1] = sc.nextInt();
					count1++;
				}
			}
			else if(j>=4 && j<=maxIndx){ //for b[][]
				while (sc.hasNextInt()) {
					b[j-4][count2] = sc.nextInt();
					count2++;
				}
			}
		}
		//doing the matrix multiplication
		int bCol = 0;
		int ans[][] = new int [a.length][b[bCol].length];
		for (int c1=0;c1<b[bCol].length;c1++){
			for(int c2=0;c2<a.length;c2++){
				for(int c3=0;c3<a[c2].length;c3++){
					ans [c2][bCol] += (a[c2][c3] * b[c3][bCol]);
				}
			}
			bCol++;
		}
		for (int count1 = 0; count1<ans.length;count1++) {
			for (int count2 = 0; count2<ans[count1].length;count2++) {
				System.out.print(ans[count1][count2]+"\t");
			}
			System.out.println(" ");
		}
	}
}
