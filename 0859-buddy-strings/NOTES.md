"abcd"
"abcd"
"ab"
"ba"
"ab"
"ab"
"aa"
"aa"
"abcd"
"cbad"
"abcd"
"adcb"
​
​
// class Solution {
//     public boolean buddyStrings(String s, String goal) {
//         if (s.length() != goal.length()) {
//             return false;
//         }
//         if (s.equals(goal)) {
//             // If we have 2 same characters in string 's',
//             // we can swap them and still the strings will remain equal.
//             int[] frequency = new int[26];
//             for (char ch : s.toCharArray()) {
//                 frequency[ch - 'a'] += 1;
//                 if (frequency[ch - 'a'] == 2) {
//                     return true;
//                 }
//             }
//             // Otherwise, if we swap any two characters, it will make the strings unequal.
//             return false;
//         }
//         Map<Integer, Character> map= new HashMap<>();