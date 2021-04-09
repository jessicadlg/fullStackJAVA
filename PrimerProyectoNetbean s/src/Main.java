
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario 01
 */
public class Main {

    public static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
        //CONDICIONAL SIMPLE:

//        int suma= 0;
//        int num=3;
//        int resta=0;
//        String bloqueif ="";
//        
//        if(num >= 3){
//            suma= num + num;
//            System.out.println("La suma es:" + suma);
//            bloqueif = "IF"; 
//         }else{
//            resta= num  - num;
//            System.out.println("La resta es:" + resta);
//            bloqueif = "ELSE"; 
//        }
//        System.out.println("entro al " + bloqueif);  
        
        //CONDICIONAL MULTIPLE:
        
         int suma= 0;
        int num=1;
        int resta=0;
        String bloqueif ="";
        
        if(num >= 3){
            suma= num + num;
            System.out.println("La suma es:" + suma);
            bloqueif = "IF"; 
         }else{
            if(num == 1){
                System.out.println("el numero es un 1");
                bloqueif ="segundo IF";
            } 
            else{
                System.out.println("el numero es menor o igual a 3 pero no es un 1");
                           bloqueif ="segundo ELSE";

            }
//            resta= num  - num;
//            System.out.println("La resta es:" + resta);
//            bloqueif = "ELSE"; 
        }
        System.out.println("entro al " + bloqueif);  
        
//        int edad = 0;
//        double nota = 0.0;
//        String nombre = "";
//
//        System.out.println("Ingrese su edad");
//        edad=Integer.parseInt(entrada.nextLine());
//        System.out.println("Ingrese su nota");
//        nota=Double.valueOf(entrada.nextLine());
//        System.out.println("Ingrese su nombre");
//        nombre=entrada.nextLine();
//        System.out.println("Su edad es " + edad + ",su nota es " + nota + ",y su nombre es " + nombre);
        
                
//        System.out.println("Hola mundo");  
    
    }
    }
