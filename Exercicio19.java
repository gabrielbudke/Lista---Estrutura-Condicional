import javax.swing.JOptionPane;
public class Exercicio19{
    public static void main(String[] args){

        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo Atual: "));
        double deposito = Double.parseDouble(JOptionPane.showInputDialog("Depósitos"));
        double emprestimo = Double.parseDouble(JOptionPane.showInputDialog("Parcela do EMpréstimo"));
        double saques = Double.parseDouble(JOptionPane.showInputDialog("Total de Saques Realizados"));

        double saldoAtual = saldo + deposito - saques - emprestimo;

        if (saldoAtual == 0.00){
            JOptionPane.showMessageDialog(null, "Saldo Neutro");
        }else if (saldoAtual > 0){
            JOptionPane.showMessageDialog(null, "Saldo Positivo");
        }else if (saldoAtual < 0){
            JOptionPane.showMessageDialog(null, "Saldo Negativo");
        }
        
    }
    
}