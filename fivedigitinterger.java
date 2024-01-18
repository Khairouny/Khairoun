import java.util.Scanner;

/**
 * Write a description of class fivedigitinterger here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (QUESTION 2 (II))
 */
public class fivedigitinterger
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
        }
    private static boolean isPalindrome(int num) {
        String strNum = Integer.toString(num);
        int length = strNum.length();
        for (int i = 0; i < length / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(length - 1 - i)) {
                return false;
            }
        }
        return false;   
    } 
}
