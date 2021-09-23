/* Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber, 
sabendo-se que o funcionário tem gratificação de 5% sobre o salário base e paga 
imposto de 7% também sobre o salário base.
Gilmar André Bento da Silva, RGM 27816770, Periodo Noturno, 1/2°Semestre */
import javax.swing.JOptionPane;
public class Exercicio5 {
    
    public static void main(String[] args) {

        double salario, salarioaReceber;

        salario =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o seu salario!:", "Digite aqui:"));
        salarioaReceber = salario * 1.05;
        salario = salario * 1.07;
        JOptionPane.showMessageDialog(null, String.format("Seu novo salário é: %2f", salarioaReceber));
                
    }  
}     