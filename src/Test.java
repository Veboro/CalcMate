import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        boolean onOff = true;
        int operationType = 0;
        String firstNumber = "";
        String secondNumber = "";

        Validator validator = new Validator();
        Calculator calculator = new Calculator();

        while (onOff) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Оберіть тип операції: \n1)+\n2)-\n3)*\n4)\\");
            operationType = scan.nextInt();

            if(validator.isValidOperation(operationType)){
                onOff = false;
                System.out.println("Введіть перше число (римське або арабське)");
                Scanner firstNumberScanner = new Scanner(System.in);
                firstNumber += firstNumberScanner.nextLine();
                System.out.println("Введіть друге число (римське або арабське)");
                Scanner secondNumberScanner = new Scanner(System.in);
                secondNumber += secondNumberScanner.nextLine();

                if(validator.isArabicDigit(firstNumber)&&validator.isArabicDigit(secondNumber)){

                    Integer one = Integer.parseInt(firstNumber);
                    Integer two = Integer.parseInt(secondNumber);

                    switch (operationType) {
                        case 1:
                            System.out.println(calculator.addNumber(one,two));
                            break;
                        case 2:
                            System.out.println(calculator.subtractNumber(one,two));
                            break;
                        case 3:
                            System.out.println(calculator.multiplyNumber(one,two));
                            break;
                        case 4:
                            System.out.println(calculator.divideNumber(one,two));
                    }


                } else if(!validator.isArabicDigit(firstNumber)&& !validator.isArabicDigit(secondNumber)) {

                    int one = validator.convertToArabic(firstNumber);
                    int two = validator.convertToArabic(secondNumber);

                    switch (operationType) {
                        case 1:
                            System.out.println(calculator.toRoman(calculator.addNumber(one,two)));
                            break;
                        case 2:
                            System.out.println(calculator.toRoman(calculator.subtractNumber(one,two)));
                            break;
                        case 3:
                            System.out.println(calculator.toRoman(calculator.multiplyNumber(one,two)));
                            break;
                        case 4:
                            System.out.println(calculator.toRoman(calculator.divideNumber(one,two)));
                    }


                } else {
                    System.out.println("Неправильний формат цифр");

                }

            } else {
                System.out.println("Wrong type, try again");
            }

            System.out.println();
        }



    }

}
