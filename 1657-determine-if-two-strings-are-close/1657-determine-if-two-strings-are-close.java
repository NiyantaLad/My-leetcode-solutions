class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(char c : word1.toCharArray())
            arr1[c-'a']++;
       
        for(char c: word2.toCharArray())
            arr2[c-'a']++;
      
//         for(int i=0;i<word1.length();i++)
//             arr1[word1.charAt(i)-'a']++;
        
//         for(int i=0;i<word2.length();i++)
//             arr2[word2.charAt(i)-'a']++;
        
        for(int i=0;i<26;i++)
            if((arr1[i]==0 && arr2[i]!=0) || (arr1[i]!=0 && arr2[i]==0))
                return false;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0;i<26;i++)
            if(arr1[i]!=arr2[i])
                return false;
        
        return true;
    }
}
// class Solution {
//     public boolean closeStrings(String A, String B) {
//         if (A.length()!=B.length() ) return false;
       
//         if(A.equals(B)) return true;
        
//         Map<Character, Integer> map1 = new HashMap<>();
//         Map<Character, Integer> map2 = new HashMap<>();
//         for(char i: A.toCharArray()){
//             map1.put(i,map1.getOrDefault(i,0)+1);
//         }
        
//         for(char i: B.toCharArray()){
//             map2.put(i,map2.getOrDefault(i,0)+1);
//         }
        
//         if(!map1.keySet().equals(map2.keySet()))
//             return false;
        
//         ArrayList<Integer> list1= new ArrayList<>(map1.values());
//         ArrayList<Integer> list2= new ArrayList<>(map2.values());
        
//         Collections.sort(list1);
//         Collections.sort(list2);
        
//         return (list1.equals(list2));

//     }
// }