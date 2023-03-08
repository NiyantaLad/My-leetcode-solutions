class Solution {
    public boolean isPalindrome(String s) {
        // String temp = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		// String reverse= new StringBuffer(temp).reverse().toString();
		// return temp.equals(reverse);

        // s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        // int i = 0;
        // int j = s.length() - 1;
        // while(i <= j) {
        //     if (s.charAt(i) != s.charAt(j)) {
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;


		int i=0;
		int j=s.length()-1;
		
		while(i<=j) {
			if (!Character.isLetterOrDigit(s.charAt(i))){
				i++;
				continue;
			}
			
			if (!Character.isLetterOrDigit(s.charAt(j))){
				j--;
				continue;
			}
			
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			
			i++;
			j--;
			
		}
		return true;

    }
}