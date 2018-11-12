class stringRotation{
	public static void main(String[] args) {
		String str = "waterbottle";
		String rotatedStr = "bottle";
		boolean result = isSubString(rotatedStr,str);
		System.out.println("result:   " + result);
	}

	static boolean isSubString(String s1,String s2){
		StringBuilder doubleS1 = new StringBuilder(s1);
		doubleS1.append(s1);
		int j=0;

		for(int i=0;i<doubleS1.length();i++){
			
			if( s2.charAt(j)==doubleS1.charAt(i) ){
				if( j==s2.length()-1){
					return true;
				}
				else{
					j++;
				}
			}
			else{
				j=0;
			}

		}
		return false;
	}
}