class Solution {
    public int equalPairs(int[][] grid) {
        Map<Integer, List<Integer>> rowMap= new HashMap<>();
        Map<Integer, List<Integer>> colMap= new HashMap<>(); 
        
        for(int i=0;i<grid.length;i++){
            List<Integer> rowVal = new ArrayList<>();
            List<Integer> colVal = new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                rowVal.add(grid[i][j]);
                colVal.add(grid[j][i]);  
            }
            rowMap.put(i,rowVal);
            colMap.put(i,colVal);
            // System.out.println(rowVal);
            // System.out.println(colVal);
        }
        int ct=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(rowMap.get(i).equals(colMap.get(j)))
                    ct++;
            }
        }
         return ct;
    }
    
}