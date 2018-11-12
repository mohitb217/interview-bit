import java.util.Scanner;

class oneAway{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = input.nextLine();

        System.out.println("Enter a string: ");
        String str2 = input.nextLine();

        int editCount  = 0;
        int str1Length = str1.length();
        int str2Length = str2.length();

        if( Math.abs(str1Length - str2Length)>1 ){
            System.out.println("Not oneAway");
            System.exit(0);
        }
        else{
            int i=0,j=0;
            while(i<str1Length && j< str2Length){

                if(str1.charAt(i) != str2.charAt(j) ){

                    if(editCount==1){
                        System.out.println("Not oneAway");
                        System.exit(0);                     
                    }

                    if(str1Length>str2Length){
                        i++;
                    }
                    
                    else if(str2Length>str1Length){
                        j++;
                    }
                    else{
                        i++;
                        j++;
                    }

                    editCount++;
                }
                else{
                    i++;
                    j++;
                }
            }

                if(i<str1Length || j< str2Length){
                    editCount++;
                }

                if(editCount<=1){
                    System.out.println("oneAway");
                }

        }

    }
}