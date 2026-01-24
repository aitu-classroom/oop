// Exception ... an error in program caused by external circumstances or internal bug
// Exception handling/managing/processing

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest {

    static int f(int a, int b){
        if (a<0 || b<0) throw new NegativeNumbersException();
        return a/b;
    }

    // 1 1 2 3 5 8 13 21
    static int fib(int n){
        if (n == 0 || n == 1) return 1;
        System.out.println(n);
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        try {
//            System.out.print("Enter two numbers: ");
//            Scanner input = new Scanner(System.in);
            Scanner input = new Scanner(new File("input.txt"));
            int a = input.nextInt();
            int b = input.nextInt();
            int A[] = new int[]{1, 2, 3, 4, 5};
            System.out.println(A[f(a, b)]);
            System.out.println(fib(7));
        } catch (ArithmeticException e) {
            System.out.println("Smth bad happened");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Smth very bad happened");
//            e.printStackTrace();
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Smth terrible happened");
        }
        catch (StackOverflowError e){
            JOptionPane.showMessageDialog(null, "Apocalypse happened");
        }
        catch (NegativeNumbersException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Negative number!!!");
        }
        finally {
            System.out.println("Good bye.");
        }


    }
}

class NegativeNumbersException extends RuntimeException{
    @Override
    public String getMessage() {
        return "negative number";
    }
}
