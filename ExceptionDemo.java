 class ExceptionDemo {

    public static void main(String[] args) {
        // Example 1: NumberFormatException
        try {
            String invalidNumber = "abc";
            int number = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }

        // Example 2: NullPointerException
        try {
            String nullString = null;
            int length = nullString.length(); // This will throw NullPointerException
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}
