import java.util.Scanner;

class uniqueChar{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.next();


		boolean unique = uniqueness(str);

		if(unique==true){
			System.out.print("It has unique elements");
		}
		else{
			System.out.print("It doesn't have unique elements");
		}

	}

	static boolean uniqueness(String str){
		boolean ascii[] = new boolean[256];
		for(int i=0;i<str.length();i++){
			int ch = str.charAt(i);
			if(ascii[ch]==true){
				return false; 
			}
			else{
				ascii[ch]=true;
			}
		}
		return true;
	}
}