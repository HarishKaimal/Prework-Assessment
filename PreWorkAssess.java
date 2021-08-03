import java.util.Scanner;

public class PreWorkAssess {
    public static void main(String[] args) {
        
        int choice;

        //Getting input from the user
        Scanner obj = new Scanner(System.in);
        do{
        
        System.out.println("\n" + "Please choose from the following options: " + "\n"
                            + " 1. Palindrome Check " + "\n"
                            + " 2. Print Star Pattern " + "\n" 
                            + " 3. Prime Number Check " + "\n"
                            + " 4. Print Fibonnaci series " + "\n"
                            + " 0. Exit");
        choice = obj.nextInt();
        System.out.println(" You choice is " + choice +"\n");

        switch(choice){
            
            case 1:
                long palin = 0L;
                int palin_check_flag = 0;

                System.out.println(" Please enter the number to check if it is a Palindrome ");
                
                if (obj.hasNext()){
                    palin = obj.nextLong();
                }
                
                String palin_digits = String.valueOf(palin);
                int palin_length = palin_digits.length();

                int i =0, j=palin_length-1;
                do{
                    if(palin_digits.charAt(i) != palin_digits.charAt(j)){
                        palin_check_flag++;
                    }
                    i++;
                    j--;
                }while(i<palin_length);
            
                if(palin_check_flag != 0){
                    System.out.println(palin + " is NOT a Palindrome");
                }
                else{
                    System.out.println(palin + " IS a Palindrome");
                }
            break;
            
            case 2:
                long star_length = 0L, row_length = 0L;
                
                System.out.println(" Please enter the length / levels of the star pattern ");

                if (obj.hasNext()){
                    star_length = obj.nextLong();
                }
                do{
                    row_length = star_length;
                    do{
                        System.out.print("*");
                        row_length--;
                    }while(row_length>0);
                    System.out.print("\n");
                    star_length--;
                }while(star_length > 0);
            break;

            case 3:
                
                long num = 0L;
                long iter = 2L;
                long flag = 1L;

                System.out.println(" Please enter the number to check if it is Prime ");

                if (obj.hasNext()){
                    num = obj.nextLong();
                }
                do{
                    
                    if ((num%iter) == 0){
                        flag = 0;
                        break;
                    }
                    iter++;
                }while(iter<num);
                if (flag == 1){
                    System.out.println(" The number " + num +" is PRIME");
                }
                else{
                    System.out.println(" The number " + num +" is NOT PRIME");
                }
                break;

            case 4:
                int fib_length = 0;
                int fib1 = 0;
                int fib2 = 1;
                int fib_value = 0;
                int iter_fib = 0;

                System.out.println(" Please enter the required length of the Fibonacci series ");
                if (obj.hasNext()){
                    fib_length = obj.nextInt();
                }

                System.out.println(" The Fibonacci series is as below ");
                System.out.print(fib1 + " " + fib2);

                do{
                    fib_value = fib1+fib2;
                    System.out.print(" " + fib_value);
                    fib1 = fib2;
                    fib2 = fib_value;
                    iter_fib++;
                }while(iter_fib<fib_length);
                break;

                case 0:
                    System.out.println(" Thank you for using this application. Have a good day! ");
                    break;
            }
        }while(choice!=0);
            
        obj.close();
                
        }


    } 