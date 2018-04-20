import javax.swing.JOptionPane;

public class Exercicio05{
    public static void main(String[] args){
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

        if (numero %2 != 0){
            JOptionPane.showMessageDialog(null, "Número Ímpar");

        }else{
            JOptionPane.showMessageDialog(null, "Número não é ímpar");
        }
    }
}