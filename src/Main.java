import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        boolean start = true;
        while(start){
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            if (!line.equalsIgnoreCase("End")){
                int indexOfFirstSpace = line.indexOf(" ");
                int indexOfSecondSpace = line.indexOf(" ", indexOfFirstSpace + 1);
                int firstNo = Integer.parseInt(line.substring(0, indexOfFirstSpace));
                int secondNo = Integer.parseInt(line.substring(indexOfSecondSpace + 1, line.length()));
                String sign = line.substring(indexOfFirstSpace + 1, indexOfSecondSpace);
                switch (sign) {
                    case "^":
                        System.out.println("= " + Math.pow(firstNo,secondNo));
                        break;
                    case "+":
                        System.out.println("= " + (firstNo + secondNo));
                        break;
                    case "-":
                        System.out.println("= " + (firstNo - secondNo));
                        break;
                    case "*":
                        System.out.println("= " + (firstNo * secondNo));
                        break;
                    case "/":
                        if (secondNo != 0) {
                            System.out.println("= " + (firstNo / secondNo));
                        } else {
                            System.out.println("Denominator should not be 0");
                        }
                        break;
                    case "End":
                        System.out.println("End");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("wrong input");
                        break;
                }
            }else {
                start = false;
            }
        }
    }
}
