import java.util.Scanner;
import java.util.Arrays;
class palindromePermutation{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str1 = input.nextLine();

		System.out.println("Enter a string: ");
		String str2 = input.nextLine();


		int unique1[] = uniqueness(str1);
		int unique2[] = uniqueness(str2);
		if(Arrays.equals(unique1,unique2)){
			System.out.print("Same");
		}
		else{
			System.out.println("Not same");
		}

	}

	static int[] uniqueness(String str){
		int ascii[] = new int[256];
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' ')
				ascii[ (int)str.charAt(i)]++;
		}
		return ascii;
	}
}