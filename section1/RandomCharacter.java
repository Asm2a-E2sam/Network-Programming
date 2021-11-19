package Tasks;

public class RandomCharacter {

    public static char getRandomChar(char startChar, char endChar) {
        return (char) (startChar + Math.random() * (endChar - startChar  + 1));
    }

    public static char getRandomLowerChar() {
        return getRandomChar('a', 'z');
    }

    public static char getRandomUpperChar() {
        return getRandomChar('A', 'Z');
    }

    public static char getRandomDigitChar() {
        return getRandomChar('0', '9');
    }

    public static char getRandomChar() {
        return getRandomChar('\u0000', '\uFFFF');
    }
}

class Main {
    public static void main(String args[]) {
        final int NUM_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;
        for (int i = 0; i<NUM_OF_CHARS; i++){
            char ch = RandomCharacter.getRandomLowerChar();
            if((i+1)%CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
        int [] x = new int[10];
    }
}