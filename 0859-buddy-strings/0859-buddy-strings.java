 class Solution {
     public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) 
            return false;
        if (A.equals(B)) {
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < A.length(); i++) {
                if (set.contains(A.charAt(i)))
                    return true;
                else set.add(A.charAt(i));
            }
            return false;
        }
         
         int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < A.length(); ++i) {
            if (A.charAt(i) != B.charAt(i)) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (secondIndex == -1) {
                    secondIndex = i;
                } else {
                    return false;
                }
            }
        }

        if (secondIndex == -1) {
            return false;
        }

        return A.charAt(firstIndex) == B.charAt(secondIndex) && 
               A.charAt(secondIndex) == B.charAt(firstIndex);
     
         


        // List<Integer> dif = new ArrayList<>();
        // for (int i = 0; i < A.length(); ++i) {
        //     if (A.charAt(i) != B.charAt(i)) 
        //         dif.add(i);
        // }
        //     if (A.charAt(i) != B.charAt(i)) 
        //         dif.add(i);
        // return dif.size() == 2 
        //     && A.charAt(dif.get(0)) == B.charAt(dif.get(1)) 
        //     && A.charAt(dif.get(1)) == B.charAt(dif.get(0));
    }
 }