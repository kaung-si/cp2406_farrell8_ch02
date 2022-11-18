import javax.swing.JOptionPane;
public class FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double TAX = 0.06;
      costString = JOptionPane.showInputDialog(null, "Enter price of item you are buying", "Purchases",
              JOptionPane.INFORMATION_MESSAGE);
      /*cost = Double.parseInt(costString);*/ // parseInt method parse string to integer value, not decimal.
      cost = Double.parseDouble(costString);
      double taxAmt = cost * TAX;
      JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
         "% tax,  purchase  is $" + (cost + taxAmt));
   }
}
