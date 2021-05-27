import java.util.*;
public class RangeOfArray
{
    public static int[] findMaxandMin(int []arrayElements,int numberOfElements)
    {
        int minElement=arrayElements[0];
        int maxElement=arrayElements[0];
        int []maxMinElements=new int[2];
        for(int itr=0;itr<numberOfElements;itr++)
        {
            if (minElement > arrayElements[itr])
                minElement = arrayElements[itr];
            if(maxElement<arrayElements[itr])
                maxElement=arrayElements[itr];
        }
        maxMinElements[0]=maxElement;
        maxMinElements[1]=minElement;
        return maxMinElements;
    }

    public static void main(String args[])
    {
        Scanner get=new Scanner(System.in);
        int numberOfElements=get.nextInt();
        int arrayElements[]=new int[numberOfElements];
        for(int itr=0;itr<numberOfElements;itr++)
            arrayElements[itr]=get.nextInt();
        int rangeOfArray=findMaxandMin(arrayElements,numberOfElements)[0]-findMaxandMin(arrayElements,numberOfElements)[1];
        System.out.println("The range of the array is "+rangeOfArray);

    }

}
