import java.util.Scanner;

public class sum {
    public static void sumOfInt(int[] a, int target){
        int sum=0 ;
        int n =a.length;
        int count;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-1;j++){
                count= a[i]+a[j];
                if(count== target){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
    public static void main(String [] args){
        int arr[]={1,2,3,4,5},target;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target element");
        target = sc.nextInt();
        sumOfInt(arr,target);

}
}