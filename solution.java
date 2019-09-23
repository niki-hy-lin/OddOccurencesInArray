class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        //initialization
        boolean result = false;  
        int unpaired = A[0];
        
        
        //special case 
        if(A.length ==0){
            return 0;
        }
        
        //special case
        if (A.length == 1){
            return unpaired;
        }
        
        //our regular case
        for(int i = 0; i < A.length; i++) {
          
          result= true;//set this to true again in case it was set to false in last round.
          for(int j = 0; j < A.length; j++) 
                if(A[i] == A[j] && i != j){ //matching two elements
                    result = false; //this means we can't the find unpaired element
                    break; //exit loops
          }  
          if(result == true) {//this means we can't find matching elements, so wo the possibleSolution is true.
                unpaired = A[i]; //we update the first element as the unpaired element.
          }
          
        }
        
        return unpaired;
    }
}
