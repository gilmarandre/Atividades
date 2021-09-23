public class Exercicio2 {

/* Faça um programa que receba três notas,
 calcule e mostre a média aritmética.
Gilmar André*/
    public static void main(String [] args){
        
        Float nota1, nota2, nota3, resultado;

        nota1 = Float.parsetFloat(JOptionPane.showImputDialog(null, "Digite a primeira nota: "));
        nota2 = Float.parsetFloat(JOptionPane.showImputDialog(null, "Digite a primeira nota: "));
        nota3 = Float.parsetFloat(JOptionPane.showImputDialog(null, "Digite a primeira nota: "));
        resultado = nota1 / (nota2 * nota3);
        JOptionPane.ShowMessageDialog(null, resultado);

    }
}
