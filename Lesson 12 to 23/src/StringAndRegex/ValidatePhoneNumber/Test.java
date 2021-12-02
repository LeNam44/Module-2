package StringAndRegex.ValidatePhoneNumber;

import StringAndRegex.ValidateEmail.EmailExample;

public class Test {
    private static PhoneNumber phoneNumber;

    private static final String[] validNumber = new String[] {"(84)-(0978489648)", "(12)-(0231361256)"};
    private static final String[] invalidNumber = new String[] {"(a8)-(22222222)", "(ab)-(0978489648)"};

    public static void main(String args[]) {
        phoneNumber = new PhoneNumber();
        for (String number : validNumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Email is " + number +" is valid: "+ isvalid);
        }
        for (String number : invalidNumber) {
            boolean isvalid = phoneNumber.validate(number);
            System.out.println("Email is " + number +" is valid: "+ isvalid);
        }
    }
}
