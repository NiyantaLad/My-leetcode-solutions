Map<Integer, String> rowMap= new HashMap<>();
Map<Integer, String> colMap= new HashMap<>();
for(int i=0;i<grid.length;i++){
String rowVal="";
String colVal="";
for(int j=0;j<grid.length;j++){
rowVal+=Integer.toString(grid[i][j]);
colVal+=Integer.toString(grid[j][i]);
}
rowMap.put(i,rowVal);
colMap.put(i,colVal);
System.out.println(rowVal);
System.out.println(colVal);
}
int ct=0;
for(int i=0;i<grid.length;i++){
for(int j=0;j<grid.length;j++){
if(rowMap.get(i).equals(colMap.get(j)))
ct++;
}
}
return ct;