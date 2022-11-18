public class QuartsToGallons {
    public static void main(String[] args) {
        final byte QTG = 4;
        short quaNum = 18;
        System.out.println("A job that needs " + quaNum + " quarts requires "
                + quaNum / QTG + " gallons" + " plus "+ quaNum % QTG + " quarts.");
    }
}
