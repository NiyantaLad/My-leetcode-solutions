class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch:s.toCharArray()){
            if(ch!='*')
                stack.push(ch);
            else{
                stack.pop();
            }
        }
        
        String output="";
        Iterator <Character> it = stack.iterator();
        while(it.hasNext())
            output+= it.next().toString();
        return output;
    }
}