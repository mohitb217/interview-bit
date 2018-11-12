class rotateMatrix{
	
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				 matrix[i][j] = (int)(Math.random() * 100);
			}	
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix.length;j++){
				System.out.print(matrix[i][j] +"  " );
			}	
			System.out.println();
		}

		int [][] rotatedMatrix = new int[matrix.length][matrix.length];
		int j=0;
		int k=matrix.length-1;

		for(int i=0;i<matrix.length;i++){
			while(j<matrix.length){
				rotatedMatrix[j][k] = matrix[i][j];
				j++;
			}
			k--;
			j=0;
		}
		System.out.println();
		for(int i=0;i<matrix.length;i++){
			for(int x=0;x<matrix.length;x++){
				 System.out.print(rotatedMatrix[i][x] + "  ");
			}
			System.out.println();	
		}
	}

}