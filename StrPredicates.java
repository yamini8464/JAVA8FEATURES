package features;

class StrPredicates {
	public static boolean isPalindrome(String st){
		int n = st.length();
		int j = n-1;
		for (int i=0; i<n/2; i++) {
			if(st.charAt(i) != st.charAt(j)) {
				return false;
			}
			j--;
		}
		return true;
	}

}
