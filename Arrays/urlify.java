import java.util.Scanner;
import java.lang.*;
class urlify{
	
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		System.out.println("Enter string with spaces to enter %20 in between them");
		String str = input.nextLine();
		insertAtSpaces(str);

	}

	static void insertAtSpaces(String str){
		String strTrimmed = str.trim();
		StringBuilder strCopy = new StringBuilder(strTrimmed );
		
		for(int i=0;i<strCopy.length();i++){

			if( strCopy.charAt(i) == ' ' ){
				int j=i+1;
				while(strCopy.charAt(j)== ' '){
					j++;
				}
				strCopy.replace(i,j,"%20");
			}
		}

		System.out.println("strCopy:  " + strCopy);
	}

}