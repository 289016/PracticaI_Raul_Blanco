import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //dclaracion de la variable
        Scanner sc = new Scanner(System.in);
        int cliente;
        System.out.println("Introduzca el 1 para empezar con el proceso de solicitud de hipoteca ");
        cliente = sc.nextInt();

        boolean hipoteca = true;
        boolean trabajo = true;
        int dinero;
        int ahorrado;
        int vivienda;

        do {
            switch (cliente) {
                case 1:
                    //solicitud y lectura de la hipoteca
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Introduzca true si quiere solicitar una hipoteca y false si no quiere");
                    hipoteca = sc1.nextBoolean();

                case 2:
                    //solicitud y lectura del trabajo
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Introduce true si trabaja y false si no lo hace");
                    trabajo = sc2.nextBoolean();
                case 3:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Introduzca el dinero de la vivienda que desea comprar");
                    vivienda = sc3.nextInt();


                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Introduzca el dinero que quieres pedir, este no puede superar el 80% de lo que cuesta su vivienda");
                    dinero = sc4.nextInt();

                    if (dinero <= vivienda*80/100 ) {

                        System.out.println("Su dinero esta dentro de los limites establecidos.Introduzca sus ahorros");
                        Scanner sc5 = new Scanner(System.in);
                        ahorrado = sc5.nextInt();
                        if (ahorrado >= vivienda * 20 / 100) {

                            System.out.println("Cumples todos los pasos, se le entregara el dinero");
                        } else {
                            System.out.println("no se le podra entregar el dinero ya que sus ahorros deben ser superiores al 20% de lo que cuesta la vivienda");
                        }

                    }
                    else {
                        System.out.println("Lo sentimos pero no podemos concederle esa cantidad");

                        if (hipoteca) {
                            System.out.println("Necesita cumplir unos pasos para poder otorgarsela");
                        } else {
                            System.out.println("Abandone la pagina");
                            break;
                        }
                        if (trabajo) {
                            System.out.println("Entonces ya cumple uno de los pasos");
                        } else {
                            System.out.println("Entonces no podemos otorgarlela hipoteca");
                            break;



                        }

                    }
            }
        }while(hipoteca=false);}}





