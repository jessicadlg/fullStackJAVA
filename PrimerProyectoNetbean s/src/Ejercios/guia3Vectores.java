/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercios;

import java.util.Scanner;

/**
 *
 * a. Llevar a cabo un programa que incluya un vector que almacene los nombres:
 * Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
 * Realizar un recorrido del vector para cargar los datos y otro recorrido para
 * mostrar los mismos por pantalla.
 *
 * b. Realizar un programa que permita la carga * de 10 números en un vector.
 * Una vez cargados, se necesita que el programa * determine cual es el mayor y
 * cuál es el menor de ellos.
 *
 * c. Realizar un programa que permita la carga de 15 números en un vector. Una
 * vez cargados, se necesita que el programa cuente e informe por pantalla
 * cuántas veces se cargó el número 3.
 *
 * d. Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir
 * de esto, necesita un programa que determine y muestre por pantalla la suma
 * total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
 *
 * e. En tres vectores diferentes se guardan los nombres, temperaturas mínimas y
 * máximas de 5 ciudades de la provincia de Misiones. En el primer vector se
 * guardan los nombres de las ciudades, en el segundo las temperaturas mínimas
 * alcanzadas y en el tercero las temperaturas máximas alcanzadas en la última
 * semana. Se necesita un programa que permita la carga de las ciudades, sus
 * temperaturas mínimas y máximas; además, deberá poder informar por pantalla
 * cual fue la ciudad con la temperatura más baja y cual con la temperatura más
 * alta (dando a conocer al mismo tiempo la cantidad de grados).
 */
public class guia3Vectores {

    public static void main(String[] args) {
        /*ejercicio a*/
//        String[] nombres = {"Alejandra","Leonardo","Rosa","Guillermo","Gabriel","Daniel","Luisa","Ludmila"};
////   recorro el vector hasta q termine su tamaño     
//        for (int i = 0; i < nombres.length; i++) {
//            System.out.println(nombres[i]);
//        }
        /*ejercicio b*/
//        int num[] = new int[10];
////   recorro el vector hasta q termine su tamaño     
//        for (int i = 0; i < num.length; i++) {
//
//            System.out.println("Ingrese el numero de la posición :" + i);
//            Scanner teclado = new Scanner(System.in);
//
//            int numero = teclado.nextInt();
//            num[i] = numero;
//        }
//        //recorro y muestro segun mayor y menor
//        int menor = 99999;
//
//        for (int i = 0; i < num.length; i++) {
//
//            if (num[i] < menor) {
//                menor = num[i];
//            }
//        }
//        System.out.println("El numero menor es: " + menor);
//
//        int mayor = 1;
//
//        for (int i = 0; i < num.length; i++) {
//
//            if (num[i] > mayor) {
//                mayor = num[i];
//            }
//        }
//        System.out.println("El numero mayor es: " + mayor);
//    }
//}
//  /*ejercicio c*/
//        int num[] = new int[15];
//        int cont = 0;
//        int numBuscar = 3;
//        boolean bandera = false;
////   recorro el vector hasta q termine su tamaño     
//        for (int i = 0; i < num.length; i++) {
//            System.out.println("Ingrese el numero de la posición :" + i);
//            Scanner teclado = new Scanner(System.in);
//
//            num[i] = teclado.nextInt();
//            if (numBuscar == num[i]) {
//                cont++;
//                bandera = true;
//            }
//        }
//        if (bandera == false) {
//            System.out.println("No se encontro ningun numero 3");
//        }
//        System.out.println("El numero 3 esta: " + cont + " veces");
//    }
//}
/*ejericio d*/
//        int sueldo[] = new int[12];
//        int suma = 0;
//        int promedio = 0;
//        Scanner teclado = new Scanner(System.in);
//        for (int i = 0; i < sueldo.length; i++) {
//
//            System.out.println("Ingrese el sueldo de la posición: " + i);
//            sueldo[i] = teclado.nextInt();
//            suma += sueldo[i];
//        }
//        promedio = suma / 12;
//        System.out.println("La suma total es: " + suma + " y el promedio es: " + promedio);
//    }
//}

/*ejercicio e*/
//        String ciudades[] = new String[3];
//        int minimas[] = new int[3];
//        int maximas[] = new int[3];
//
//        Scanner teclado = new Scanner(System.in);
//        for (int i = 0; i < ciudades.length; i++) {
//            System.out.println("Ingrese la ciudad de la posición: " + i);
//            ciudades[i] = teclado.next();
//            System.out.println("Ingrese la temperatura minima de la posición: " + i);
//            minimas[i] = teclado.nextInt();
//            System.out.println("Ingrese la temperatura maxima de la posición: " + i);
//            maximas[i] = teclado.nextInt();
//        }
//        //determinar la minima
//        int minima = 999999;
//        int posicionMin = -1;
//
//        for (int i = 0; i < minimas.length; i++) {
//            if (minimas[i] < minima) {
//                minima = minimas[i];
//                posicionMin = i;
//            }
//        }
//        System.out.println("La temperatura minima es de: " + minima + " y corresponde a la ciudad de: " + ciudades[posicionMin]);
//
//        //determinar la minima
//        int maxima = -999999;
//        int posicionMax = -1;
//
//        for (int i = 0; i < maximas.length; i++) {
//            if (maximas[i] > maxima) {
//                maxima = maximas[i];
//                posicionMax = i;
//            }
//        }
//        System.out.println("La temperatura maxima es de: " + maxima + " y corresponde a la ciudad de: " + ciudades[posicionMax]);
//    }
//}
   // public static void main(String[] args) {
        double notas[][] = new double[4][4];
        //cargo la matriz con las notas llamando x el teclado!
        Scanner teclado = new Scanner(System.in);
        double suma = 0;
        
        //carga de la matriz
        for (int f = 0; f < 4; f++) {
            System.out.println("Ingrese las tres notas para el alumno: " + f);

            for (int c = 0; c < 3; c++) {
                notas[f][c] = teclado.nextDouble();
                //voy sumando acumulando en cada vuelta cada nota para dsp sacar el promedio
                suma = suma + notas[f][c];
            }
            //[3] es la columna q le corresponde al promedio
            notas[f][3] = suma / 3;
            suma = 0;
        }
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas y promedio del alumno: " + f + " son:");

            for (int c = 0; c < 4; c++) {
                System.out.println(notas[f][c]);
            }
        }

   }
}
