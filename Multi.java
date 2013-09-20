public class Multi {
	public static void main(String[] args) {
		int[][] a = {	{1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15} };

		int[] b = {1, 2, 3, 4, 5, 6};
		 print(a);				
		 sumRow(a,2);
		 sumCol(a,0);
		 sumTotal(a);
		 reverseRow(a, 1);
		 snakeDraft(10, 3);
		rectangularize(b, 3, 2);
	}

	public static void print(int[][] a){
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}
	 public static void sumRow(int[][] a, int y){
	 	int sumRow = 0;
	 	for (int r=0; r<a[y].length; r++) {
	 		sumRow = sumRow + a[y][r];
			
	 	}
	 	System.out.println(sumRow + "");
	 }
	 public static void sumCol(int[][] a, int y) {
	 	int sumCol = 0;
	 	for (int r=0; r<a.length; r++) {
	 		sumCol = sumCol + a[r][y];
				
	 	}
	 	System.out.println(sumCol + " ");
		
	 }
	 public static void sumTotal(int[][] a){
	 	int sumTot = 0;
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				sumTot = sumTot + a[r][c];
			}
	 	}
	 	System.out.println(sumTot + " ");
	 }
	 public static void reverseRow(int[][] a, int x){
	 	for (int r=a.length + 1; r>=0; r--) {
	 		System.out.println(a[x][r] + " ");
		}
		
	 }
	public static snakeDraft(int players, int rounds){
		int[][] b = [players][rounds];
		for (int r=0; r<= players; r++) {
			int players = r[];
			for (int c=0; r<; s) {
				
			}
		}
	}
	public static void rectangularize(int[] b, int rows, int cols){
		for (int r=0; r<b.length && r<=rows; r++) {
			for (int c=0; c<b.length && c<=cols; c++) {
				System.out.print(b[r][c] + " ");
			}
		}
	}

}
