
/**
 * Returning Values- computing distances and angles between locations in Equestria
 * 
 * @author Emily
 * @version v1 10/13/15
 */
public class EquestriaEmily
{

    public static void main(String[] args)
    {
        String BaltimareName = "Baltimare";
        String ManehattanName = "Manehattan";
        String LosPegasusName = "Los Pegasus";
        String NeighagraFallsName = "Neighagra Falls";
        String BadlandsName = "Badlands";
        String PonyvilleName = "Ponyville";
        int baltimareX = 30;
        int baltimareY = 13;
        int manehattanX = 33;
        int manehattanY = 7;
        int x3;
        int y3;
        exercise1(BaltimareName, ManehattanName, baltimareX, baltimareY, manehattanX, manehattanY);
    }

    public static double distance(int x1, int y1, int x2, int y2)
    {
        double distance;
        distance = Math.sqrt((Math.pow((x2-x1),2) + (Math.pow((y2-y1),2))));
        return distance;
    }

    public static void exercise1(String location1, String location2, int x1, int y1, int x2, int y2)
    {
        double distance = distance(x1, y1, x2, y2);
        System.out.println("The distance from " + location1 + " to " + location2 + " = " + distance);
    }
}