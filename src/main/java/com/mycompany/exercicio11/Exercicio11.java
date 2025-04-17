package com.mycompany.exercicio11;
import java.util.*;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        String x = sc.nextLine();
        
        int num1 = Integer.parseInt(x);
        float conta = num1 % 2;
        
        if(conta == 0){
            System.out.println("O número " + num1 + " é par");
        } else{
            System.out.println("O número " + num1 + " é impar");
        }
    }
}
