import java.util.*;
public class Main
{
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.println("enter any number : ");
        int n=s.nextInt();
        for(int i=5;i<=n;i++)
        {
           for(int j=4;j<=i;j++)
           {
               for(int k=3;k<=j;k++)
               {
                   if(j*j + k*k ==i*i &&cop(k,j)&& cop(j,i) &&cop(k,i))
                   System.out.println(k+" "+j+" "+i);
               }
           }
        }
    }
    public static boolean cop(int a,int b){
       return gcd(a,b)==1;
    }
    public static int gcd(int a,int b){
       while(b!=0)
       {
           int r=a%b;
           a=b;
           b=r;
       }
       return a;
    }
}