package Exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anosExperiencia = 0;
        int projetosParticipados = 0;
        boolean a = true;
        while(a){
            try {
                System.out.print("Quantos anos de experiência você tem com programação? "); 
                anosExperiencia = scan.nextInt();
                break;   
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um numero valido");
                a = false;
                break;
            }
        }
        while(a){
            try {
                System.out.println("Quantos projetos você já participou?");
                projetosParticipados = scan.nextInt();
                break;   
            } catch (InputMismatchException e) {
                System.out.println("Erro: digite um numero valido");
                 a = false;
                break;
            }            
        }
        if(a){
            if (anosExperiencia <= 1 && projetosParticipados < 2) {
                System.out.println("você é um estagiario");
            }else{ 
                System.out.println("você é uma Junior");
            }
        }
    
    }
}
