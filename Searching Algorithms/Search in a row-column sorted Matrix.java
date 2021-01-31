import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            
            int arr1[][] = new int[n1][m1];
            
            for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < m1; j++)
                 arr1[i][j] = sc.nextInt();
            }
            int x = sc.nextInt();
            //new SearchinMat().search(n1, m1, arr1, x);
            SearchinMat obj = new SearchinMat();
            System.out.println(obj.search(n1, m1, arr1, x));
        }
    }
}
class SearchinMat
{
    //Complete this function
    static int search(int n, int m, int arr[][], int x)
    {
        int row=0,col=m-1;
        while(row<n&&col>=0){
            if(arr[row][col]==x)
            return 1;
            else if(arr[row][col]>x)
            col--;
            else
            row++;
        }
        return 0;
    }
}
