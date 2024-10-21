import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        int decimal = binaryToDecimal(binaryString);

        System.out.println("Decimal equivalent: " + decimal);
        scanner.close();
    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digitChar = binaryString.charAt(i);

            if (digitChar != '0' && digitChar != '1') {
                throw new IllegalArgumentException("Invalid binary string: " + binaryString);
            }

            int digit = digitChar - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}
