import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
