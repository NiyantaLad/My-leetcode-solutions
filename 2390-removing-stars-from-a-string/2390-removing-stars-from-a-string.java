class Solution {
    public String removeStars(String s) {
        int j = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                answer.deleteCharAt(answer.length() - 1);
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}
// class Solution {
//     public String removeStars(String s) {
//         Stack<Character> stack = new Stack<>();
//         for (char ch:s.toCharArray()){
//             if(ch!='*')
//                 stack.push(ch);
//             else{
//                 stack.pop();
//             }
//         }
        
//         String output="";
//         StringBuilder sb = new StringBuilder();
//         while(!stack.isEmpty()){
//             sb.append(stack.pop());
//         }
//         return sb.reverse().toString();
//     }
// }