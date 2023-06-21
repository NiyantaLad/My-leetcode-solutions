class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.split(" ");
        
        int i=0;
        int j= strArr.length-1;
        String temp ="";
        while(i<j){
            if(strArr[i]!=" " && strArr[j]!=" "){
                temp = strArr[i];
                strArr[i]=strArr[j];
                strArr[j]=temp;
                i++;
                j--;
            }
            else if(strArr[i]==" ")
                i++;
            else if(strArr[j]==" ")
                j--;            
        }
        StringBuilder result = new StringBuilder();
        for(int k=0; k<strArr.length;k++){
            result.append(strArr[k]);
            result.append(" ");
        }
        return result.toString().trim().replaceAll(" +", " ");
    }
}