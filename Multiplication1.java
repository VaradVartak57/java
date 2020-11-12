//5 display multiplication table of 15 using while loop 
import java.util.Scanner;
public class Multiplication1 {

        public static void main(String[] args) {
            int i=1,num=15;
            Scanner read = new Scanner(System.in);
            System.out.println("Upto how much do you want the table?? ");
            int n = read.nextInt();
            System.out.println("Multiplication table of 15");
            while(i<=n)
            {
                System.out.printf("%d * %d = %d \n", num, i, num * i);
                i++;
            }
        }
    }

