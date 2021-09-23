/* Faça um programa que calcule e mostre a área de um triângulo a partir da leitura da base e altura (em cm). 
Sabe-se que: á rea = (base * altura)/2.
Gilmar André Bento da Silva, RGM 27816770, Periodo Noturno, 1/2°Semestre */
import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args) {
        float base, altura, area;

        base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a área do triângulo:", "Digite aqui:"));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do triângulo:", "Digite aqui:"));
        area =(base * altura)/2;
        JOptionPane.showMessageDialog(null,"A área do triangulo é: = "+ area);
    }
    
}
