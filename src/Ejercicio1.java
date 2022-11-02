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
            if (cliente == 1) {

                //solicitud y lectura de la hipoteca
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Introduzca true si quiere solicitar una hipoteca y false si no quiere");
                hipoteca = sc1.nextBoolean();
                if (hipoteca == true) {
                    //solicitud y lectura del trabajo
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Introduce true si trabaja y false si no lo hace");
                    trabajo = sc2.nextBoolean();
                    if (trabajo == true) {
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("Introduzca el dinero de la vivienda que desea comprar");
                        if (sc3.hasNextInt()) {
                            vivienda = sc3.nextInt();
                            Scanner sc4 = new Scanner(System.in);
                            System.out.println("introduzca el dinero que tiene ahorrado");
                            if (sc4.hasNextInt()) {
                                ahorrado = sc4.nextInt();
                                if (ahorrado >= vivienda / 5) {
                                    System.out.println("enhorabuena, su hipoteca ha sido concedida");

                                } else {
                                    System.out.println("lo sentimos, no se le puede conceder la hipoteca");
                                }
                            } else {
                                System.out.println("ha introducido un valor incorrecto");
                            }
                        } else {
                            System.out.println("ha introducido un valor incorrecto");
                            break;
                        }
                    } else {
                        System.out.println("si no quiere solicitar una hipoteca salgase de la pagina ");
                        break;
                    }
                } else {
                    System.out.println("si no quiere solicitar una hipoteca salgase de la pagina");
                    break;
                }

            }break;

        }while (hipoteca = true) ;
    }
}







