public class Multiplication  {
    public int multiplyTwoNumbers(int firstValue, int secondValue){
        int result = Math.multiplyExact(firstValue, secondValue);
        System.out.print(firstValue + " " + "*" + " " + secondValue + " " + "=" + " " + result + "\n");
        return result;
    }
}
