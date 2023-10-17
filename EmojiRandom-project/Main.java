import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int blankWidth;
        int blankLength;
        int ranEmoji;
        
        Scanner scnr = new Scanner(System.in);

        System.out.println("Width of the blanket?");
        if (scnr.hasNextInt()) {
            blankWidth = scnr.nextInt();
        } 
        else {
            System.out.print("You did not input an integer.");
            return;
        }

        System.out.println("Length of the blanket?");
        if (scnr.hasNextInt()) {
            blankLength = scnr.nextInt();
        } 
        else {
            System.out.print("You did not input an integer.");
            return;
        }

        if(blankWidth > 0 && blankLength > 0 && blankWidth <= 40 && blankLength <= 40) {
            if (blankWidth == blankLength) {
                if (blankWidth == 40) {
                    System.out.println("Invalid Input. Valid blanket sizes are 1 to 50 for length and width");
                }
                else {
                    for(int w = 0; w <= blankWidth; w++){
                        for(int l = 0; l <= blankLength; l++){
                            ranEmoji = (int) EmojiRandom.emojiRandom();
                            Character.toChars(ranEmoji);
                        }
                    }
                }
            }
            else {
                for(int w = 0; w <= blankWidth; w++) {
                    for(int l = 0; l <= blankLength; l++){
                        ranEmoji = (int) EmojiRandom.emojiRandom();
                        Character.toChars(ranEmoji);
                    }
                }        
            }
        }    
        else {
            System.out.println("Invalid Input. Valid blanket sizes are 1 to 50 for length and width");
        }
        scnr.close(); 
    }
}