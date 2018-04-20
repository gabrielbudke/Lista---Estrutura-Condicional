import javax.swing.JOptionPane;
public class Exercicio13{
    public static void main(String[] args){
     
    double n1 = Double.parseDouble(JOptionPane.showInputDialog("Número A: "));
    double n2 = Double.parseDouble(JOptionPane.showInputDialog("Número B: "));

    if (n1 < n2){
        JOptionPane.showMessageDialog(null, "Número A menor que Número B");
    }else{
        JOptionPane.showMessageDialog(null, "Número B menor que Número A");
    }


    }
}