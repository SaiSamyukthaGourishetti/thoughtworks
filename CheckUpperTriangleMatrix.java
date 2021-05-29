import java.util.*;
public class CheckUpperTriangleMatrix
{
    public static String isUpperTriangular(int [][]matrixElements,int noOfRows)
    {
        for(int row=1;row<noOfRows;row++)
            for(int col=0;col<row;col++)
                if(matrixElements[row][col]!=0) return "no";
            return "yes";
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
            System.out.println(isUpperTriangular(matrixElements,noOfRows));

    }
}
