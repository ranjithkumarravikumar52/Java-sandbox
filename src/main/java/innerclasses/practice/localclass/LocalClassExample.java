package innerclasses.practice.localclass;

public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(
            String phoneNumber1, String phoneNumber2) {

        final int numberLength = 10;
        int exampleInt;

        class PhoneNumber {

            String formattedPhoneNumber = null;

            //inner class cannot have static declarations
//            static final int intExample;

            PhoneNumber(String phoneNumber) {

                //local class can access outer class member variable regularExpression
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");

                //a local class can access local variables which are final only - numberLength
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;

                //accessing local variable which is not final
                //exampleInt = 11; //compile error
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            //local class can access it's enclosing method's parameters without any issues
            //The method printOriginalNumbers accesses the parameters phoneNumber1 and phoneNumber2 of the method validatePhoneNumber.
            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + phoneNumber1 +
                        " and " + phoneNumber2);
            }

        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);


        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
