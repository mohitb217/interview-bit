class zeroMatrix{
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				 matrix[i][j] = (int)(Math.random() * 100);
			}	
		}
		matrix[0][0] = 0;
		boolean row[] = new boolean[matrix.length];
		boolean col[] = new boolean[matrix.length];

		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					col[j]=true;
				}
			}	
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				if(row[i] || col[j]){
					matrix[i][j]=0;
				}
			}	
		}
		System.out.println();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

	}
}