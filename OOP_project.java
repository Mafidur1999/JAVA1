import java.util.Scanner;
import static java.lang.Math.*;
class OOP_project {
    public static void main(String[] args) {
        String operator;
        Double number1;
        Double number2;
        Double result;
        int i;
        Scanner input = new Scanner(System.in);
        do {
        System.out.println("\nSelect your operation \n");
        System.out.println("Press 0 if don't want to start ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5.  X ^ 3 ");  //Basic maths
        System.out.println("6. Square root");
        System.out.println("7. X ^ 2");
        System.out.println("8. X ^ Y");
        System.out.println("9. 1 / X 10. X ^ (1 / Y)\n 11. X ^ (1 / 3)");  //Power equation
        System.out.println(" 12. Modulus\n 13. X!\n 14.Percentage \n 15. log10(x)\n 16. 10 ^ X ");
        System.out.println(" 17. Sin(Number1)\n 18. Cos(Number1) \n 19. Tan(Number1)\n 20. Cot(Number1)\n 21. Sec(Number1)\n 22. Cosec(Number1)\n");
        operator = input.next();


        switch (operator) {

            // performs addition between numbers
            case "1":


                // ask users to enter numbers
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case "2":


                // ask users to enter numbers
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case "3":
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case "4":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            case "5":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                result = pow(number1, 3);
                System.out.println(number1 + " ^3" + " = " + result);
                break;
            case "6":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                result = sqrt(number1);
                System.out.println(" Square root of  " + number1 + " = " + result);
                break;
            case "7":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                result = pow(number1, 2);
                System.out.println(" Square of  " + number1 + " = " + result);
                break;
            case "8":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = pow(number1, number2);
                System.out.println(" Result = " + result);
                break;
            case "9":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                result = pow(number1, -1);
                System.out.println(" Result = " + result);
                break;
            case "10":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = pow(number1, (1 / number2));
                System.out.println(" Result = " + result);
                break;

            case "11":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = pow(number1, (1 / 3));
                System.out.println("\nResult:  \n" + result);
                break;
            case "12":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = number1 % number2;
                System.out.println("\nResult:  \n" + result);
                break;
            case "13":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                result = Double.valueOf(1);
                for (i = 1; i <= number1; i++) {
                    result = result * i;
                }
                System.out.println("\nResult:  \n" + result);
                break;
            case "14":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = (number1 * number2) / 100;
                System.out.println("\nResult:  \n" + result);
                break;
            case "15":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                result = log10(number1);
                System.out.println("\nResult:  \n" + result);
                break;
            case "16":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                result = pow(10, number1);
                System.out.println("\nResult: \n" + result);
                break;
            case "17":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                double radians = toRadians(number1);
                double sinValue = sin(radians);
                System.out.println("sin(" + number1 + ") = " + sinValue);
                break;
            case "18":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                double radian = toRadians(number1);
                double cosValue = cos(radian);
                System.out.println("cos(" + number1 + ") = " + cosValue);
                break;
            case "19":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                double radia = toRadians(number1);
                double tanValue = tan(radia);
                System.out.println("tan(" + number1 + ") = " + tanValue);
                break;
            case "20":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                double radi = toRadians(number1);
                double cotOfAngle = 1 / Math.tan(number1);
                System.out.println("tan(" + number1 + ") = " + cotOfAngle);
                break;
            case "21":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                double rad = toRadians(number1);
                double secOfAngle = 1 / Math.cos(number1);
                System.out.println("cos(" + number1 + ") = " + secOfAngle);
                break;
            case "22":
                System.out.println("Enter first number");
                number1 = input.nextDouble();
                double ra = toRadians(number1);
                double cosecOfAngle = 1 / Math.sin(number1);
                System.out.println("cos(" + number1 + ") = " + cosecOfAngle);
                break;
            default:
                System.out.println("Invalid operator!");
                break;

        }
        }while (true);


    }
}