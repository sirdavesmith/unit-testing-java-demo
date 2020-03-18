import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        iterateThroughClasses();
        operateOnTextFile();
    }

    private static void operateOnTextFile() {
        Scanner read = null;
        try {
            read = new Scanner(new File("C:\\temp\\test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (read != null) {
            read.useDelimiter(";");
        }
        String operation, firstValue, secondValue;

        while (read != null && read.hasNext())
        {
            operation = read.next().trim().replaceAll("[\n\r]", "");
            firstValue = read.next().trim().replaceAll("[\n\r]", "");
            secondValue = read.next().trim().replaceAll("[\n\r]", "");

            //So um....this parse int has to go and we have to have a case for floats/doubles coming in

            if (operation.equals("+")) {
                AdditionInterface additionInterface = new AdditionInterfaceImpl();
                additionInterface.addTwoNumbers(Integer.parseInt(firstValue), Integer.parseInt(secondValue));
            } else if (operation.equals("-")) {
                Subtraction subtraction = new Subtraction();
                subtraction.subtractTwoNumbers(Integer.parseInt(firstValue), Integer.parseInt(secondValue));
            } else if (operation.equals("*")) {
                Multiplication multiplication = new Multiplication();
                multiplication.multiplyTwoNumbers(Integer.parseInt(firstValue), Integer.parseInt(secondValue));
            } else if (operation.equals("/")) {
                Division division = new Division();
                division.divideTwoNumbers(Integer.parseInt(firstValue), Integer.parseInt(secondValue));
            } else {
                System.out.println(" - Invalid operation");
            }
        }
        if (read != null) {
            read.close();
        }
    }

    private static void iterateThroughClasses() {
        Object[] array = new Object[3];
        array[0] = new AdditionInterfaceImpl();
        array[1] = new Subtraction();
        array[2] = new Multiplication();

        for(Object o : array) {
            System.out.println(o.getClass());
        }
    }
}
