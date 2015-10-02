
/**
 *Create an ASCII Art program that uses parameters, for loops and/or nested loops.
 * 
 * @author Emily Yamashita 
 * @version v1 10/01/2015
 */
public class HalloweenQuilt
{
    public static void main(String[] args)
    {
        int height = 6; //There are no height restrictions ;)
        int width = 6; /*WIDTH MUST BE EVEN!! If odd, it will print one less to make it even. 
        Width must also be greater than or equal to two. If width is one, it will print a width of two.*/
        printQuilt(height, width);
    }
    public static void printQuilt(int height, int width)
    {
        for (int i = 1; i <= height; i++) //This tells us how many lines, or blocks, vertically aka height
        {
            for (int j = 1; j <= (i + 2) % 2; j++) //Bats will be drawn first for odd lines (horizontal)
            {
                drawBatFirstLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++) //Witches and Bats will be drawn one less than half the width times
            {
                drawWitchFirstLine();
                drawBatFirstLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++) //If the line is odd, it will print out a witch
            {
                drawWitchFirstLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++) //If the line is even, it will print another witch and bat
            {
                drawWitchFirstLine();
                drawBatFirstLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++) //The series repeats the same for all the rest of the lines as for the first line
            {
                drawBatSecondLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchSecondLine();
                drawBatSecondLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchSecondLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchSecondLine();
                drawBatSecondLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatThirdLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchThirdLine();
                drawBatThirdLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchThirdLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchThirdLine();
                drawBatThirdLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatFourthLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchFourthLine();
                drawBatFourthLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchFourthLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchFourthLine();
                drawBatFourthLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatFifthLine();
            }
            for (int k = 1; k <= width/ 2 - 1; k++)
            {
                drawWitchFifthLine();
                drawBatFifthLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchFifthLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchFifthLine();
                drawBatFifthLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatSixthLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchSixthLine();
                drawBatSixthLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchSixthLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchSixthLine();
                drawBatSixthLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatSeventhLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchSeventhLine();
                drawBatSeventhLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchSeventhLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchSeventhLine();
                drawBatSeventhLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatEighthLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchEighthLine();
                drawBatEighthLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchEighthLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchEighthLine();
                drawBatEighthLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatNinthLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchNinthLine();
                drawBatNinthLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchNinthLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchNinthLine();
                drawBatNinthLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatTenthLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchTenthLine();
                drawBatTenthLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchTenthLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchTenthLine();
                drawBatTenthLine();
            }
            System.out.println();
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBatEleventhLine();
            }
            for (int k = 1; k <= width / 2 - 1; k++)
            {
                drawWitchEleventhLine();
                drawBatEleventhLine();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitchEleventhLine();
            }
            for (int k = 1; k <= (i + 1) % 2; k++)
            {
                drawWitchEleventhLine();
                drawBatEleventhLine();
            }
            System.out.println();
        }
    }
    public static void drawBatFirstLine() //Each line of the bat is separated into different methods
    {
        System.out.print("+------------------+");
    }
    public static void drawBatSecondLine()
    {
        System.out.print("|                  |");
    }
    public static void drawBatThirdLine()
    {
        System.out.print("|     |\\____/|     |");
    }
    public static void drawBatFourthLine()
    {
        System.out.print("|   /\\| o  o |/\\   |");
    }
    public static void drawBatFifthLine()
    {
        System.out.print("|  ///\\   ~  /\\\\\\  |");
    }
    public static void drawBatSixthLine()
    {
        System.out.print("| /////|    |\\\\\\\\\\ |");
    }
    public static void drawBatSeventhLine()
    {
        System.out.print("| |////|....|\\\\\\\\| |");
    }
    public static void drawBatEighthLine()
    {
        System.out.print("| |////|....|\\\\\\\\| |");
    }
    public static void drawBatNinthLine()
    {
        System.out.print("| \\/-\\/-\\../-\\/-\\/ |");
    }
    public static void drawBatTenthLine()
    {
        System.out.print("|                  |");
    }
    public static void drawBatEleventhLine()
    {
        System.out.print("+------------------+");
    }
    public static void drawWitchFirstLine() //Each line of the Witch is separated into different methods, like the bat
    {
        System.out.print("+------------------+");
    }
    public static void drawWitchSecondLine()
    {
        System.out.print("|        _/\\_      |");
    }
    public static void drawWitchThirdLine()
    {
        System.out.print("|        { \\\\      |");
    }
    public static void drawWitchFourthLine()
    {
        System.out.print("|        /  \\      |");
    }
    public static void drawWitchFifthLine()
    {
        System.out.print("|    ---\"\\   \\---< |");
    }
    public static void drawWitchSixthLine()
    {
        System.out.print("|    _/\\_   LL     |");
    }
    public static void drawWitchSeventhLine()
    {
        System.out.print("|    { \\\\          |");
    }
    public static void drawWitchEighthLine()
    {
        System.out.print("|    /  \\          |");
    }
    public static void drawWitchNinthLine()
    {
        System.out.print("|---\"\\   \\---<     |");
    }
    public static void drawWitchTenthLine()
    {
        System.out.print("|       LL         |");
    }
    public static void drawWitchEleventhLine()
    {
        System.out.print("+------------------+");
    }
}