package modelo;

public class Calculadora {
    
    int num1, num2;
    
    public Calculadora(int a, int b){
        num1=a;
        num2=b;
    }
    public Calculadora(int n){
        num1=n;
        num2=n;
    }
    public Calculadora(){
        num1=1;
        num2=10;
    }

public void fijarNum1(int n){
        num1=n;
    }
    public void fijarNum2(int n){
        num2=n;
    }

public int sumar(){
        int sum=num1+num2;
        return sum;
    }
