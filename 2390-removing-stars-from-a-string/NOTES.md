String output="";
Iterator <Character> it = stack.iterator();
while(it.hasNext())
output+= it.next().toString();
return output;