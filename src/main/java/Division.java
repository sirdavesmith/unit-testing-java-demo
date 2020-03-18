public class Division {
    public int divideTwoNumbers(int firstValue, int secondValue){
        if (secondValue == 0) {
            System.out.print(firstValue + " " + "/" + " " + secondValue + " " + "Skipping operation...cannot divide by zero" + "\n");
            return 0;
        }

        int result = Math.floorDiv(firstValue, secondValue);
        System.out.print(firstValue + " " + "/" + " " + secondValue + " " + "=" + " " + result + "\n");
        return result;
    }
}
