import java.util.*;
public class TypeOfArray {
    public static boolean isEven(int number)
    {
        if((number&1)==0) return true;
        return false;
    }
    public static int computeType(int[] inputArray,int numberOfElements)
    {
        int evenCount=0;
        int oddCount=0;
        for(int itr=0;itr<numberOfElements;itr++)
        {
            if(isEven(inputArray[itr]))
                evenCount+=1;
        }
        oddCount+=numberOfElements-evenCount;

        if(evenCount==numberOfElements)
            return 1;
        else if(oddCount==numberOfElements)
            return 2;
        return 3;
    }

    public static void main(String args[])
    {
        Scanner get=new Scanner(System.in);
        int numberOfElements=get.nextInt();
        int arrayElements[]=new int[numberOfElements];
        for(int itr=0;itr<numberOfElements;itr++)
            arrayElements[itr]=get.nextInt();
        switch (computeType(arrayElements,numberOfElements))
        {
            case 1:System.out.println("The array is Even");break;
            case 2:System.out.println("The array is Odd");break;
            case 3:System.out.println("The array is Mixed");break;
        }
    }
}
