/*public class Recursion{
    public static void printNumb(int n){
        if(n==0)
        {
            return;
        }
                System.out.println(n);

        printNumb(n-1);
    }
    public static void main(String s[]){
        int n=5;
        printNumb(n);

    }
}*/
//==================================================================
//print sum of numbers
public class Recursion{
    public static void printSum(int i,int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        printSum(i+1,n,sum);
    }
    public static void main(String s[]){
        printSum(5,5,0);
    }
}