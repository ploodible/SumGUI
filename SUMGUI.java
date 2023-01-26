import javax.swing.JOptionPane;
public class SUMGUI {
    public static void main(String[] args) {
        int i=0;
        int j = 0;
        int sum=0;
        while(i<3)
        {
            String s = JOptionPane.showInputDialog(null, "Enter an integer value:");
            j = Integer.parseInt(s);
            sum+=j;
            i++;
        }
        JOptionPane.showMessageDialog(null, "The sum is:  "+sum, "Sum", JOptionPane.INFORMATION_MESSAGE);  
    }
}

