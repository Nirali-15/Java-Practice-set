package Array.TwoD_Arrays;

import java.util.*;public List<Integer>spiralOrder(int[][]matrix){List<Integer>result=new ArrayList<>();int nrow=matrix.length;int ncol=matrix[0].lenght;

int top=0,bot=nrow-1;int left=0,right=ncol-1;

while(left<=right&&top<=bot){ // left to right
for(int itr=left;itr<=right;itr++){result.add(matrix[top][itr]);}top++;
// top to bottom
for(int itr=top;itr<=bot;itr++){result.add(matrix[itr][right]);}right--;
// right to left
if(top<=bot){for(int itr=right;itr>=left;itr--){result.add(matrix[bot][itr]);}bot--;}
// bottom to top
if(left<=right){for(int itr=bot;itr>=top;itr--){result.add(matrix[itr][left]);}left++;}}return result;}