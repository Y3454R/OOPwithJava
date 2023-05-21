import javax.swing.JOptionPane;

public class joptionpane {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog(null, "Enter 1st number:");
        String s2 = JOptionPane.showInputDialog(null, "Enter 2nd number:");
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        JOptionPane.showMessageDialog(null, "Sum is: " + (num1+num2));
    }
}
