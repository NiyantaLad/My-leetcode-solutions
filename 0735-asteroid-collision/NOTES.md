}
// If both asteroids have the same size, then both asteroids will explode.
// Pop the asteroid from the stack; also, we won't push the current asteroid to the stack.
else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
stack.pop();
}
​
// If we reach here, the current asteroid will be destroyed
// Hence, we should not add it to the stack
flag = false;
break;
}
​
if (flag) {
stack.push(asteroid);
}
}
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