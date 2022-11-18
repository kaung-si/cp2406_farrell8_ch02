import javax.swing.*;

public class Eggs {
    public static void main(String[] args) {
        final float dozenPrice = 3.25F;
        final float loosePrice = 0.45F;
        String eggString;
        short eggNum;
        eggString = JOptionPane.showInputDialog(null, "Enter the number of eggs: ",
                "Egg Price Calculator", JOptionPane.INFORMATION_MESSAGE);
        eggNum = Short.parseShort(eggString);
        int eggDozen = eggNum / 12;
        int eggLoose = eggNum % 12;
        float total = (eggDozen * dozenPrice) + (eggLoose * loosePrice);
        JOptionPane.showMessageDialog(null, "You ordered "+ eggNum + "eggs. " +
                "That's " + eggDozen + " dozen at $"+ dozenPrice + " per dozen " +
                "and " + eggLoose + " loose eggs at " + loosePrice + " cents each for a total of $" + total + "." );

    }
}
