package ProblemSet;
import java.util.Scanner;

public class fsrd {
    public static int[][] makeArrayReturn(int n){
        int arr[][]=new int[n][];

        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
        }
        for(int i=0;i<arr.length;i++){
            int g=arr[i].length;
            for(int j=0;j<g;j++){
                if(j==0 || j==(g-1)){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        return arr;
    }
    public static void printClientDemand(int n){
        int jojo[][]=makeArrayReturn(n);
        for(int i=0;i<jojo.length;i++){
            for(int l=0;l<n-i+1;l++){
                System.out.print(" ");
            }
            for(int ff=0;ff<jojo[i].length;ff++){
                System.out.print(jojo[i][ff]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f=s.nextInt();
        printClientDemand(f+1);

    }
}
