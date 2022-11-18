import java.util.Scanner;

public class ChilliToGoProfit {
    public static void main(String[] args) {
        final short aMealPrice = 7;
        final short cMealPrice = 4;
        final float aProfit = 4.35F;
        final float cProfit = 3.10F;
        int aMealNum, cMealNum;
        Scanner input = new Scanner(System.in); // create 'input' object of the class Scanner.
        System.out.print("Enter number of adult meals: ");
        aMealNum = input.nextInt(); // reads the integer input from user
        System.out.print("Enter number of child meals: ");
        cMealNum = input.nextInt(); // reads the integer input from user
        float totalAMeal = aMealPrice * aMealNum;
        float totalCMeal = cMealPrice * cMealNum;
        float totalAProfit = aProfit * aMealNum;
        float totalCProfit = cProfit * cMealNum;
        System.out.println("Money collected for " + aMealNum + " adult meals = $"+ totalAMeal + "\n" +
                "Money collected for " + cMealNum + " child meals = $"+ totalCMeal + "\n" +
                "Money collected for " + (aMealNum + cMealNum) + " ALL meals = $"+ (totalAMeal + totalCMeal) + "\n" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
                "PROFIT DETAILS\n" +
                "Profit gained from " + aMealNum + " adult meals = $"+ totalAProfit + "\n" +
                "Profit gained from " + cMealNum + " child meals = $"+ totalCProfit + "\n" +
                "Grand total Profit = "+ (totalAProfit + totalCProfit));
    }
}
