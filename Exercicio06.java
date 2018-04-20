import javax.swing.JOptionPane;

public class Exercicio06{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
        
        if (numero != 1){
            JOptionPane.showMessageDialog(null, "Diferente 1 !!");

        }else{
            JOptionPane.showMessageDialog(null, "Igual a 1 !!");
        }
    }
}