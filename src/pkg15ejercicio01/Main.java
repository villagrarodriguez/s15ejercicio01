/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15ejercicio01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        
        System.out.println("Ingrese un numero");
        Integer numero = input.nextInt();
        while(numero.intValue() !=0){
        lista.add(numero);
        numero = input.nextInt();
        }        
        System.out.println("El mayor numero es"+ max(lista));
        // TODO code application logic here
    }
    public static Integer max(ArrayList<Integer> lista) {
        if (lista.size() ==0)
            return null;
        
        Integer max = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) < max)
                max = lista.get(i);
            
            
        }
        
        return max;
   
           
    }
}
