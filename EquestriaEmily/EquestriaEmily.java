
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
        String baltimareName = "Baltimare";
        String manehattanName = "Manehattan";
        String losPegasusName = "Los Pegasus";
        String neighagraFallsName = "Neighagra Falls";
        String badlandsName = "Badlands";
        String ponyvilleName = "Ponyville";
        int baltimareX = 30;
        int baltimareY = 13;
        int manehattanX = 33;
        int manehattanY = 7;
        int losPegasusX = 7;
        int losPegasusY = 18;
        int neighagraFallsX = 24;
        int neighagraFallsY = 7;
        int badlandsX = 28;
        int badlandsY = 22;
        int ponyvilleX = 16;
        int ponyvilleY = 13;
        exercise1(baltimareName, manehattanName, baltimareX, baltimareY, manehattanX, manehattanY);
        exercise1(losPegasusName, neighagraFallsName, losPegasusX, losPegasusY, neighagraFallsX, neighagraFallsY);
        exercise1(badlandsName, ponyvilleName, badlandsX, badlandsY, ponyvilleX, ponyvilleY);
        exercise2(1, 1, 2, 2); //REPLACE VARIABLES WITH COORDINATES OF ENDPOINTS OF DIAMETER
    }

    public static double distance(int x1, int y1, int x2, int y2)
    {
        double distance;
        distance = (Math.sqrt((Math.pow((x2-x1),2) + (Math.pow((y2-y1),2))))) * 100;
        int distance2 = (int)(distance);
        distance = (double) (distance2) / 100;
        return distance;
    }

    public static void exercise1(String location1, String location2, int x1, int y1, int x2, int y2)
    {
        double distance = distance(x1, y1, x2, y2);
        System.out.println("The distance from " + location1 + " to " + location2 + " = " + distance);
    }
    
    public static void exercise2(int x1, int y1, int x2, int y2)
    {
        double distance = distance(x1, y1, x2, y2);
        double c = distance * Math.PI * 100;
        int c2 = (int) c;
        c = (double) (c2) / 100;
        System.out.println("The length of the trip will be " + c);
    }
        
        
}