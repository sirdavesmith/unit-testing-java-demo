public class Subtraction {
    public int subtractTwoNumbers(int firstValue, int secondValue){
        int result = Math.subtractExact(firstValue, secondValue);
        System.out.print(firstValue + " " + "-" + " " + secondValue + " " + "=" + " " + result + "\n");
        return result;
    }
}