public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    // Your code here!
    /**
    * A basic forloop that will take in an array of string and return it in a phone number format
    */
    String phoneNumber = "(";
    for(int i = 0; i < numbers.length; i++) {
    //Check the size and will add the symbols 
      if(phoneNumber.length() == 4) {
        phoneNumber = phoneNumber + ") ";
      } else if (phoneNumber.length() == 9) {
        phoneNumber = phoneNumber + "-";
      }
        phoneNumber = phoneNumber + numbers[i];
    }
    
    return phoneNumber;
  }
}
