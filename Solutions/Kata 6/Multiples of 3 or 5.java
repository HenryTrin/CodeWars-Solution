public class Solution {

  public int solution(int number) {
    //TODO: Code stuff here
    int returnSum = 0;
    //For loop that will run through the number
    for(int i = 0; i < number; i++) {
      if( (i % 3 == 0) || (i % 5 == 0)) {
        returnSum = returnSum + i;
      }
    }
    return returnSum;
  }
    
}
