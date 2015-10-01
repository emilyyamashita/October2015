
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
        int height = 4;
        int width = 1; 
        printQuilt(height, width);
    }
    public static void printQuilt(int height, int width)
    {
        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawBat();
            }
            for (int k = 1; k <= width / 2; k++)
            {
                drawWitch();
                drawBat();
            }
            for (int j = 1; j <= (i + 2) % 2; j++)
            {
                drawWitch();
            }
        }
    }
    public static void drawBat()
    {
        System.out.println("+------------------+");
        System.out.println("|                  |");
        System.out.println("|     |\\____/|     |");
        System.out.println("|   /\\| o  o |/\\   |");
        System.out.println("|  ///\\   ~  /\\\\\\  |");
        System.out.println("| /////|    |\\\\\\\\\\ |");
        System.out.println("| |////|....|\\\\\\\\| |");
        System.out.println("| |////|....|\\\\\\\\| |");
        System.out.println("| \\/-\\/-\\../-\\/-\\/ |");
        System.out.println("|                  |");
        System.out.println("+------------------+");
    }
    public static void drawWitch()
    {
        System.out.println("+------------------+");
        System.out.println("|        _/\\_      |");
        System.out.println("|        { \\\\      |");
        System.out.println("|        /  \\      |");
        System.out.println("|    ---\"\\   \\---< |");
        System.out.println("|    _/\\_   LL     |");
        System.out.println("|    { \\\\          |");
        System.out.println("|    /  \\          |");
        System.out.println("|---\"\\   \\---<     |");
        System.out.println("|       LL         |");
        System.out.println("+------------------|");
    }
}