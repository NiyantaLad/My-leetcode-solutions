class Solution {
public int[] asteroidCollision(int[] asteroids) {
int max=0;
Stack<Integer> stack = new Stack<>();
for(int i=0; i<asteroids.length;i++){
if(!stack.isEmpty()){
if(asteroids[i]<0){
if(stack.peek()<0) {
stack.push(asteroids[i]);
}
else if(Math.abs(asteroids[i])!=stack.peek())
{
max=Math.max(Math.abs(asteroids[i]),stack.pop());
// while(stack.pop()>max )
if(max==Math.abs(asteroids[i]) && stack.peek()<0)
stack.push(asteroids[i]);
else if(max==Math.abs(asteroids[i]))
stack.push(Math.max(Math.abs(asteroids[i]),stack.pop()));
else
stack.push(max);
}
else
stack.pop();
}
else{
stack.push(asteroids[i]);
}
}
else{
stack.push(asteroids[i]);
}
}
System.out.println(stack);
int[] result = new int[stack.size()];
for(int i=result.length-1;i>=0;i--){
result[i]=stack.pop();
}
return result;
}
}
[5,10,-5]
[8,-8]
[10,2,-5]
[-10,-2,5]