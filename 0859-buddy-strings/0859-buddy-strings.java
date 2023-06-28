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
         
        int idx1 = -1;
        int idx2 = -1;

        for (int i = 0; i < A.length(); ++i) {
            if (A.charAt(i) != B.charAt(i)) {
                if (idx1 == -1) {
                    idx1 = i;
                } else if (idx2 == -1) {
                    idx2 = i;
                } else {
                    return false;
                }
            }
        }

        if (idx2 == -1) {
            return false;
        }

        return A.charAt(idx1) == B.charAt(idx2) && 
               A.charAt(idx2) == B.charAt(idx1);

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