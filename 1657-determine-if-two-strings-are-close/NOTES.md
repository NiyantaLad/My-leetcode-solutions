for(int i=0;i<A.length();i++){
map1.put(A.charAt(i), map1.getOrDefault(A.charAt(i),0)+1);
}
for(int i=0;i<B.length();i++){
map2.put(B.charAt(i), map2.getOrDefault(B.charAt(i),0)+1);
}