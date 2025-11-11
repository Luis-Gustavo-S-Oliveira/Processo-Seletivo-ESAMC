package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double anosExperiencia;
        System.out.println("Digite apenas numeros");
        System.out.print("Quantos anos de experiência você tem com programação? ");
        anosExperiencia = scan.nextInt();
        System.out.println("Quantos projetos você já participou?");
        int projetosParticipados = scan.nextInt();

        if (anosExperiencia < 1 && projetosParticipados < 2) {
            System.out.println("você é um estagiario");
        }else System.out.println("você é uma Junior");
    }
}
