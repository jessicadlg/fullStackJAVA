/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercios;

import java.util.Scanner;

/**
 *
 *
 * d. En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de
 * secundario. Cada fila corresponde a las notas y al promedio de cada alumno.
 * i. Se necesita un programa que permita a un profesor cargar en las 3 primeras
 * posiciones de cada fila las notas del alumno y que en la última columna se
 * calculen los promedios. ii. Una vez realizados los cálculos, se desea mostrar
 * las 3 notas de cada alumno y el promedio correspondiente recorriendo la
 * matriz. Ejemplo:
 * 
 *
 */
public class matrices {

    /* a. Llevar a cabo un programa que permite cargar completamente con números 5 una matriz 
de 4x5 (4 filas, 5 columnas).*/
    public static void main(String[] args) {
//        int matriz[][] = {{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}};
//        //cargo la matriz con las notas llamando x el teclado!
//        for (int f = 0; f < 4; f++) {
//            for (int c = 0; c < 5; c++) {
//                System.out.print(matriz[f][c]);
//            }
//            System.out.println("");
//        }
//
/* b. Llevar a cabo un programa que permita completar con números 1 toda la
 * diagonal principal de una matriz de 6 x 6. Entiéndase por diagonal principal
 * aquella que comienza en [0,0] y termina en [6,6].*/

//        int matriz[][] = new int[6][6];
//        
////rellenando la matriz
//        for (int i = 0; i < matriz.length; i++) {
//            matriz[i][i] = 1;
//        }
//        //mostrar la matriz
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                System.out.print(matriz[i][j] +"\t");
//            }
//            System.out.println("");
//        }
        /*c. Llevar a cabo un programa que permita cargar mediante teclado una matriz
 * de 3 x 3 (3 filas, 3 columnas) con razas de perros. Una vez cargada, se debe
 * permitir al usuario ingresar por teclado una raza de perro que quiera buscar;
 * el programa deberá poder encontrarla y mostrar un mensaje con la posición
 * (fila, columna) donde la encontró. En caso de que la raza de perro no se
 * encuentre en la matriz, se deberá informar la situación mediante un mensaje
 * por pantalla. */
//        String razas[][] = new String[3][3];//inicializo matriz
//        boolean bandera = false;
//        String busqueda ;
//        Scanner teclado = new Scanner(System.in);
//
//        //cargo la matriz con las razas llamando x el teclado!
//        System.out.println("Ingrese la raza de perro de la posicion: ");
//        for (int f = 0; f < 3; f++) {
//
//            for (int c = 0; c < 3; c++) {
//                System.out.println("Raza de la posicion [" + f + "][" + c + "]: ");
//                razas[f][c] = teclado.next();
//            }
//             
//        }
//        System.out.println("Ingrese una raza de perro a buscar: ");
//
//        for (int f = 0; f < 3; f++){
//            for (int c = 0; c < 3; c++) {
//              
//                busqueda = teclado.next();
//                if ( busqueda== razas[f][c]) {
//                     bandera = true;
//                    System.out.println(" La raza se encuentra en la posición: " + busqueda);
//                }
//            }
//        }
//        if (bandera == false) {
//            System.out.println("La raza de perro no se encuentre en la matriz");
//        }
 /*e. Una compañía de vuelos cuenta con 6 destinos a los que
 * realiza 3 vuelos diariamente, uno por la mañana, otro al mediodía y otro por
 * la noche. Para administrar estos datos, utiliza una matriz, donde cada fila
 * es un destino y en cada columna se guarda la cantidad de asientos
 * disponibles. Por Ejemplo: i. Se necesita un programa que permita la carga de
 * la matriz con la cantidad de asientos para cada vuelo. ii. Al mismo tiempo,
 * el programa debe permitir a un usuario ingresar el número de destino al que
 * quiere dirigirse, el número de vuelo (dependiendo si quiere viajar a la
 * mañana, al mediodía o a la noche) y la cantidad de pasajes que necesita. iii.
 * A partir de la solicitud del usuario, el programa debe controlar si hay la
 * cantidad suficiente de asientos para la cantidad de pasajes que se requiere.
 * En caso de que 0 1 2 Mañana Mediodía Noche 0 Rio de Janeiro 120 15 30 1
 * Cancún 65 1 2 2 Madrid 4 52 7 3 Roma 46 32 16 4 Milán 64 23 11 5 Iguazú 61 12
 * 91Desarrollo Web Full Stack con Java – Ing. Luisina de Paula así sea, se debe
 * mostrar un cartel por pantalla que diga “su reserva fue realizada con éxito”
 * y se debe descontar del total de asientos los solicitados por el usuario. En
 * caso de no haber más asientos disponibles, se debe informar otro cartel que
 * diga “disculpe, no se pudo completar su operación dado que no hay asientos
 * disponibles”. iv. Desde la compañía de vuelos manifiestan que NO CONOCEN
 * cuantas ventas/reservas se hacen por día. Por lo cual, para finalizar las
 * ventas se ingresa la palabra “finish”*/
 int matriz[][]= new int [6][3];
 //cargo la matriz con las llamando x el teclado!
        Scanner teclado = new Scanner(System.in);
 
    }
}
