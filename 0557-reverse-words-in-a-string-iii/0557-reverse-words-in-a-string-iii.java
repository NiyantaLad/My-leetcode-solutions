//7ms
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans= new StringBuilder();
        for (String w: words){
            int i=0, j = w.length()-1;
            char[] word = w.toCharArray();
            char temp;
            while(i<j){
                temp=word[i];
                word[i]=word[j];
                word[j]=temp;
                i++;
                j--;  
            }
            ans.append(word);
            ans.append(" ");            
        }

        // ans.setLength(ans.length() - 1);
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}

//4ms
// class Solution {

//     public String reverseWords(String s) {
//         int lastSpaceIndex = -1;
//         char[] chArray = s.toCharArray();
//         int len = s.length();
//         for (int strIndex = 0; strIndex <= len; strIndex++) {
//             if (strIndex == len || chArray[strIndex] == ' ') {
//                 int startIndex = lastSpaceIndex + 1;
//                 int endIndex = strIndex - 1;
//                 while (startIndex < endIndex) {
//                     char temp = chArray[startIndex];
//                     chArray[startIndex] = chArray[endIndex];
//                     chArray[endIndex] = temp;
//                     startIndex++;
//                     endIndex--;
//                 }
//                 lastSpaceIndex = strIndex;
//             }
//         }
//         return new String(chArray);
//     }

// }