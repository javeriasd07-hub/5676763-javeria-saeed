public class BinaryConverter {

    public static int[] toBinary(int number) {
        // Handle special case for 0
        if (number == 0) {
            return new int[]{0};
        }

        int temp = number;
        int count = 0;

        // First, count number of binary digits
        while (temp > 0) {
            temp = temp / 2;
            count++;
        }

        // Create array of required size
        int[] binaryArray = new int[count];

        // Fill array with binary digits (from end to start)
        int index = count - 1;
        while (number > 0) {
            binaryArray[index] = number % 2;
            number = number / 2;
            index--;
        }

        return binaryArray;
    }

    // Example usage
    public static void main(String[] args) {
        int num = 13;
        int[] result = toBinary(num);

        System.out.print("Binary representation: ");
        for (int bit : result) {
            System.out.print(bit);
        }
    }
}