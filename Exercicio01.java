import javax.swing.JOptionPane;
public class Exercicio01{
    public static void main(String[] args){

        int numero = Integer.parseInt(
            JOptionPane.showInputDialog("Número: "));

        if (numero > 0){
            JOptionPane.showMessageDialog(null, "Positivo");
        }else{
            JOptionPane.showMessageDialog(null, "Não é Positivo!");
        }
        
    }
}