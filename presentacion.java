package principal;

import java.util.Scanner;
import modelo.Calculadora;

public class Presentacion {

    public static void main(String[] args) {
        int a, b;
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Introduce número 1:");
        a=sc.nextInt();
        System.out.println("Introduce número 2:");
        b=sc.nextInt();
        
        Calculadora cal=new Calculadora();
        
      
        System.out.println("Suma: "+cal.sumar());
        System.out.println("Resta: "+cal.restar());
        System.out.println("Multiplicar: "+cal.multiplicar());
        System.out.println("Dividir: "+cal.dividir());
    }
    
}
