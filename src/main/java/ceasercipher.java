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
}
