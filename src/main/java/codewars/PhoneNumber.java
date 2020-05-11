package codewars;

/******   Checking that phone number fit to the pattern (123) 456-7890 ******/

public class PhoneNumber {

    public static void main(String[] args) {


        System.out.println(validPhoneNumber("(123) 456-7890"));
    }





    public static Boolean validPhoneNumber(String phoneNumber){

        return phoneNumber.matches("\\([0-9][0-9][0-9]\\) [0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]");

    }
}
