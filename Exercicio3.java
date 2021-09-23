/* Escreva um programa em Java que solicite ao usuário a distância entre duas cidades e o tempo de viagem. 
 O programa deverá calcular e exibir a velocidade média de um carro que vai de uma cidade para outra. 
 Utilize a fórmula:
 */
import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        float distancia, tempo, velocidadeMedia;

        System.out.println("Digite a distância do percurso: ");
        Scanner sc;
        distancia = sc.nextFloat();
        System.out.println("Digite o tempo do percurso: ");
        tempo = sc.nextFloat();
        
        velocidadeMedia = (distancia / tempo);

    }
}