 class Solution {
     public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            Set<Character> s = new HashSet<Character>();
            for (char c : A.toCharArray())
                s.add(c);
            return s.size() < A.length();
        }
        List<Integer> dif = new ArrayList<>();
        for (int i = 0; i < A.length(); ++i) 
            if (A.charAt(i) != B.charAt(i)) 
                dif.add(i);
        return dif.size() == 2 && A.charAt(dif.get(0)) == B.charAt(dif.get(1)) && A.charAt(dif.get(1)) == B.charAt(dif.get(0));
    }
 }

// class Solution {
//     public boolean buddyStrings(String s, String goal) {
        
//         if (s.length() != goal.length()) {
//             return false;
//         }
//         if (s.equals(goal)) {
//             // If we have 2 same characters in string 's',
//             // we can swap them and still the strings will remain equal.
//             int[] frequency = new int[26];
//             for (char ch : s.toCharArray()) {
//                 frequency[ch - 'a'] += 1;
//                 if (frequency[ch - 'a'] == 2) {
//                     return true;
//                 }
//             }
//             // Otherwise, if we swap any two characters, it will make the strings unequal.
//             return false;
//         }
//         Map<Integer, Character> map= new HashMap<>();
//         char swapped='\0';
//         int ct=0;
        
//         for(int i=0;i<s.length();i++){
//             map.put(i,s.charAt(i));
//         }
//         for(int j=0;j<goal.length();j++){
//             if (swapped==map.get(j) ){
//                 // System.out.println("in first loop");
//                 ct--;
//             }
                
//             if(map.get(j)!=goal.charAt(j))
//             {
//                 ct++;
//                 swapped= goal.charAt(j);
//                 System.out.println(swapped);
//                 // System.out.println("in second loop");
//             }
            
//         }
//         if(ct==0)
//             return true;
        
//         return false;
//     }
// }

