import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Exercicio04{
    public static void main(String[] args){

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Número: "));

        if (numero %2 == 0){
            JOptionPane.showMessageDialog(null, "Número Par");

        }else{
            JOptionPane.showMessageDialog(null, "Número não é Par!");
            
        }

        
    }
}