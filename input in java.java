import java.util.Scanner;

public class InputValues{
    public static void main(String[] args){
       Scanner scanner= new Scanner(System.in);
       
       System.out.print("Enter String : ");
      
       String line=scanner.nextLine();
       System.out.print("Output is "+line);
       scanner.nextLine();
        
       System.out.print("Enter integer : ");
       int Num=scanner.nextInt();
       System.out.println("Int is : "+Num);
       
       System.out.print("Enter a floating no. : ");
       double Flt=scanner.nextDouble();
       System.out.println("Float is : "+Flt);
       
       System.out.print("Enter a char: ");
       char ath=scanner.next().charAt(0);
       System.out.println("Character is : "+ath);
       
       System.out.print("Enter a true/false : ");
       boolean boolV=scanner.nextBoolean();
       System.out.println("Bool Value is : "+boolV);
    }
}
