import java.util.Scanner;


class stringCompression{
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        int i=1;
        int count = 1;
        StringBuilder strCopy = new StringBuilder( "" );
        int strLength = str.length();
        int j=0;
        while(i<strLength){
        	
        	j=i;
        	if( str.charAt(i-1)==str.charAt(i) ){
        		i++;
        		count++;
        		if(i==strLength){
        			strCopy.append(str.charAt(i-1));
        			strCopy.append(Integer.toString(count));
        			i++;
        		}
        	}
        	else{
    			strCopy.append(str.charAt(j-1));
    			strCopy.append(Integer.toString(count));
    			i++;
    			count=1;
        	}
        }

        System.out.println("str:" + strCopy);
    }
}