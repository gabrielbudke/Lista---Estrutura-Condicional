import javax.swing.JOptionPane;
public class Exercicio16{
    public static void main(String[] args){
        
        double temp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura desejada:"));
        int origem = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha a temperatura de origem: " + 
            "\n1   |Celsius" + 
            "\n2   |Fahrenheit" +
            "\n3   |Kelvin"));

        int destino = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha a temperatura de destino: " +
            "\n1   |Celsius" + 
            "\n2   |Fahrenheit" +
            "\n3   |Kelvin"));

            if(origem == 1 && destino == 2 ){
                JOptionPane.showMessageDialog(null, "Temperatura em Farenheit: " + (temp *1.8 +32));
            }else if (origem == 1 && destino == 3){
                JOptionPane.showMessageDialog(null, "Temperatura em Kelvin: " + (temp + 273));
            }else if (origem == 2 && destino == 1){
                JOptionPane.showMessageDialog(null, "Temperatura em Celsius: " + (temp - 32)/1.8);
            }else if (origem == 2 && destino == 3){
               JOptionPane.showMessageDialog(null, "Temperatura em Kelvin: " + ((temp - 32 / 1.8) + 273.15));
            }else if (origem == 3 && destino == 1){
                JOptionPane.showMessageDialog(null, "Temperatura em Celsius: " + (temp - 273));
            }else if (origem == 3 && destino == 2){
                JOptionPane.showMessageDialog(null, "Temperatura em Farenheit: " + (temp - 273)*1.8 + 32 );
            }
    }
}