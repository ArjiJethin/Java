//*The below HW1 is Submitted by SAI ROHITH MANGAIAHGARI RADHAKRISHNAGARI Student ID - 20028712 *//

import java.util.*;

public class BinaryNumber {
    private int[] data;
    private boolean overflow;

    public BinaryNumber(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("The length must be a positive integer.");
        }
        data = new int[length];
        overflow = false;
    }

    public BinaryNumber(String binaryString) {
        int length = binaryString.length();
        data = new int[length];
        for (int i = 0; i < length; i++) {
            char digitChar = binaryString.charAt(i);
            int digitValue = Character.getNumericValue(digitChar);
            if (digitValue != 0 && digitValue != 1) {
                throw new IllegalArgumentException("Invalid binary digit: " + digitChar);
            }
            data[i] = digitValue;
        }
        overflow = false;
    }

    public int getLength() {
        return data.length;
    }

    public int getDigit(int index) {
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }
        return data[index];
    }

    public int toDecimal() {
        int decimal = 0;
        int power = 0;
        for (int i = data.length - 1; i >= 0; i--) {
            decimal += (int) (data[i] * Math.pow(2, power));
            power++;
        }
        return decimal;
    }

    public void shiftRight(int amount) {
        if (amount <= 0) {
            return;
        }
        int[] newData = new int[data.length + amount];
        Arrays.fill(newData, 0);
        System.arraycopy(data, 0, newData, amount, data.length);
        data = newData;
    }

    public void add(BinaryNumber anotherBinaryNumber) {
        if (anotherBinaryNumber.getLength() != data.length) {
            throw new IllegalArgumentException("Binary numbers must have the same length for addition.");
        }

        int carry = 0;
        StringBuilder result = new StringBuilder();

        for (int i = data.length - 1; i >= 0; i--) {
            int sum = data[i] + anotherBinaryNumber.getDigit(i) + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry == 1) {
            overflow = true;
            result.insert(0, 1);
        }

        int[] newData = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            newData[i] = Character.getNumericValue(result.charAt(i));
        }
        data = newData;
    }

    public String toString() {
        if (overflow) {
            return "Overflow";
        }
        StringBuilder binaryString = new StringBuilder();
        for (int digit : data) {
            binaryString.append(digit);
        }
        return binaryString.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryNumber binary1 = new BinaryNumber("1011");
        BinaryNumber binary2 = new BinaryNumber(4);
        String temp = sc.next();
        sc.close();
        BinaryNumber binary3 = new BinaryNumber(temp);

        System.out.println("Binary 1: " + binary1);
        System.out.println("Binary 2: " + binary2);
        System.out.println("Binary 3: " + binary3);

        // Binary 1
        System.out.println();
        System.out.println("Length of binary number is: " + binary1.getLength());
        System.out.println("Digit at Index 3 is: " + binary1.getDigit(3));

        binary2.add(binary1);
        System.out.println("String representation: " + binary1);
        System.out.println("Decimal representation: " + binary1.toDecimal());

        binary1.shiftRight(3);
        System.out.println("Result after shifting right by 3: " + binary1);

        // Binary 3
        System.out.println();
        System.out.println("Length of binary number is: " + binary3.getLength());
        System.out.println("Digit at Index 3 is: " + binary3.getDigit(3));

        binary3.add(binary1);
        System.out.println("String representation: " + binary3);
        System.out.println("Decimal representation: " + binary3.toDecimal());

        binary1.shiftRight(3);
        System.out.println("Result after shifting right by 3: " + binary3);

    }
}