import javax.swing.*;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final byte QTG = 4; // assign unchangeable constant value.
        short quaNum; // specify variable type.
        String quaNumString;
        quaNumString = JOptionPane.showInputDialog(null, "Enter quarts to convert into Gallons: ", "Quarts to Gallons Converter",
                JOptionPane.INFORMATION_MESSAGE); // interface to ask user input.
        quaNum = Short.parseShort(quaNumString); // convert the string input into short for calculation.
        JOptionPane.showMessageDialog(null, "A job that needs " + quaNum + " quarts requires "
                + quaNum / QTG + " gallons" + " plus "+ quaNum % QTG + " quarts."); // Shows the message on the panel.

    }
}
