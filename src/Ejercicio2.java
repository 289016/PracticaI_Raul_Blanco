import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calculo = 0;
        do {


            System.out.println("Introduzca el 1 para el perimtro, 2 para el area y 3 si quiere el volumen");
            calculo = sc.nextInt();


            //declaracion e inicializacion de las variables
            double radio;
            double area;
            double perimetro;
            double volumen;
            double altura;

            //declaracion de la constante
            final double Pi = 3.1416;

            //representamos las formulas de cada caso
            switch (calculo) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Introduzca el valor del radio: ");
                    radio = sc1.nextDouble();
                    perimetro = 2 * Pi * radio;
                    System.out.println("El perimetro del circulo es:" + perimetro);
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Introduzca el valor del radio:");
                    radio = sc2.nextDouble();
                    area = Pi * radio * radio;
                    System.out.println("El area del circulo es:" + area);
                    break;
                case 3:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Introduzca el valor del radio:");
                    radio = sc3.nextDouble();
                    System.out.println("introduce el valor de la altura:");
                    altura = sc3.nextDouble();
                    volumen = Pi * radio * radio * altura;
                    System.out.println("El volumen del circulo es:" + volumen);
                    break;
                default:
                    System.out.println("El numero introducido NO es correcto");
                    break;
            }

        }while (calculo>0 && calculo<4);






        //


    }
}


