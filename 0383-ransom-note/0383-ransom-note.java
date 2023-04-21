class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> result = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            result.put(c,result.getOrDefault(c,0)+1);
        }
        for(char c : magazine.toCharArray()){
            if(result.containsKey(c)){
                result.put(c,result.getOrDefault(c,0)-1);
            }
        }
        for(int val : result.values()){
            if(val > 0){
                return false;
            }
        }
        return true;
    }
}
// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
// 		if (ransomNote.length() > magazine.length()) return false;
//         int[] alphabets_counter = new int[26];
        
//         for (char c : magazine.toCharArray())
//             alphabets_counter[c-'a']++;

//         for (char c : ransomNote.toCharArray()){
//             if (alphabets_counter[c-'a'] == 0) return false;
//             alphabets_counter[c-'a']--;
//         }
//         return true;
//     }
// }

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         if (ransomNote.length() > magazine.length()) return false;
//         Map <Character, Integer> map = new HashMap<>();

//         for (int i=0; i<magazine.length();i++){
//             map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
//         }
        
//         for (int j=0; j<ransomNote.length();j++){ 
//             if (!map.containsKey(ransomNote.charAt(j)))
//                 return false;
//             else{
//                 if (map.get(ransomNote.charAt(j))==0)
//                     return false;
//                 else
//                     map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);                      
//             }              
//         }
//         return true;
//     }
// }


