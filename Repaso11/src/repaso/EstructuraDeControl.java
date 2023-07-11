package repaso;

import java.util.Scanner;

public class EstructuraDeControl {


    public static String name;
    public static String email;
    public static String password;
    public static Double weight;
    public static Double size;
    public static boolean state;

    Scanner sc = new Scanner(System.in);

    //metodo main. solo se corren los llamados de las funciones
    public static void main(String[] arg) {

    }

    public void register() {
        System.out.println("Escriba su nombre");
        name = sc.nextLine();


        System.out.println("Escriba su correo");
        email = sc.nextLine();

        System.out.println("Escriba su contraseña");
        password = sc.nextLine();

    }

    public void login() {
        System.out.println("Ingrese su correo");
        String userEmail = sc.next();

        System.out.println("Ingrese su contraseña");
        String userPassword = sc.next();

        if (userEmail.equals(email) && userPassword.equals(password)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Datos incorrectos");
        }
    }

    public void menu() {

        System.out.println("1: Registrar \n 2:login \n 3:Apagar sistema\n");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Iniciar registro");
                register();
                break;

            case 2:
                System.out.println("Iniciar Login");
                login();
                break;

            case 3:
                System.out.println("Salir");
                login();
                break;
            default:
                System.out.println("Ingrese Un dato Valido");
        }
    }

    public boolean stateChange() {
        System.out.println("desea encender la aplicacion");
        int response = sc.nextInt();
        if (response == 1) {
           boolean state = true;
        }
        return state;
    }

    public void calcularIMC() {
        System.out.println("Ingrese altura");
        size = sc.nextDouble();
        System.out.println("Ingrese el peso");
        weight = sc.nextDouble();
        double imc = weight / (size * size);

        if (imc == 16.00) {
            System.out.println("Peso bajo");

        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc > 24.9 && imc <= 29 - 9) {
            System.out.println("Sobre peso");

        } else {
            System.out.println("Obesidad");

        }
    }
}