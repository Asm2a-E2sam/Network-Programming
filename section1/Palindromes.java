package Tasks;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str ;
        System.out.print("Enter a String: ");
        str = input.nextLine();
        boolean flag =true;
        int size = str.length();

        for (int i = 0; i < size/2; i++) {
            if (str.charAt(i) != str.charAt(size-(i+1))) {
                flag = false;
            }
        }

        if (flag) {
            System.out.println(str + " is a Palindromes");
        }else {
            System.out.println(str + " is not a Palindromes");
        }
    }
}
