import java.util.InputMismatchException;
import java.util.Scanner;

public class ceasercipher {
    private static String message;
    private static int shift;

    //main driver of the program
    public static void main(String[] args) {
        getInputAndRunCaesar();
    }
    //accept input from the user, encrypt and decrypt if acceptable, terminate if unacceptable

    public static void getInputAndRunCaesar() {
        int shift = 0;
        String message;
        String encMessage;
        String origMessage;
        Scanner strReader = new Scanner(System.in);
        Scanner intReader = new Scanner(System.in);

        //get message to encode from user
        System.out.println("Please enter the text you wish to encrypt. No numeric values are permitted!");
        System.out.println("You may use upper or lower case, and acceptable punctuation marks are '.' ',' '!' and '?'.");
        System.out.print("Your message: ");
        message = strReader.nextLine();
        //ensure that input message contains no numeric values and is not empty
        if(message.matches(".*\\d.*")){
            System.out.println("Your input does not meet the criteria stated above.");
            System.exit(0);
        }else if(message.equals("")){
            System.out.println("You didn't enter anything.");
            System.exit(0);
        }
        //get cipher shift value from user and terminate if input is unacceptable
        System.out.println("Please enter an integer for the cipher shift.");
        System.out.println("Positive integers alphabetically shift right and negative integers alphabetically shift left.");
        System.out.print("Cipher shift: ");
        try{
            shift = intReader.nextInt();
        }catch(InputMismatchException e){
            System.out.println("The shift value must be an integer.");
            System.exit(0);
        }
        //run encryption on a timer and compute milliseconds
        long startTime1 = System.nanoTime();
        encMessage = encrypt(message,shift);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        double elapsedTime1 = (double) duration1 / 1000000.0;
        System.out.println("Encrypted message: " + encMessage);
        System.out.println("Encryption finished in: " + elapsedTime1 + " milliseconds.");

        //run decryption on a timer and compute milliseconds
        long startTime2 = System.nanoTime();
        origMessage = decrypt(encMessage,shift);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        double elapsedTime2 = (double) duration2 / 1000000.0;
        System.out.println("Original message: " + origMessage);
        System.out.println("Decryption finished in: " + elapsedTime2 + " milliseconds.");

    }
}
