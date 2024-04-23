import java.util.*;
import java.util.Scanner;

public class If{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int x,y;
        x=scanner.nextInt();
        y=scanner.nextInt();
        
//Execution of If statements , else if statements, else statements
        
        if(x<y)
        System.out.println("x is less than y");
        
        else if(x>y)
        System.out.println("x is more than y");
        
        else
        System.out.println("x is equal to y");
    }
}
