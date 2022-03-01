import java.util.*;
class Calulator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to calulator");
    System.out.println("Enter the first number");
    int a = sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    System.out.println("Enter the choice 1-addition 2-subtraction 3-multiplication 4-division");
    int choice =sc.nextInt();
    switch(choice){
            case 1:{
                System.out.println("Addition Result: "+ (a+b));
                break;
            }
            
            case 2:{
                System.out.println("Subraction Result: "+ (a-b));
                break;
            }
            
            case 3:{
                System.out.println("Multiplication Result: "+ (a*b));
                break;
            }
            
            case 4:{
                System.out.println("Division Result: "+ (a/b));
                break;
            }
            
            default:{
                System.out.println("Please Enter Valid Choice");
                break;
            }
        }
		
	}
}
