import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListHW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    //Ask user for 5 numbers
       
 
        System.out.println("Enter any 5 numbers : ");  
    
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        

        for(int i = 0; i < 5; i++){
            System.out.println("Add another number: ");
            int number = scan.nextInt();
            numberList.add(number);
        
        }

        // Array list
        int sum = 0;
        int product = 1;
        int largest = numberList.get(0);
        int smallest = numberList.get(0);
        //1,2,3,4,5

        //for each num in numberList, do this block of code 5x.
        for(int num : numberList) {
            sum = sum + num;
            product = product * num;
            if (num > largest) {
                largest = num;
            }

            if (num < smallest) {
                smallest = num;
            }
      
        }
        System.out.println(sum);
        System.out.println(product);
        System.out.println(largest);
        System.out.println(smallest);





        scan.close();
    }
}

    

    

    













