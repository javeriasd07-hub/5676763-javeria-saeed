public class BinaryConverter {

    public static String toBinary(int number) {
        // Handle special case
        if (number == 0) {
            return "0";
        }

        String binary = "";

        while (number > 0) {
            int bit = number % 2;
            binary = bit + binary; // prepend bit to string
            number = number / 2;
        }

        return binary;
    }

    // Example usage
    public static void main(String[] args) {
        int num = 13;
        String result = toBinary(num);

        System.out.println("Binary representation: " + result);
    }
}
