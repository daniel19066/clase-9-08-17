/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;

public class JavaApplication2 {
    

public static double dineroganado(double dinero, int horast){
    if(horast<=40){
    return dinero*horast;}else{
    if(horast<48){
        return (dinero*40)+(dinero*2*(horast-40));
    }else{
         return (dinero*40)+(dinero*2*8)+(dinero*3*(horast-48));
    }
    }
}

public static void estudiante(){
    int[] rentaliquida=new int[10]; 
    
}
    public static void main(String[] args){
        Scanner flujoen= new Scanner(System.in);
        //variables
        String nombre=null;
        int numhoras=0;
        double valorhora=0;
        double salario=0;
        System.out.println("ingrese el nombre del trabajador:");
        nombre=flujoen.next();
        System.out.println("ingrese el numero de horas trabajadas:");
        numhoras=flujoen.nextInt();
        System.out.println("ingrese valor de cada hora:");
        valorhora=flujoen.nextDouble();
        salario=dineroganado(valorhora, numhoras);
        System.out.println(salario);
    }

}
