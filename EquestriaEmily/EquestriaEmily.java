
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
        /*The following variables are all for exercise1*/
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
        exercise2(1, 1, 2, 2); 
        /*REPLACE VARIABLES WITH COORDINATES OF ENDPOINTS OF DIAMETER IN FORMAT AS FOLLOWS
        (X1, Y1, X2, Y2)
        X1 and X2 values can be interchanged, as can the y-values, meaning that the y-coordinate of X1 does not 
        necessarily have to be Y1 because the equation is squared, but it makes more sense to do so*/
        exercise3(baltimareName, manehattanName, losPegasusName, 30, 13, 33, 7, 7, 18);
        exercise4(1, 2, 3, 4, 5, 6);
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

    public static void exercise3(String location1, String location2, String location3, int x1, int y1,
    int x2, int y2, int x3, int y3)
    {
        double x = distance(x1, y1, x2, y2);
        System.out.println("The distance from " + location1 + (" to ") + location2 + (" is ") + x);
        double y = distance(x1, y1, x3, y3);
        System.out.println("The distance from " + location1 + (" to ") + location3 + (" is ") + y);
        double z = distance(x2, y2, x3, y3);
        System.out.println("The distance from " + location2 + (" to ") + location3 + (" is ") + z);
        double angleX = angle(x, y, z);
        System.out.println("The angle formed at " + location3 + " is " + angleX);
        double angleY = angle(y, x, z);
        System.out.println("The angle formed at " + location2 + " is " + angleY);
        double angleZ = angle(z, x, y);
        System.out.println("The angle formed at " + location1 + " is " + angleZ);

    }

    public static void angle(double x, double y, double z)
    {
        double angle = (Math.acos(((Math.pow(x,2)) - (Math.pow(y,2)) - (Math.pow(z,2))) / (-2 * y * z))) * 100;
        int angle2 = (int)(angle);
        angle = (double) (angle2) / 100;
        return angle;
    }
    
    public static void exercise4(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        double one = distance(x1, y1, x2, y2);
        double two = distance(x2, y2, x3, y3);
        double three = distance(x1, y1, x3, y3);
        System.out.println("The furthest distance is " + Math.max(one, two, three));
    }
}

