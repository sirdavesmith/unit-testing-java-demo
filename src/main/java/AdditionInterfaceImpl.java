public class AdditionInterfaceImpl implements AdditionInterface {
    public int addTwoNumbers(int firstValue, int secondValue){
        int result = Math.addExact(firstValue, secondValue);
        System.out.print(firstValue + " " + "+" + " " + secondValue + " " + "=" + " " + result + "\n");
        return result;
    }

    public String returnAsString(int firstValue, int secondValue){
        return String.valueOf(addTwoNumbers(firstValue, secondValue));
    }
}
