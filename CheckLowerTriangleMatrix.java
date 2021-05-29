
import java.util.*;
public class CheckLowerTriangleMatrix
{
    public static String isLowerTriangular(int [][]matrixElements,int noOfRows)
    {
        for(int row=0;row<noOfRows;row++)
            for(int col=row+1;col<noOfRows;col++)
                if(matrixElements[row][col]!=0) return "No";
        return "Yes";
    }
    public static void main(String args[])
    {
        Scanner get=new Scanner(System.in);
        int noOfRows=get.nextInt();
        int noOfCols=get.nextInt();
        if(noOfRows!=noOfCols ||noOfCols<=0)
            return;
        int matrixElements[][]=new int[noOfRows][noOfCols];
        for(int row=0;row<noOfRows;row++)
            for(int col=0;col<noOfCols;col++)
                matrixElements[row][col]=get.nextInt();
        System.out.println(isLowerTriangular(matrixElements,noOfRows));

    }
}