package homework.b1_quadratic_equation_2;

import java.util.Scanner;

class Quadratic_Equation_2{
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    Quadratic_Equation_2(){}
    Quadratic_Equation_2(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double deltaMethod(int a, int b, int c){
        return b*b - 4*a*c;
    }
    public void solutionEquation(int a, int b, int c){
        double delta = deltaMethod(a, b, c);
        System.out.println("Delta = " + delta);
        double x1, x2;
        if(a == 0){
            System.out.println("Vui long nhap lai so a");
        }else{
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem! ");
            }else if(delta == 0){
                x1 = x2 = -b/2*a;
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x1);
            }else
            {
                x1 = (-b + Math.sqrt(delta))/(2*a);
                x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet x1= " + x1 + "\nx2 = " + x2);
            }
        }
    }
}
public class MainApplication {
    public static void main(String[] args) {
        Quadratic_Equation_2 equation_2 = new Quadratic_Equation_2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap a: ");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap b: ");
        int b = scanner.nextInt();
        System.out.println("Moi ban nhap c: ");
        int c = scanner.nextInt();
        equation_2.setA(a);
        equation_2.setB(b);
        equation_2.setC(c);
        equation_2.solutionEquation(equation_2.getA(), equation_2.getB(), equation_2.getC());
        
    }
}
