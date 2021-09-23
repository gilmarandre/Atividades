import javax.swing.JOptionPane;
/**
Escreva um programa em Java que solicite ao usuário o salário atual 
e mostre o salário acrescido de 5% de comissão.
 */
public class Exercicio2 {

    public static void main(String[] args) {
     float salario, comissao;
     
        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu salário", "Digite aqui:"));
        comissao = (5/100 + comissao);
        JOptionPane.showMessageDialog(null, String.format, "Seu salario mais 5% de comssao é: %2f", comissao);        
    }
}