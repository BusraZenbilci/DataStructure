import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = tara.nextLine();

        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(metod(arr));
    }
        public static int metod(String[] arr){
            Stack <String> stack = new Stack<String>();
            for(int i = 0 ; i< arr.length ; i++){
                if(stack.isEmpty()){
                    stack.push(arr[i]);
                }
                else if (arr[i].equals(stack.peek())){
                    stack.pop();
                }
                else stack.push(arr[i]);
            }
            System.out.println(stack);
            return stack.size();
        }
    }

