/*
 * 
 * 
 * GUIA 2
 */
package Ejercios;

import java.util.Scanner;

/**
 *
 * @author Usuario 01
 */
public class IntegradoresFor {

    public static void main(String[] args) {
        //1)Un gerente de una empresa prestadora de servicios de internet necesita un programa que
//permita realizar el cálculo del monto a pagar de la factura de consumo de internet de 5
//clientes de una empresa. Para ello, el algoritmo debe solicitar por teclado dos datos: DNI
//del cliente y el tipo de servicio. Los tipos de servicio son 3:
//i.Internet 30 megas (cuyo valor es de $890 – 10% de descuento)
//ii.Internet 50 megas (Cuyo valor es de $1050 – 5% de descuento)
//iii.Internet 100 megas (Cuyo valor fijo es de $1600)
//El programa debe poder calcular el monto a pagar (dependiendo del tipo de servicio con el
//que cuente el cliente) e informar por pantalla el DNI del mismo junto con el monto a pagar
//y el número de servicio con el que cuenta.------------------------------------

//        System.out.println("Por favor ingrese el DNI, y su tipo de servicio:");
//        Scanner teclado = new Scanner(System.in);
//        int DNI = teclado.nextInt();
//        int tipoServicio = teclado.nextInt();
//        if (tipoServicio == 1) {
//            double valor= 890 -(890*0.10);
//            System.out.println("DNI es " + DNI + " ,tipo de servicio es " + tipoServicio+ " y el valor a pagar  es de " + valor);
//
//        } else if (tipoServicio == 2) {
//                       double valor = 1050 -(1050*0.05);
//            System.out.println("DNI es " + DNI + " ,tipo de servicio es " + tipoServicio+ " y el valor a pagar  es de " + valor);
//        } else {
//            int valor = 1600;
//            System.out.println("DNI es " + DNI + " , tipo de servicio es " + tipoServicio+ " y el valor a pagar  es de " + valor);
//           
//        }
//    }
        ////    ---------------------------------------------------------
//2)Un niño de primaria necesita realizar 10 cálculos diferentes entre dos números. Para esto
//necesita un programa que, para cada cálculo, permita el ingreso de los dos números por
//separado al igual que la operación que desea hacer entre ambos. Al mismo tiempo debe
//poder realizar el cálculo en cuestión y mostrar el resultado por pantalla.
//Por ejemplo:
//
//Número 1 = 25 Número 2 = 15 Operador = +
//-------------------------CALCULADORA--------------------------------
//        double numero1, numero2;
//        String operador;
//        double resultado = 0;
//        for (int cont = 0; cont < 3; cont++) {
//            System.out.println("Por favor ingrese el primer número:");
//            Scanner teclado = new Scanner(System.in);
//            numero1 = teclado.nextInt();
//            System.out.println("Por favor ingrese el segundo número:");
//            numero2 = teclado.nextInt();
//            System.out.println("Por favor ingrese el simbolo de la operación:");
//            operador = teclado.next();
//
//            if (operador.equals("+")) {
//                resultado = numero1 + numero2;
//            }else if (operador.equals("-")) {
//                resultado = numero1 - numero2;
//            }else if (operador.equals("*")) {
//                resultado = numero1 * numero2;
//            }else if (operador.equals("/")) {
//                resultado = numero1 / numero2;
//            }else{
//                System.out.println("Por favor,  ingrese valores válidos");
//            }
//            System.out.println("el resutado de la operación es: " + resultado);
//        }
//    }
//}
//3)En la ciudad de Oberá, Misiones se realiza año a año la “Maratón del Inmigrante” en el
//marco de la Fiesta Nacional del Inmigrante. El evento cuenta con un día de inscripciones el
//día anterior a la carrera, por lo que se desconoce la cantidad exacta de inscriptos que puede
//llegar a haber. Desde la Federación de Colectividades (Organismo que organiza),
//manifestaron que se solicitan los siguientes datos para la inscripción de cada participante:
//dni, nombre, apellido y edad.
//En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
//• Menores A (de 6 a 10 años)
//• Menores B (de 11 a 17 años)
//• Juveniles (de 18 a 30 años)
//• Adultos (de 31 a 50 años)
//• Adultos mayores (mayores de 50 años)
//Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante,
//se muestre por pantalla a qué categoría debe ser inscripto. Cabe destacar que, al finalizar
//el día, para dar fin a las inscripciones, se debe ingresar un dni con el valor 0 y un nombre
//con la palabra “fin”.
//---------------------------------------------------------
//        System.out.println("Por favor ingrese el DNI, y su nombre, apellido y edad:");
//        Scanner teclado = new Scanner(System.in);
//        int DNI = teclado.nextInt();
//        String nombre = teclado.next();
//        String apellido = teclado.next();
//        int edad = teclado.nextInt();
//        while (edad != 0 && !nombre.equals("fin")) {
//
//            if (edad >= 6 && edad <= 10) {
//                System.out.println("Debe ser inscripto en la categoria Menores A ");
//                System.out.println("Por favor ingrese el DNI, y su nombre, apellido y edad:");
//                DNI = teclado.nextInt();
//                nombre = teclado.next();
//                apellido = teclado.next();
//                edad = teclado.nextInt();
//
//            } else if (edad >= 11 && edad <= 17) {
//                System.out.println("Debe ser inscripto en ls categoria Menores B ");
//                 System.out.println("Por favor ingrese el DNI, y su nombre, apellido y edad:");
//                DNI = teclado.nextInt();
//                nombre = teclado.next();
//                apellido = teclado.next();
//                edad = teclado.nextInt();
//            } else if (edad >= 18 && edad <= 30) {
//                System.out.println("Debe ser inscripto en ls categoria Juveniles ");
//                 System.out.println("Por favor ingrese el DNI, y su nombre, apellido y edad:");
//                DNI = teclado.nextInt();
//                nombre = teclado.next();
//                apellido = teclado.next();
//                edad = teclado.nextInt();
//            } else if (edad >= 31 && edad <= 50) {
//                System.out.println("Debe ser inscripto en ls categoria Adultos");
//                 System.out.println("Por favor ingrese el DNI, y su nombre, apellido y edad:");
//                DNI = teclado.nextInt();
//                nombre = teclado.next();
//                apellido = teclado.next();
//                edad = teclado.nextInt();
//            } else if (edad > 50) {
//                System.out.println("Debe ser inscripto en ls categoria Adultos mayores ");
//                 System.out.println("Por favor ingrese el DNI, y su nombre, apellido y edad:");
//                DNI = teclado.nextInt();
//                nombre = teclado.next();
//                apellido = teclado.next();
//                edad = teclado.nextInt();
//            } else {
//                System.out.println("Por favor,  ingrese valores válidos ");
//
//            }
//        }
//    }
//}
//---------------------------------------------------------
//GUIA 1
//2) Una mercería vende canutillos y mostacillas al por mayor mediante su página web. Como se 
//trata de una mercería mayorista, solicita la cantidad de paquetes en cada venta y dependiendo 
//de esta realiza los siguientes controles:
//a) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se 
//permiten compras inferiores a 5 productos.
//b) Si la cantidad de productos es mayor o igual a 5 pero menor o igual a 15: Se debe emitir un 
//mensaje que el costo de envío es de $200.
//c) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se debe emitir un mensaje 
//de que el envío es gratuito.
//Realizar el programa necesario para llevar a cabo los 3 controles citados.

//        System.out.println("Por favor ingrese la cantidad de paquetes de su venta: ");
//        Scanner teclado = new Scanner(System.in);
//        int ventaProductos = teclado.nextInt();
//
//        if (ventaProductos <= 5) {
//            System.out.println("No se permiten compras inferiores a 5 productos");
//        } else if (ventaProductos >= 5 && ventaProductos <= 15) {
//            System.out.println("El costo de envío es de $200");
//        } else if (ventaProductos >= 5 && ventaProductos >15) {
//            System.out.println("El envío es gratuito.");
//        } else {
//            System.out.println("Por favor,  ingrese valores válidos");
//        }
//    }
//}
//----------------------------------------------------------------------------------------
//3) Un instituto de inglés desea informar a sus alumnos los días y horarios de sus clases. Para 
//ello, decidió la creación de una aplicación que, a partir del ingreso de la edad del alumno, le 
//informe en qué días y horarios los alumnos tienen clases. Como información, la academia 
//proporciona los siguientes datos respecto a los grupos y los diferentes horarios.
//a) Kinder (de 4 a 6 años inclusive): Lunes y Miércoles de 16 a 17
//b) 1st year (de 7 a 8 años inclusive): Martes y Jueves de 16:30 a 17:30
//c) 2nd year (de 9 a 10 años inclusive): Martes y Jueves de 17:30 a 19
//d) 3rd year (de 11 a 13 años inclusive): Lunes y Miércoles de 17 a 18:30
//Realizar el programa solicitado por el instituto, donde a partir del ingreso de la EDAD del 
//alumno, el sistema informe por pantalla los días y horarios de cursada

 System.out.println("Por favor ingrese su edad : ");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();

        if (edad >=4 && edad <=6) {
            System.out.println("Lunes y Miércoles de 16 a 17");
        } else if (edad >=7 && edad <=8) {
            System.out.println("Martes y Jueves de 16:30 a 17:30");
        } else if (edad >=9 && edad <=10) {
            System.out.println("Martes y Jueves de 17:30 a 19");
        } else if (edad >=11 && edad <=13) {
            System.out.println("Lunes y Miércoles de 17 a 18:30");
        } else {
            System.out.println("Por favor,  ingrese valores válidos");
        }
    }
}
