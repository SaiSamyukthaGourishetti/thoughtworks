import java.util.*;
public class CheckMangoTree {
    public static void main(String args[])
    {
        int totalTrees,rowsCount,colsCount,checkTree;
        Scanner getInput=new Scanner(System.in);
        rowsCount=getInput.nextInt();
        colsCount=getInput.nextInt();
        checkTree=getInput.nextInt();
        totalTrees=rowsCount*colsCount;
        if(1<=checkTree && checkTree<=totalTrees)
        {
            if (checkTree <= colsCount)
                System.out.println("Tree-" + checkTree + " is a mango tree");
            else if (((checkTree - 1) % colsCount) == 0)
                System.out.println("Tree-" + checkTree + " is a mango tree");
            else if (checkTree%colsCount==0)
                System.out.println("Tree-" + checkTree + " is a mango tree");
            else
                System.out.println("Tree-" + checkTree + " is not a mango tree");
        }
        else
        {
            System.out.println("Tree-" + checkTree + " does not exist");
        }
    }
}
