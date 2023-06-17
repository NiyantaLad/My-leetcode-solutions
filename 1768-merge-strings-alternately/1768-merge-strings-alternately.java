class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                result.append(word1.charAt(i++));
            }
            if (j < n) {
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
    }
}
// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder sb = new StringBuilder();
//         int i=0,len;
//         if(word1.length()<word2.length())
//             len=word1.length();
//         else
//             len=word2.length();
//         while(i<len){
//             sb.append(word1.charAt(i));
//             sb.append(word2.charAt(i));
//             i++;
//         }
//         if(i!=word1.length()){            
//             while (i<word1.length()){
//                 sb.append(word1.charAt(i));
//                 i++;
//             }
//         }
//         else if(i!=word2.length()){            
//             while (i<word2.length()){
//                 sb.append(word2.charAt(i));
//                 i++;
//             }
//         }
//         return sb.toString();
//     }
// }