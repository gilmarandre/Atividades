import javax.swing.JOptionPane;
/**
 Desenvolva um programa em Java que solicite ao usuário os valores 
 dos lados de um retângulo e calcule e mostre seu perímetro e sua área.
 Gilmar André Bento da Silva, RGM 27816770, Periodo Noturno, 1/2°Semestre
 */
public class Exercicio1 {
    public static void main(String[] args) {

        float base, altura, area, perimetro;

        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do retângulo!", "Digite aqui:"));
        base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do retângulo!", "Digite aqui:"));

        area = ((base * altura) + (altura * base));
        perimetro = (2 * (base + altura));

        JOptionPane.showMessageDialog(null, String.format("A áre do retângulo é: %2f", area));
        JOptionPane.showMessageDialog(null, String.format("O perímetro do retângulo é: %2f", perimetro)); 


    }

    
}