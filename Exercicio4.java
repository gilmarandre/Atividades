/* Faça um programa que receba o salário de um funcionário, 
calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25% */
import javax.swing.JOptionPane;
public class Exercicio4{
  public static void main(String[] args) {

    double salario;
   salario =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salario!:", "Digite aqui:"));
   salario = salario * 1.25;
   JOptionPane.showMessageDialog(null, String.format("Seu novo salário é: %2f", salario));
        
  }       
}