/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author victo
 */ import java.util.Scanner;
public class Projeto1043 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float a, b, c, perimetro, trapezio;
        
        a = leitor.nextFloat();
        b = leitor.nextFloat();
        c = leitor.nextFloat();
        
        if(a+b > c && a+c > b && b+c > a){
            perimetro = a+b+c;
            System.out.println("Perimetro = "+ perimetro);
        } else {       
            trapezio = (a+b)*c / 2;
            System.out.println("Area = "+ trapezio);
        }
    }
}
