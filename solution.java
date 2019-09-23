class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean possibleSolution = true;  
        int unpaired = A[0];
         
        if(A.length ==0){
            return 0;
        }
        
        if (A.length == 1){
            return unpaired;
        }
        
        for(int i = 0; i < A.length; i++) {
            
          possibleSolution = true;
          
          for(int j = 0; j < A.length; j++) 
                if(A[i] == A[j] && i != j){ 
                    possibleSolution = false; //we can't the find unpaired element
                    break; //exit, and try to compare with A[j+1]
          }
            
          if(possibleSolution) {
                unpaired = A[i]; 
          }
          
        }
        
        return unpaired;
    }
}
