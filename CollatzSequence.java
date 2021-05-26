import java.util.Scanner;
public class CollatzSequence
 {
     public static boolean isOdd(int number) {
         if((number&1)==1) return true;
         return false;
     }
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int startNumber = get.nextInt();

        if (startNumber <= 0)
            System.out.println("Enter valid starting number");
        else
        {
            System.out.println(startNumber);
            while (startNumber != 1)
            {
                startNumber = (isOdd(startNumber)) ? ((3 * startNumber) + 1) : (startNumber /= 2);
                System.out.println(startNumber);
            }
        }
    }
}
