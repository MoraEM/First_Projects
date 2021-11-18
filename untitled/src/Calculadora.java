import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        float num1;
        float num2;
        float suma;
        float resta;
        float multi;
        float div;

        System.out.println("Bienvenido a la calculadora básica");
        System.out.println("Digita el primer numero");
        num1 = entrada.nextFloat();
        System.out.println("Digita el segundo numero numero");
        num2 = entrada.nextFloat();

        suma=num1+num2;
        resta=num1-num2;
        multi=num1*num2;
        div=num1/num2;

        System.out.println("La suma es de: "+suma);
        System.out.println("La resta es de: "+resta);
        System.out.println("La multiplicacion es de: "+multi);
        System.out.println("La division es de: "+div);




    }
}
